public class Main {
	public static void main(String[] args) {
		//#1: data - list of the e-mail addresses. task - to check whether all of the e-mails send to @gmail.com
		//to check compliance of the line and expression
		String line = "email1@gmail.com,emai111l2@gmail.com,email3@gmail.com,email4@gmail.com,email5@gmail.com,email6@gmail.com";
		
		System.out.println("task #1: data - list of the e-mail addresses. task - to check whether all of the e-mails send to @gmail.com");
		System.out.println("list of the e-mail addresses:");
		System.out.println(line);
		System.out.print("all of the e-mails send to @gmail.com: ");
		System.out.println(matchMail(line));
		System.out.println();
		
		//#2: data - text. task - to delete the last d or D in the text
		//to replace the regex with some part of it
		String text = "dDdDdDdDxxxxxxxxx\ndDdDdDdDxxxxxxxxx\ndDdDdDdDdddddddxxxxxxxxx";

		
		System.out.println("task #2: data - text. task - to delete the last d or D in the text");
		System.out.println("old text: ");
		System.out.println(text);
		System.out.println();
		System.out.println("new text: ");
		System.out.println(replaseLastD(text));
		System.out.println();
		
		//#3: data - text with some number. task - to check whether the number accepts value within 0.00-1600.00
		//to check compliance of the line and expression
		line = "Amount: 1600";
		
		
		System.out.println("task #3: data - text with some number. task - to check whether the number accepts value within 0.00-1600.00");
		System.out.println("text with some number: ");
		System.out.println(line);
		System.out.print("the number accepts value within 0.00-1600.00: ");		
		System.out.println(matchNumber(line));
		System.out.println();
	
		//TESTS
		System.out.println("TestMatchMail test:");
		TestMatchMailPositive1();
		TestMatchMailPositive2();
		TestMatchMailPositive3();
		TestMatchMailNegative1();
		TestMatchMailNegative2();
		TestMatchMailNegative3();
		TestMatchMailNegative4();
		TestMatchMailNegative5();

	}

	//to check compliance of the line and expression
	public static boolean matchMail(String line) {
		String regex = "^(?:[^,]+@gmail.com,?)*$";
		return line.matches(regex);
	}
	
	//to replace the regex with some part of it	
	public static String replaseLastD(String text){
		String regex = "(?is)^(.*)d";
		return text.replaceAll(regex, "$1");
	}
	
	//to check compliance of the line and expression
	public static boolean matchNumber(String line) {
		String regex = "^(?:Amount: )?(?:(?:[0-9]{1,3}(?:\\.[0-9]{1,2})?)|(?:1[0-5](?:[0-9]{2})(?:\\.[0-9]{1,2})?)|1600(?:\\.0{1,2})?)$";
		return line.matches(regex);
	}
	
	
	//TESTS
	public static void TestMatchMailPositive1() {
		boolean result = matchMail("email1@gmail.com");
		if (result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}

	public static void TestMatchMailPositive2() {
		boolean result = matchMail("email1@gmail.com,");
		if (result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}
	public static void TestMatchMailPositive3() {
		boolean result = matchMail("email1@gmail.com,email11111@gmail.com");
		if (result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}
	
	public static void TestMatchMailNegative1() {
		boolean result = matchMail(" ");
		if (!result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}
	
	public static void TestMatchMailNegative2() {
		boolean result = matchMail("email1@gmail.com1");
		if (!result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}
	
	public static void TestMatchMailNegative3() {
		boolean result = matchMail("email1@gmail.co");
		if (!result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}

	public static void TestMatchMailNegative4() {
		boolean result = matchMail("email1@gmailcom");
		if (!result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}
	
	public static void TestMatchMailNegative5() {
		boolean result = matchMail("email1@mail.com");
		if (!result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}
	
	public static void TestMatchMailNegative6() {
		boolean result = matchMail("email1@mail.com,email1@gmail.com");
		if (!result) {
			System.out.println("pass");	
		} else {
			System.out.println("bug");	
		}
	}
}

