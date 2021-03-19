package jpa.dao;

public interface StudentDAO {

	List<Student> getAllStudents();
	
	Student getStudentByEmail();
	
	boolean validateStudent();
	
	void registerStudentToCourse();
	
	List<Course> getStudentCourse();
	
}
