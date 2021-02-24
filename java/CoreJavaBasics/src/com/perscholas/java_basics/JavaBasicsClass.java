package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		
		//addInt();
		//addDouble();
		addDoubleInt();
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
		
}
