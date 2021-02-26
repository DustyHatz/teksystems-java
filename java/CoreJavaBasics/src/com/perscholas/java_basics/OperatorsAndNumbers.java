package com.perscholas.java_basics;

public class OperatorsAndNumbers extends JavaBasicsClass {

	public static void main(String[] args) {

		// intBinaryShiftOne();
		// intBinaryShiftTwo();
		// bitwiseOperator();
		// postfixIncrement();
		multiIncrement();

		/*
		 * #1 Write the following integers in binary notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 1 8 33 78 787 33,987
		 */

		// 1 --> 0000 0001
		// 8 --> 0000 1000
		// 33 --> 0010 0001
		// 78 --> 0100 1110
		// 787 --> 0011 0001 0011
		// 33,987 --> 0100 0010 0110 00011

		/*--------------------------------------------------------------------------------------------------------*/

		/*
		 * #2 Convert the following binary numbers to decimal notation. Do not use any
		 * Java functions or online conversion applications to calculate the answer as
		 * this will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 0010 1001 0011 0100
		 * 0111 0010 0010 0001 1111 0010 1100 0110 0111
		 */

		// 0010 --> 2
		// 1001 --> 9
		// 0011 0100 --> 52
		// 0111 0010 --> 114
		// 0010 0001 1111 --> 543
		// 0010 1100 0110 0111 --> 11,367

		/*--------------------------------------------------------------------------------------------------------*/

		/*
		 * #3 Write a program that declares an integer a variable x and assigns the
		 * value 2 to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation. Do the preceding exercise with the
		 * following values:
		 * 
		 * 9 17 88
		 */

	}

	public static void intBinaryShiftOne() {

		int x = 2;
		String xBin = Integer.toBinaryString(x);

		System.out.println(xBin); // 0010
		System.out.println(x); // 2

		x = x << 1;
		xBin = Integer.toBinaryString(x);

		System.out.println(xBin); // 0100
		System.out.println(x); // 4

		x = 9; // 1001
		x = x << 1;
		xBin = Integer.toBinaryString(x);

		System.out.println(xBin); // 0001 0010
		System.out.println(x); // 18

	}

	/*
	 * Write a program that declares a variable x and assigns 150 to it and prints
	 * out the binary string version of the number. Now use the right shift operator
	 * (>>) to shift by 2 and assign the result to x. Write a comment indicating
	 * what you anticipate the decimal and binary values to be. Now print the value
	 * of x and the binary string. Do the preceding exercise with the following
	 * values:
	 * 
	 * 225 1555 32456
	 */

	public static void intBinaryShiftTwo() {

		int x = 150;
		String xBin = Integer.toBinaryString(x);

		System.out.println(xBin); // 1001 0110
		System.out.println(x); // 150

		x = x >> 2;
		xBin = Integer.toBinaryString(x);

		System.out.println(xBin); // 0010 0101
		System.out.println(x); // 37

		x = 225; // 1110 0001

		x = x >> 2;
		xBin = Integer.toBinaryString(x);

		System.out.println(xBin); // 0011 1000
		System.out.println(x); // 56

	}

	/*
	 * Write a program that declares 3 int variables x, y, and z. Assign 7 to x and
	 * 17 to y. Write a comment that indicates what you predict will be the result
	 * of the bitwise & operation on x and y. Now use the bitwise & operator to
	 * derive the decimal and binary values and assign the result to z. Now, with
	 * the preceding values, use the bitwise | operator to calculate the “or” value
	 * between x and y. As before, write a comment that indicates what you predict
	 * the values to be before printing them out.
	 */

	public static void bitwiseOperator() {

		int x = 7; // 0000 0111
		int y = 17; // 0001 0001
		int z;

		z = 7 & 17; // true?

		System.out.println(z);

		z = 7 | 17; // 23?

		System.out.println(z);

	}

	/*
	 * Write a program that declares an integer variable, assigns a number, and uses
	 * a postfix increment operator to increase the value. Print the value before
	 * and after the increment operator.
	 */

	public static void postfixIncrement() {

		int x = 3;

		System.out.println(x);

		x++;

		System.out.println(x);

	}

	/*
	 * Write a program that demonstrates at least 3 ways to increment a variable by
	 * 1 and does this multiple times. Assign a value to an integer variable, print
	 * it, increment by 1, print it again, increment by 1, and then print again.
	 */

	public static void multiIncrement() {

		int x = 3;
		System.out.println(x);

		x++;
		System.out.println(x);

		++x;
		System.out.println(x);

		x += 1;
		System.out.println(x);

	}

}
