package jpa.mainrunner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	// MAIN METHOD
	public static void main(String[] args) {

		StudentService ss = new StudentService();	
		
		ss.registerStudentToCourse("aiannitti7@is.gd", 1);
		
	}

}
