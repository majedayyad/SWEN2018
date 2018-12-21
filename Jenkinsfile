
pipeline {
    agent any 
    stages {
        stage('Build') {
                           
            steps {
                echo 'Building..'
                withMaven(maven: 'localMaven', jdk:'localJDK'){
                echo "workspace directory is ${workspace}"
                    dir("math"){
                bat 'mvn clean package'
                bat 'docker build . -t swenapp:${env.BUILD_ID}'
                    }
                }
            }
            post {
                success {
                    echo 'Build was successful...'
                }
            }
        }
         
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
