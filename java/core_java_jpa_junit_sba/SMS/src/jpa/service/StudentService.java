package jpa.service;

import java.sql.ResultSet;
import java.util.List;


import javax.persistence.TypedQuery;

import javax.persistence.Query;

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

		boolean isValid = getAllStudents().stream()
				.anyMatch(students -> students.getsEmail().equals(sEmail) && students.getsPass().equals(sPassword));
		
		if (isValid) {
			System.out.println("Student is valid!");
			return true;
		}
		System.out.println("Student NOT valid!");
		return false;

	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		
		try {
			
			connect();
			em.getTransaction().begin();
			Student student = em.find(Student.class, sEmail);
			List<Course> currentCourses = student.getsCourses();
			Course courseToAdd = em.find(Course.class, cId);
			currentCourses.add(courseToAdd);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			dispose();
		}
		
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}
