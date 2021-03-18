package week8EmployeeAppJpaJunit.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import week8EmployeeAppJpaJunit.entities.Employee;

public class EmployeeServices extends AbstractDao implements EmployeeI {

	@Override
	public int addEmployee(Employee employee) {
		
		int row = 0;
		
		try {
			
			connect();
			
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			row = 1;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			row = 0;
		} finally {
			dispose();
		}
		
		return row;
	}

	@Override
	public Employee getEmployee(Integer id) {
		
		Employee employee = null;
		
		try {
			
			connect();
			
			employee = em.find(Employee.class, id);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			dispose();
		}
		
		return employee;
	}
	

	@Override
	public int updateEmployeeById(Integer id, Employee newEmployee) {

		Integer result = 0;
		
		try {
			
			connect();
			
			em.getTransaction().begin();
			Employee toChange = em.find(Employee.class, id);
			toChange.setFirstName(newEmployee.getFirstName());
			toChange.setLastName(newEmployee.getLastName());
			toChange.setSalary(newEmployee.getSalary());
			em.persist(toChange);
			em.getTransaction().commit();
			result = 1;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			dispose();
		}
	
		return result;
	}

	@Override
	public Employee deleteEmployeeById(Integer id) {
		
		Employee employee = null;
				
			try {
				
				connect();
				employee = em.find(Employee.class, id);

				em.getTransaction().begin();
				em.remove(employee);
				em.getTransaction().commit();
			
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
			} finally {
				
				dispose();
			}
			
			return employee;

	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employees = null;
		
		connect();
		
		String getAllEmployees = "SELECT e FROM Employee e";
		
		TypedQuery<Employee> query = em.createQuery(getAllEmployees, Employee.class);
		
		employees = query.getResultList();
		
		dispose();
		
		return employees;
		
	}
}
