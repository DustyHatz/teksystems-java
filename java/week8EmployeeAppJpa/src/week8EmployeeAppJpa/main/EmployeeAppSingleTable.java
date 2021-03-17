package week8EmployeeAppJpa.main;

import week8EmployeeAppJpa.dao.AbstractDao;
import week8EmployeeAppJpa.entities.NonTeachingStaff;
import week8EmployeeAppJpa.entities.Staff;
import week8EmployeeAppJpa.entities.TeachingStaff;

public class EmployeeAppSingleTable extends AbstractDao{

	public static void main(String[] args) {
		System.out.println("STAFF SINGLE TABLE SAMPLE");
		testRegisterStaff();
		System.out.println("Bye Bye");

	}

	private static void testRegisterStaff() {
		
		Staff staff = new Staff(1, "Victoria");
		TeachingStaff teachingStaff = new TeachingStaff(2, "Kevin", "Developer", "Java");
		NonTeachingStaff nonTeachingStaff = new NonTeachingStaff(3, "Bably", "Project Management");
		
		connect();
		
		em.getTransaction().begin();
		
		em.persist(staff);
		em.persist(teachingStaff);
		em.persist(nonTeachingStaff);
		
		em.getTransaction().commit();
		
		dispose();
		
		
	}

}
