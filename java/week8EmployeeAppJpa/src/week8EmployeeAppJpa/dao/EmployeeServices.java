package week8EmployeeAppJpa.dao;

import java.util.List;

import week8EmployeeAppJpa.entities.Employee;

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
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			dispose();
		}
	
		return result;
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		
		Employee employee = null;
		String msg = "Employee not found...";
				
			try {
				
				connect();
				employee = em.find(Employee.class, id);
				
				if(employee != null) {
					
					em.getTransaction().begin();
					em.remove(employee);
					em.getTransaction().commit();
					
					msg = employee.toString();
				
				}
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
			} finally {
				dispose();
			}
			
			return msg;

	}

	@Override
	public List<Employee> getAllEmployees() {


		connect();
		
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		
		return null;
	}
}
