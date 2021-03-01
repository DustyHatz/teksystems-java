package com.perscholas.java_basics;

public class Arrays {

	public static void main(String[] args) {

		arrayOfThree();
	}

	/*
	 * Write a program that creates an array of integers with a length of 3. Assign
	 * the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
	private static void arrayOfThree() {

		int[] three = new int[] { 1, 2, 3 };

		for (int num : three) {
			System.out.println(num);
		}
	}

}
