package com.perscholas.java_basics;

public class Employee {

	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;

	// Constructor method
	public Employee(long id, String name, String address, long phone) {

		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;

	}

	public void calculateSalary() {
		double salary = this.basicSalary + (this.basicSalary * this.specialAllowance / 100)
				+ (this.basicSalary * this.hra / 100);
		
		System.out.println(salary);
	}

}
