package week8EmployeeAppJpaJunit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week8EmployeeAppJpaJunit.dao.EmployeeServices;
import week8EmployeeAppJpaJunit.entities.Employee;

class TestEmployeeServices {
	
	static EmployeeServices employeeServices = new EmployeeServices();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddEmployee() {

		//fail("Not yet implemented");
		//assertTrue(true);
		
		//1. Prepare expected - Given
		//2. Prepare current or actual - When ==> current data in entity
		//3. Assert - Then
		
		Employee employee = new Employee(902, "Dustin", "Hatzenbuhler", 9001.00);
		int expectedResult = 1;
		
		int actualResult = employeeServices.addEmployee(employee);
		
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void testGetEmployee() {
		//fail("Not yet implemented");
		//assertTrue(true);
		
		Employee expectedEmployee = new Employee(902, "Dustin", "Hatzenbuhler", 9001.00);
		
		Employee actualEmployee = employeeServices.getEmployee(902);
		
		assertEquals(expectedEmployee, actualEmployee);

	}

	@Test
	void testUpdateEmployeeById() {
		//fail("Not yet implemented");
		//assertTrue(true);
		
		Employee newEmployee = new Employee(902, "Dustin", "Hatzenbuhler", 9002.00);
		
		int actualResult = employeeServices.updateEmployeeById(902, newEmployee);
		
		assertEquals(1, actualResult);		

	}

	@Test
	void testDeleteEmployeeById() {
		//fail("Not yet implemented");
		//assertTrue(true);
		
		
		Employee expectedEmployee = new Employee(902, "Dustin", "Hatzenbuhler", 9002.00);

		Employee actualEmployee = employeeServices.deleteEmployeeById(902);
		
		assertEquals(expectedEmployee, actualEmployee);

	}

	@Test
	void testGetAllEmployees() {
		//fail("Not yet implemented");
		//assertTrue(true);
		
		List<Employee> expectedEmployees = new ArrayList<>();
		expectedEmployees.add(new Employee(901, "Amy", "Albrecht", 9001.00));
		expectedEmployees.add(new Employee(902, "Dustin", "Hatzenbuhler", 9001.00));
		
		List<Employee> actualEmployees = employeeServices.getAllEmployees();
		
		assertEquals(expectedEmployees, actualEmployees);
		

	}

}
