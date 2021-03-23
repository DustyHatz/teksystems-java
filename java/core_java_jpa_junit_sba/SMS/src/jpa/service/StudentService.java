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
		
		Student student = getStudentByEmail(sEmail);
		List<Course> coursesToAdd = student.getsCourses();
		
		// check if student exists
		if (student != null) {
			
			try {
				connect();
				
				// Check if student is already registered for the course
				Query check_courses = em.createNativeQuery("SELECT Student_email FROM student_course WHERE Student_email = ? AND sCourses_id = ?");
				check_courses.setParameter(1, sEmail);
				check_courses.setParameter(2, cId);
				
				String result = check_courses.getSingleResult().toString();
				
				if (result != "") {
					
					// get the course object tied to cId
					Course course = em.find(Course.class, cId);
					// add course to sCourses
					coursesToAdd.add(course);
					
					// persist data
					em.getTransaction().begin();
					student.setsCourses(coursesToAdd);
					em.persist(student);
					em.getTransaction().commit();
				}
				System.out.println("Student is already registered!");
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
				dispose();
			}
			dispose();
			System.out.println("Student now registered!");
		} 
		System.out.println("Error: Student not found.");

	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}
