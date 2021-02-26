package com.perscholas.java_basics;

public class Loops {

	public static void main(String[] args) {
		// printTen();
		// everyTenth();
		// doWhileToTen();
		// multOfFive1();
		// multOfFive2();
		dayOfWeek();
	}

	/*
	 * Write a program that uses a for-loop to loop through the numbers 1-10 and
	 * prints out each number.
	 */
	private static void printTen() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

	/*
	 * Write a program that uses a while loop to loop through the numbers 0-100 in
	 * increments of 10 and prints out each number.
	 */
	private static void everyTenth() {

		int i = 0;

		while (i <= 100) {
			System.out.println(i);
			i += 10;
		}

	}

	/*
	 * Write a program that uses a do-while-loop to loop through the numbers 1-10
	 * and prints out each number.
	 */
	private static void doWhileToTen() {

		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

	}

	/*
	 * Write a program that uses a for-loop to loop through the numbers 1-100. Print
	 * out each number if is a multiple of 5, but do not print out any numbers
	 * between 25 and 75. Use the “continue” statement to accomplish this.
	 */

	private static void multOfFive1() {

		for (int i = 1; i <= 100; i++) {

			if (!(i > 25 && i < 75) && (i % 5 == 0)) {
				System.out.println(i);
			}
		}
	}

	/*
	 * Write a program that uses a for-loop to loop through the numbers 1-100. Print
	 * out each number if is a multiple of 5, but do not print out any numbers
	 * greater than 50. Use the “break” keyword to accomplish this.
	 */

	private static void multOfFive2() {

		for (int i = 1; i <= 100; i++) {

			if (i % 5 == 0) {
				if (i > 50) {
					break;
				}
				System.out.println(i);
			}
		}
	}

	/*
	 * Write a program that uses nested for-loops to output the following: Week 1:
	 * 
	 * Day 1
	 * 
	 * Day 2
	 * 
	 * Day 3
	 * 
	 * Day 4
	 * 
	 * Day 5
	 * 
	 * Week 2:
	 * 
	 * Day 1
	 * 
	 * Day 2
	 * 
	 * Day 3
	 * 
	 * Day 4
	 * 
	 * Day 5
	 */

	private static void dayOfWeek() {

		for (int i = 1; i <= 2; i++) {

			System.out.println("Week " + i);

			for (int j = 1; j <= 5; j++) {
				System.out.println("Day " + j);
			}

		}
	}

}
