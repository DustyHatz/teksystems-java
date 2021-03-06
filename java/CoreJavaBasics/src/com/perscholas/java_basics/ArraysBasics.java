package com.perscholas.java_basics;

import java.util.Arrays;

public class ArraysBasics {

	public static void main(String[] args) {

		// arrayOfThree();
		// middleElement();
		// cloneArray();
		// indexOutOfBounds();
		// assignIndexLoop();
		// assignIndexX2();
		// notMiddleIndex();
		// swapFirstMiddle();
		// sortBiggestSmallest();
		arrayDifferentTypes();
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

	/*
	 * Write a program that creates an integer array with 5 elements (i.e.,
	 * numbers). The numbers can be any integers. Print out the value at the first
	 * index and the last index using length - 1 as the index. Now try printing the
	 * value at index = length ( e.g., myArray[myArray.length ] ). Notice the type
	 * of exception which is produced. Now try to assign a value to the array index
	 * 5. You should get the same type of exception.
	 */
	private static void indexOutOfBounds() {

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		System.out.println(array[0]);
		System.out.println(array[array.length - 1]);
		System.out.println(array[array.length]); // ArrayIndexOutOfBoundsException
		array[5] = 3; // ArrayIndexOutOfBoundsException

	}

	/*
	 * Write a program where you create an integer array with a length of 5. Loop
	 * through the array and assign the value of the loop control variable (e.g., i)
	 * to the corresponding index in the array.
	 */
	private static void assignIndexLoop() {

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

	}

	/*
	 * Write a program where you create an integer array of 5 numbers. Loop through
	 * the array and assign the value of the loop control variable multiplied by 2
	 * to the corresponding index in the array.
	 */
	private static void assignIndexX2() {

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
			System.out.println(array[i]);
		}

	}

	/*
	 * Write a program where you create an array of 5 elements. Loop through the
	 * array and print the value of each element, except for the middle (index 2)
	 * element.
	 */
	private static void notMiddleIndex() {

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {

			if (i != array.length / 2) {
				System.out.println(array[i]);
			}
		}

	}

	/*
	 * Write a program that creates a String array of 5 elements and swaps the first
	 * element with the middle element without creating a new array.
	 */
	private static void swapFirstMiddle() {

		String[] array = new String[] { "First", "Second", "Middle", "Fourth", "Last" };

		String temp = array[0];
		array[0] = array[array.length / 2];
		array[array.length / 2] = temp;

		for (String word : array) {
			System.out.println(word);
		}

	}

	/*
	 * Write a program to sort the following int array in ascending order: {4, 2, 9,
	 * 13, 1, 0}. Print the array in ascending order, print the smallest and the
	 * largest element of the array. The output will look like the following: Array
	 * in ascending order: 0, 1, 2, 4, 9, 13
	 * 
	 * The smallest number is 0
	 * 
	 * The biggest number is 13
	 */
	private static void sortBiggestSmallest() {

		int[] array = new int[] { 4, 2, 9, 13, 1, 0 };

		Arrays.sort(array);

		int smallest = array[0];
		int biggest = array[array.length - 1];

		System.out.print("Array in ascending order: ");
		for (int num : array) {
			System.out.print(num + ", ");
		}
		System.out.println();
		System.out.println("The smallest number is " + smallest);
		System.out.println("The biggest number is " + biggest);

	}

	/*
	 * Create an array that includes an integer, 3 strings, and 1 double. Print the
	 * array.
	 */
	private static void arrayDifferentTypes() {

		Object[] types = new Object[] { 1, "two", "three", "four", 5.0 };

		for (int i = 0; i < types.length; i++) {
			System.out.println(types[i]);
		}

	}
}
