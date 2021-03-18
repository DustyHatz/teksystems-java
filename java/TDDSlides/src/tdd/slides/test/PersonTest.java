package tdd.slides.test;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	
	
	@Test
	public void testGetName() {
	
		// given
		Person person = new Person();
		String expectedName = "Leon";
		person.setName(expectedName);
	
		// when
		String actualName = person.getName();
		
		// then
		Assert.assertEquals(expectedName, actualName);
		
	}
	

}
