package week8EmployeeAppJpa.main;

import week8EmployeeAppJpa.dao.EmployeeServices;
import week8EmployeeAppJpa.entities.Employee;

public class EmployeeApp {
	
	static EmployeeServices employeeServices = new EmployeeServices();


	public static void main(String[] args) {
		// Invoke the transactions

		// menu()
		System.out.println("Welcome!");
		int operation = 1;
		
		Employee employee = new Employee(5, "Conor", "Trader", 100.00); // coming from the views
		
		switch (operation) {
		case 1:
			registerEmployee(employee); // Create
			break;
		case 2:
			showEmployeeById(5); // View - DQL
			break;
		case 3:
			editEmployeeById(); // Update - DML
			break;
		case 4:
			removeEmployeeById(4); // Delete - DML
			break;
		case 5:
			showAllEmployees(); // View - DQL
			break;
		case 6:
			exitApp();
			break;
		default:
			break;
		}

	}
	

	private static void exitApp() {
		System.out.println("Goodbye...");
	}
	
	private static void showAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	private static void removeEmployeeById(int id) {
		
		String result = employeeServices.deleteEmployeeById(id);
		System.out.println(result);
		
	}

	private static void editEmployeeById() {
		// TODO Auto-generated method stub
		
	}

	private static void showEmployeeById(Integer id) {
		Employee employee = employeeServices.getEmployee(id);
		System.out.println(employee);
		
	}

	private static void registerEmployee(Employee newEmployee) {
				
		// business logic (employee is valid, salary is correct, etc...)
		
		int result = employeeServices.addEmployee(newEmployee);
		System.out.println(result == 1? "Employee something..." : "Employee something else...");
	}

}
