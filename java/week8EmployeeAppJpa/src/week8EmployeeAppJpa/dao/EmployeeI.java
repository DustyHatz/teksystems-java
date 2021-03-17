package week8EmployeeAppJpa.dao;

import java.util.List;
import week8EmployeeAppJpa.entities.Employee;

public interface EmployeeI {

	public int addEmployee(Employee employee);
	public Employee getEmployee(Integer id);
	public int updateEmployeeById(Integer id, Employee employee);
	public String deleteEmployeeById(Integer id);
	public List<Employee> getAllEmployees();
}
