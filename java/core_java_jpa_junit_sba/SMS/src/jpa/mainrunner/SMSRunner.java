package jpa.mainrunner;

import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	// MAIN METHOD
	public static void main(String[] args) {
		
		try {
			
			// create services
			StudentService ss = new StudentService();	
			CourseService cs = new CourseService();
			
			// Open scanner for user input
			Scanner sc = new Scanner(System.in);
			
			// Get user input (must be either 1 or 2)
			int input;
			do {
				System.out.printf("Are you a(n)%n%n");
				System.out.printf("%s %n%s %n %n%s", "1. Student", "2. Quit", "Please enter 1 or 2: ");
				
				while(!sc.hasNextInt()) {
					sc.next();
					System.out.printf("Are you a(n)%n%n");
					System.out.printf("%s %n%s %n %n%s", "1. Student", "2. Quit", "Please enter 1 or 2: ");
				}
				input = sc.nextInt();
				
			} while (input != 1 && input !=2);
			
			switch(input) {
			
			case 1:
				System.out.println("Enter your email: ");
				String userEmail = sc.next();
				System.out.println("Enter your password: ");
				String userPassword = sc.next();
				if (ss.validateStudent(userEmail, userPassword)) {
					
					Student student = ss.getStudentByEmail(userEmail);
					System.out.printf("Welcome, %s!%n%n", student.getsName());
					System.out.printf("Your courses:%n%n");
					// Display headers
					System.out.printf("%-20s %-20s %-20s%n%n", "Course ID", "Course Name", "Instructor Name");
					// Display course information
					for (Course course : student.getsCourses()) {
						System.out.printf("%-20d %-20s %-20s%n", course.getCId(), course.getcName(), course.getcInstructorName());
					}
					
					// Display student options menu (must enter 1 or 2)
					input = 0;
					do {
						System.out.printf("%n%s%n", "1. Register to course");
						System.out.printf("%s%n", "2. Logout");
						while(!sc.hasNextInt()) {
							sc.next();
							System.out.printf("%n%s%n", "1. Register to course");
							System.out.printf("%s%n", "2. Logout");
						}
						input = sc.nextInt();	
					} while (input != 1 && input !=2);
					
					switch(input) {
					
					case 1:
						
						System.out.println("List of all courses:");
						// Display headers
						System.out.printf("%-20s %-20s %-20s%n%n", "Course ID", "Course Name", "Instructor Name");
						// Display course information
						for (Course course : cs.getAllCourses()) {
							System.out.printf("%-20d %-20s %-20s%n", course.getCId(), course.getcName(), course.getcInstructorName());
						}
						
						// Register to a course
						System.out.printf("%nEnter a Course ID to register: %n");
						input = sc.nextInt();
						ss.registerStudentToCourse(userEmail, input);
						
						// Display student's courses
						System.out.printf("Your courses: %n%n");
						// Display headers
						System.out.printf("%-20s %-20s %-20s%n%n", "Course ID", "Course Name", "Instructor Name");
						// Display student's course information
						for (Course course : ss.getStudentCourses(student.getsEmail())) {
							System.out.printf("%-20d %-20s %-20s%n", course.getCId(), course.getcName(), course.getcInstructorName());
						}
						
						System.out.printf("%nYou have been logged out...bye bye bye.");
						sc.close();
						break;
						
					case 2:
						System.out.println("You have been logged out...bye bye bye.");
						sc.close();
						break;
					}
					break;
					
					
				} else {
					System.out.println("Error: Incorrect Username or Password...bye bye bye.");
					sc.close();
					break;
				}
				
				
			case 2:
				System.out.println("Bye Bye Bye");
				sc.close();
				break;
			}
			
		} catch (Exception e) {
			System.out.println("Please Try Again: Must enter the required datatype (integer, email, password)");
		}
	}

}
