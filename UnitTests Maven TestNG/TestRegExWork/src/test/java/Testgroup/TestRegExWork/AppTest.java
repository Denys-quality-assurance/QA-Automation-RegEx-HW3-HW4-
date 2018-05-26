package Testgroup.TestRegExWork;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest 

{
	@Test
		public static void unitTestForMatchMailTrue1() {
			Assert.assertTrue(App.matchMail("email1@gmail.com"));
		}
	
	
	@Test
		public static void unitTestForMatchMailTrue2() {
		Assert.assertTrue(App.matchMail("email1@gmail.com,"));
		}
	@Test
		public static void unitTestForMatchMailTrue3() {
		Assert.assertTrue(App.matchMail("email1@gmail.com,email11111@gmail.com"));
		}	
	
	@Test	
	public static void unitTestForMatchMailFalse1() {
		Assert.assertFalse(App.matchMail(" "));
		}
		
	@Test		
	public static void unitTestForMatchMailFalse2() {
		Assert.assertFalse(App.matchMail("email1@gmail.com1"));
		}

	@Test		
	public static void unitTestForMatchMailFalse3() {
		Assert.assertFalse(App.matchMail("email1@gmail.co"));
		}
	
	@Test		
	public static void unitTestForMatchMailFalse4() {
		Assert.assertFalse(App.matchMail("email1@gmailcom"));
		}
	
	@Test		
	public static void unitTestForMatchMailFalse5() {
		Assert.assertFalse(App.matchMail("email1@mail.com"));
		}
	
	@Test		
	public static void unitTestForMatchMailFalse6() {
		Assert.assertFalse(App.matchMail("email1@mail.com,email1@gmail.com"));
		}

}
