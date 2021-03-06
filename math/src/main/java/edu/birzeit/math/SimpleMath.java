package edu.birzeit.math;

import javafx.scene.control.SplitPane.Divider;

/**
 * Class for simple mathematical calculations.<br/>
 * implemented for in-class exercise This package cannot accept String in the
 * params
 *
 * @since 2018-11
 * @version 1.0
 */

public class SimpleMath {
	// CONSTANTS
	// ------------------------------------------
	// METHODS
	// ------------------------------------------

	/**
	 * Add Two numbers.
	 *
	 * @param number
	 *            one, number two
	 * @return Addition of the two numbers
	 * 
	 */
	// TO DO
	// This method needs refactoring -

	public static <T> T add(final Number number1, final Number number2) {

		if (number1.getClass() == Integer.class) {
			// With auto-boxing / unboxing
			return (T) (Integer) (number1.intValue() + number2.intValue());
		} else if (number1.getClass() == Double.class) {
			// Without auto-boxing / unboxing
			return (T) (Double) (number1.doubleValue() + number2.doubleValue());
		} else if (number1.getClass() == Long.class) {
			// Without auto-boxing / unboxing
			return (T) (Long)(number1.longValue() +  number2.longValue());
		}
		
		return null;
	}
	
	// Calculate average of two number
	public static double average_Qais (double firstNumber, double secondNumber)
    {
        return (firstNumber + secondNumber ) / 2;
    }
	
	
	
	public static double factorial_lena(final double number)
	{

		if (number <= 1)
			return 1;

		return number * factorial_lena(number - 1);
	}

	public int sinX_hadiAwad(final double number) {
		double radians = Math.toRadians(number);
		return (int) Math.sin(radians);
	}
	
	public static double division_layalizidan(final double firstNumber, final double secondNumber){
		double result = 0;
		if(secondNumber == 0){
			throw new ArithmeticException("Division by zero!");
		}else{
			result = firstNumber/secondNumber;
		}
		return result;
	}
	
	public double pow_ahdRadwan(final double number, final double power) {
		return (double) Math.pow(number, power);
	}
	
	
	

	public static double squareRoot_BaraaAyyash(final Number number) {
		return Math.sqrt(number.doubleValue());
	}
	public static <T> T subtract_Samaher(final T number1, final T number2) {

		T result = null;

		if (number1.getClass() == Integer.class) {
			result = (T) (Integer) ((Integer) number1 - (Integer) number2);
		}
		else if (number1.getClass() == Double.class) {
			result = (T) Double.valueOf(((Double) number1).doubleValue() - ((Double) number2).doubleValue());
		}
		else if (number1.getClass() == Long.class) {
			result = (T) Long.valueOf(((Long) number1).longValue() - ((Long) number2).longValue());
		}

		return result;

	}
	
	public static Double power_HadeelEhmouda(final Double base, final Double number) {

		return Math.pow(number, base);

	}
	
	public static double factorial_TimothyGhanim(double number) {
		double result = 1;
		while(number > 1) {
			result *= number;
			number--;
		}
		return result;
	}

	public static Integer subInteger_mohammed_abuaisha(Integer number1, Integer number2) {
		Integer result = number1 - number2;
		return result;
	}
	
	public static Integer multiply_mohammed_anan(Integer number1, Integer number2) {
		Integer result = number1 * number2;
		return result;
	}
	
}
