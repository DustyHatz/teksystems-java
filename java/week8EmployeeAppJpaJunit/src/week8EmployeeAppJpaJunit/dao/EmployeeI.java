package week8EmployeeAppJpaJunit.dao;

import java.util.List;

import week8EmployeeAppJpaJunit.entities.Employee;



public interface EmployeeI {

	public int addEmployee(Employee employee);
	public Employee getEmployee(Integer id);
	public int updateEmployeeById(Integer id, Employee employee);
	public Employee deleteEmployeeById(Integer id);
	public List<Employee> getAllEmployees();
}
