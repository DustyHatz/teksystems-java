package com.perscholas.java_basics;

public class Arrays {

	public static void main(String[] args) {

		// arrayOfThree();
		// middleElement();
		cloneArray();
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

	/*
	 * Write a program that returns the middle element in an array. Give the
	 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
	 * following output: 7
	 */
	private static void middleElement() {

		int[] array = new int[] { 13, 5, 7, 68, 2 };

		System.out.println(array[array.length / 2]);

	}

	/*
	 * Write a program that creates an array of String type and initializes it with
	 * the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
	 * Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
	 * the new array to verify that the original array was copied.
	 */

	private static void cloneArray() {

		String[] array = new String[] { "red", "green", "blue", "yellow" };

		System.out.println(array.length);

		String[] array2 = array.clone();

		for (String color : array2) {
			System.out.println(color.toString());
		}
	}

}
