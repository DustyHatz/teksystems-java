package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {

		// addInt();
		// addDouble();
		// addDoubleInt();
		// divideInt();
		// divideDouble();
		// intAssign();
		constant();
	}

	/*
	 * Write a program that declares 2 integer variables, assigns an integer to
	 * each, and adds them together. Assign the sum to a variable. Print out the
	 * result.
	 */
	private static void addInt() {

		int a;
		int b;

		a = 5;
		b = 1;

		int result = a + b;

		System.out.println(result);

	}

	/*
	 * Write a program that declares 2 double variables, assigns a number to each,
	 * and adds them together. Assign the sum to a variable. Print out the result.
	 */
	private static void addDouble() {

		double a;
		double b;

		a = 5.0;
		b = 1.0;

		double result = a + b;

		System.out.println(result);

	}

	/*
	 * Write a program that declares an integer variable and a double variable,
	 * assigns numbers to each, and adds them together. Assign the sum to a
	 * variable. Print out the result. What variable type must the sum be?
	 */
	private static void addDoubleInt() {

		int a = 5;
		double b = 1.0;

		double result = a + b; // Result must be of type double

		System.out.println(result);

	}

	/*
	 * Write a program that declares 2 integer variables, assigns an integer to
	 * each, and divides the larger number by the smaller number. Assign the result
	 * to a variable. Print out the result. Now change the larger number to a
	 * decimal. What happens? What corrections are needed?
	 */
	private static void divideInt() {

		int a = 5;
		int b = 2;

		double c = 5.0;
		int d = 2;

		System.out.println("int divided by int: " + a / b);
		System.out.println("int divided by double: " + c / d);

	}

	/*
	 * Write a program that declares 2 double variables, assigns a number to each,
	 * and divides the larger by the smaller. Assign the result to a variable. Print
	 * out the result. Now, cast the result to an integer. Print out the result
	 * again.
	 */
	private static void divideDouble() {

		double a = 5.0;
		double b = 2.0;

		double result = a / b;

		System.out.println("double divided by double: " + result);

		int result2 = (int) result; // Cast result to int

		System.out.println("Result after casting to int: " + result2);

	}

	/*
	 * Write a program that declares 2 integer variables, x, and y, and assign 5 to
	 * x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
	 * cast y to a double and assign to q. Print q again.
	 */
	private static void intAssign() {

		int x = 5;
		int y = 6;

		double q = y / x;

		System.out.println(q);

		q = (double) y;

		System.out.println(q);

	}

	/*
	 * Write a program that declares a named constant and uses it in a calculation.
	 * Print the result.
	 */
	private static void constant() {

		final int X = 5;
		int y = 6;

		int result = X + y;

		System.out.println(result);
		
	}

}
