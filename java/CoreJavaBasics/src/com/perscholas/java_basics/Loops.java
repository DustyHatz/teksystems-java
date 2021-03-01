package com.perscholas.java_basics;

public class Loops {

	public static void main(String[] args) {
		// printTen();
		// everyTenth();
		// doWhileToTen();
		// multOfFive1();
		// multOfFive2();
		// dayOfWeek();
		// palindrome();
		// fibonacci();
		nestedLoop();
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

	/*
	 * Write a program that returns all the available palindromes within 10 and 200.
	 * The following output will be produced: 11, 22, 33, 44, 55, 66, 77, 88, 99,
	 * 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
	 */

	private static void palindrome() {

		for (int i = 10; i < 200; i++) {

			String num = String.valueOf(i);

			if (num.charAt(0) == num.charAt(num.length() - 1)) {
				System.out.println(num);
			}

		}
	}

	/*
	 * Write a program that prints the Fibonacci Sequence from 0 to 50. The
	 * following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	 */

	private static void fibonacci() {

		int temp1 = 0;
		int temp2 = 1;

		while (true) {

			System.out.println(temp1);

			int temp3 = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp3;

			if (temp1 >= 50) {
				break;
			}

		}

	}

	/*
	 * Write a program that nests a for-loop inside another. Print out the inner and
	 * outer variable (e.g., i or j) in the inner loop (e.g.,
	 * System.out.println("Inner loop: i: " + i + ", j: " + j);).
	 */

	private static void nestedLoop() {

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.println("i:" + i + " j:" + j);
			}
		}

	}
}
