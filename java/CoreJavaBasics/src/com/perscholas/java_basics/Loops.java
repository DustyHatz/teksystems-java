package com.perscholas.java_basics;

public class Loops {

	public static void main(String[] args) {
		// printTen();
		everyTenth();
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

}
