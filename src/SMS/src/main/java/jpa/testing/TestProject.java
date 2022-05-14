package jpa.testing;


import jpa.mainrunner.SMSRunner;
import jpa.entitymodels.Student;
import jpa.service.StudentService;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class TestProject {

	@Test
	public void testGetStudentByEmail() {
		//given
		String emailString = "ljiroudek8@sitemeter.com";
		Student student = new StudentService().getStudentByEmail(emailString);
		
		//Correct Name to test
		String expectedName = "Laryssa Jiroudek";
		
		//Incorrect Name to test
//		String expectedName = "Wrong Name";
		
		
		//when
		String actualName = student.getsName();
		
		//then
		Assert.assertEquals(expectedName, actualName);
	}
}
