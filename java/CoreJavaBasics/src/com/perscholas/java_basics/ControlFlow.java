package com.perscholas.java_basics;

public class ControlFlow {

	public static void main(String[] args) {

		//lessThanTen();
		lessGreaterThanTen();
	}

	/*
	 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
	 * Write an if statement to print out “Less than 10” if x is less than 10.
	 * Change x to equal 15 and notice the result (console should not display
	 * anything).
	 */

	public static void lessThanTen() {

		int x = 7;
		// int x = 15;

		if (x < 10) {
			System.out.println("Less than 10");

		}

	}

	/*
	 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
	 * Write an if-else statement that prints out “Less than 10” if x is less than
	 * 10 and “Greater than 10” if x is greater than 10. Change x to 15 and notice
	 * the result.
	 */

	public static void lessGreaterThanTen() {

		int x = 7;
		//int x = 15;

		if (x < 10) {
			System.out.println("Less than 10");

		} else {
			System.out.println("Greater than 10");
		}

	}
}
