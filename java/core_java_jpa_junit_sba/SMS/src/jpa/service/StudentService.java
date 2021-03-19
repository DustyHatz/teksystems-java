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
		
		String getAllStudents = "SELECT s FROM STUDENT s";
		
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}
