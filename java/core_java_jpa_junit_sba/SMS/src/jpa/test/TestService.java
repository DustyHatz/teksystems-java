
package jpa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import jpa.service.StudentService;

class TestService {

	StudentService ss = new StudentService();
	

//	Tests Validate with Correct email and password
	@Test
	void testValidateStudentCorrectInfo() {

		String studentEmail = "aiannitti7@is.gd";
		String studentPassword = "TWP4hf5j";

		Boolean expectedResult = true;
		Boolean actualResult = ss.validateStudent(studentEmail, studentPassword);
		assertEquals(expectedResult, actualResult);

	}

}