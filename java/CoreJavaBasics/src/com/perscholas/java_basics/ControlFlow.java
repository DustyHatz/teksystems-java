package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {

		// lessThanTen();
		// lessGreaterThanTen();
		// betweenTenAndTwenty();
		// inRange();
		// grades();
		// weekday();

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
		// int x = 15;

		if (x < 10) {
			System.out.println("Less than 10");

		} else {
			System.out.println("Greater than 10");
		}

	}

	/*
	 * Write a program that declares 1 integer variable x, and then assigns 15 to
	 * it. Write an “if-else-if” statement that prints out “Less than 10” if x is
	 * less than 10, “Between 10 and 20” if x is greater than 10 but less than 20,
	 * and “Greater than or equal to 20” if x is greater than or equal to 20. Change
	 * x to 50 and notice the result.
	 */

	public static void betweenTenAndTwenty() {

		int x = 15;

		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");

		}

	}

	/*
	 * Write a program that declares 1 integer variable x, and then assigns 15 to
	 * it. Write an if-else statement that prints “Out of range” if the number is
	 * less than 10 or greater than 20 and prints “In range” if between 10 and 20
	 * (including equal to 10 or 20). Change x to 5 and notice the result.
	 */

	public static void inRange() {

		int x = 15;

		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		} else {
			System.out.println("In range");
		}

	}

	/*
	 * Write a program that uses if-else-if statements to print out grades A, B, C,
	 * D, F according to the following criteria: A: 90-100
	 * 
	 * B: 80-89
	 * 
	 * C: 70-79
	 * 
	 * D: 60-69
	 * 
	 * F: <60
	 * 
	 * Use the Scanner class to accept a number score from the user to determine the
	 * letter grade. Print out “Score out of range.” if the score is less than 0 or
	 * greater than 100.
	 */

	public static void grades() {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter an integer: ");

		int x = scn.nextInt();

		if (x < 60) {
			System.out.println('F');
		} else if (x >= 60 && x <= 69) {
			System.out.println('D');

		} else if (x >= 70 && x <= 79) {
			System.out.println('C');

		} else if (x >= 80 && x <= 89) {
			System.out.println('B');

		} else {
			System.out.println('A');

		}
	}

	/*
	 * Write a program that accepts an integer between 1 and 7 from the user. Use a
	 * switch statement to print out the corresponding weekday. Print “Out of range”
	 * if the number is less than 1 or greater than 7. Don’t forget to include
	 * “break” statements in each of your
	 */

	public static void weekday() {
		Scanner scn = new Scanner(System.in);

		int input;
		do {
			System.out.print("Enter an integer between 1 and 7: ");
			input = scn.nextInt();

			if (input < 1 || input > 7) {
				System.out.println("Out of range!");
			}
		} while (input < 1 || input > 7);

		switch (input) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		}
	}

}
