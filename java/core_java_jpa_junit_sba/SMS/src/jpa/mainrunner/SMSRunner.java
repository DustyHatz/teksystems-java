package jpa.mainrunner;

import jpa.entitymodels.Student;
import jpa.service.StudentService;

public class SMSRunner {

	// MAIN METHOD
	public static void main(String[] args) {

		StudentService ss = new StudentService();
		//Student student = ss.getStudentByEmail("cjaulme9@bing.com");
		
		
		
		for (Student s : ss.getAllStudents()) {
			System.out.println(s.getsName());
			
		}
		
	}

}
