package jpa.service;

import java.util.List;

import javax.persistence.TypedQuery;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends HelpersService implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> students = null;
		
		connect();
		
		String getAllStudents = "SELECT s FROM Student s";
		
		TypedQuery<Student> query = em.createQuery(getAllStudents, Student.class);
		
		students = query.getResultList();
		
		return students;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {

		Student student = null;
		
		connect();
		
		student = em.find(Student.class, sEmail);
		
		dispose();

		return student;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		
		// get list of all students
		List <Student> students = getAllStudents();
		// 
		
		if (getStudentByEmail(sEmail) != null) {
			Student studentToValidate = getStudentByEmail(sEmail);
			Student studentInStudents = null;
		
			if (students.contains(studentToValidate)) {
				studentInStudents = studentToValidate;
				
				if (studentInStudents.getsPass().equals(sPassword)) {
					System.out.println("Student is valid!");
					return true;
				}
			}
		} 
		System.out.println("Student NOT valid!");
		return false;
		
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		
		connect();
		
		// if student email exists in student table
		
			// if the 
		
		em.getTransaction().begin();
		em.persist(sEmail);
		em.getTransaction().commit();
		
		dispose();

	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}
