package Testgroup.TestRegExWork;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest2 {

	@DataProvider
	public static Object[][] emails() {
		return new 	Object[][] {
			{"email1@gmail.com", Boolean.TRUE},
			{"email1@gmail.com,", Boolean.TRUE},
			{"email1@gmail.com,email11111@gmail.com", Boolean.TRUE},
			{" ", Boolean.FALSE},
			{"email1@gmail.com1", Boolean.FALSE},
			{"email1@gmail.co", Boolean.FALSE},
			{"email1@gmailcom", Boolean.FALSE},
			{"email1@mail.com", Boolean.FALSE},
			{"email1@mail.com,email1@gmail.com", Boolean.FALSE}
		};
	}		
	
	@Test(dataProvider = "emails")
	public static void unitTestForMatchMail(String email, Boolean ExpectedResults) {
		System.out.println("Input: " + email + ", Expecting: " + ExpectedResults.toString());
		Assert.assertEquals((Boolean) App.matchMail(email), ExpectedResults);
	}
	
}
