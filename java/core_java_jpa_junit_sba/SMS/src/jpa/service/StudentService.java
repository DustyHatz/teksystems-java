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

		try {

			connect();

			String getAllStudents = "SELECT s FROM Student s";

			TypedQuery<Student> query = em.createQuery(getAllStudents, Student.class);

			students = query.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return students;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {

		Student student = null;

		try {

			connect();

			student = em.find(Student.class, sEmail);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

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
		// connect to database
		connect();

		if (em.find(Student.class, sEmail) != null && em.find(Course.class, cId) != null) {

			Student student = em.find(Student.class, sEmail);
			Course course = em.find(Course.class, cId);
			List<Course> currentCourses = student.getsCourses();

			if (!currentCourses.contains(course)) {
				try {

					em.getTransaction().begin();
					currentCourses.add(course);
					em.getTransaction().commit();

				} catch (Exception e) {
					System.out.println("Error: Student could not be registered...");
				}
				System.out.printf("Success: %s is now registered for %s%n", student.getsName(), course.getcName());
			} else {
				System.out.printf("Error: %s already registered for %s%n", student.getsName(), course.getcName());
			}
		} else {
			System.out.println("Error: Email or Course ID not found...");
		}
		dispose();
	}
	// 
	@Override
	public List<Course> getStudentCourses(String sEmail) {

		Student student = getStudentByEmail(sEmail);

		System.out.printf("List of courses for %s:%n", student.getsName());

		return student.getsCourses();
	}

}
