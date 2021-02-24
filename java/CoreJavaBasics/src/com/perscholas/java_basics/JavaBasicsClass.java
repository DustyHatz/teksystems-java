package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		
		//addInt();
		//addDouble();
		//addDoubleInt();
		divideInt();
		
	}
	
	
	private static void addInt() {

		int a;
		int b;
		
		a = 5;
		b = 1;
		
		int result = a + b;
		
		System.out.println(result);
		
	}
	

	private static void addDouble() {
		
		double a;
		double b;
		
		a = 5.0;
		b = 1.0;
		
		double result = a + b;
		
		System.out.println(result);
		
	}
	
	
	private static void addDoubleInt() {
		
		int a = 5;
		double b = 1.0;
		
		double result = a + b; // Result must be of type double
		
		System.out.println(result);
		
	}
	
	
	private static void divideInt() {
		
		int a = 5;
		int b = 2;
		
		// Integer division results in Java truncating the decimal portion
		// and does not round to the closest integer
		int result1 = a / b;
		
		
		double c = 5.0; // Data type must be changed to double
		int d = 2;
		
		// Still results in integer division
		int result2 = a / b;
		
		System.out.printf("%d\n%d", result1, result2 );
		
	}
		
}
