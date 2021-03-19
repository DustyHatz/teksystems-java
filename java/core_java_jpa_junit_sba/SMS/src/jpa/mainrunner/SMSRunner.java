package jpa.mainrunner;

import jpa.entitymodels.Course;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	// MAIN METHOD
	public static void main(String[] args) {

		StudentService ss = new StudentService();
		
		System.out.println(ss.validateStudent("aiannitti7@is.gd", "TWP4hf5j"));
		
	}

}
