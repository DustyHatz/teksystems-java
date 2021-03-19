package jpa.mainrunner;

import jpa.entitymodels.Course;
import jpa.service.CourseService;

public class SMSRunner {

	// MAIN METHOD
	public static void main(String[] args) {

		CourseService cs = new CourseService();
		//Student student = ss.getStudentByEmail("cjaulme9@bing.com");
		
		
		
		for (Course c : cs.getAllCourses()) {
			System.out.println(c.getcName());
			
		}
		
	}

}
