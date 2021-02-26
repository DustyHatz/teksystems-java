package com.perscholas.java_basics;

public class Loops {

	public static void main(String[] args) {
		// printTen();
		// everyTenth();
		// doWhileToTen();
		multOfFive1();
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

}














