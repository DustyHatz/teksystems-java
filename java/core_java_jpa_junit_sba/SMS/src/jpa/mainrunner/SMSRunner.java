package jpa.mainrunner;

import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	// MAIN METHOD
	public static void main(String[] args) {

		StudentService ss = new StudentService();	
		CourseService cs = new CourseService();
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Are you a(n)%n%n");
		System.out.printf("%s %n%s %n%s", "1. Student", "2. Quit", "Please enter 1 or 2:");
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1:
			System.out.println("Enter your email: ");
			String userEmail = sc.next();
			System.out.println("Enter your password: ");
			String userPassword = sc.next();
			if (ss.validateStudent(userEmail, userPassword)) {
				
				Student student = ss.getStudentByEmail(userEmail);
				System.out.printf("Welcome, %s!%n%n", student.getsName());
				System.out.printf("Your classes:%n%n");
				// Display Headers
				System.out.printf("%-20s %-20s %-20s%n", "Course ID", "Course Name", "Instructor Name");
				
				for (Course course : student.getsCourses()) {
					System.out.printf("%-20d, %-20s, %-20s%n%n", course.getCId(), course.getcName(), course.getcInstructorName());
				}
				
				// Display student options menu
				System.out.printf("1.");
				
				
			} else {
				System.out.println("Error: Incorrect Username or Password...");
				break;
			}
			
		case 2:
			System.out.println("Bye Bye Bye");
			break;
		
		}
	}

}
