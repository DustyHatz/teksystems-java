package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		
		//addInt();
		//addDouble();
		//addDoubleInt();
		//divideInt();
		divideDouble();
		
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
		
		double c = 5.0;
		int d = 2;
		
		System.out.println("int divided by int: " + a / b);
		System.out.println("int divided by double: " + c / d);
				
	}
	
	
	private static void divideDouble() {
		
		double a = 5.0;
		double b = 2.0;
		
		double result = a / b;

		System.out.println("double divided by double: " + result);
		
		int result2 = (int)result; // Cast result to int
		
		System.out.println("Result after casting to int: " + result2);
				
	}
		
}
