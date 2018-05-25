public class Main {
	public static void main(String[] args) {
		//#1: data - list of the e-mail addresses. task - to check whether all of the e-mails send to @gmail.com
		//to check compliance of the line and expression
		String line = "email1@gmail.com,emai111l2@gmail.com,email3@gmail.com,email4@gmail.com,email5@gmail.com,email6@gmail.com";
		String regex = "^(?:[^,]+@gmail.com,?)*$";
		
		System.out.println("task #1: data - list of the e-mail addresses. task - to check whether all of the e-mails send to @gmail.com");
		System.out.println("list of the e-mail addresses:");
		System.out.println(line);
		System.out.print("all of the e-mails send to @gmail.com: ");
		System.out.println(line.matches(regex));
		System.out.println();
		
		//#2: data - text. task - to delete the last d or D in the text
		//to replace the regex with some part of it
		String text = "dDdDdDdDxxxxxxxxx\ndDdDdDdDxxxxxxxxx\ndDdDdDdDdddddddxxxxxxxxx";
		regex = "(?is)^(.*)d";
		
		System.out.println("task #2: data - text. task - to delete the last d or D in the text");
		System.out.println("old text: ");
		System.out.println(text);
		System.out.println();
		System.out.println("new text: ");
		System.out.println(text.replaceAll(regex, "$1"));
		System.out.println();
		
		//#3: data - text with some number. task - to check whether the number accepts value within 0.00-1600.00
		//to check compliance of the line and expression
		line = "Amount: 1600";
		regex = "^(?:Amount: )?(?:(?:[0-9]{1,3}(?:\\.[0-9]{1,2})?)|(?:1[0-5](?:[0-9]{2})(?:\\.[0-9]{1,2})?)|1600(?:\\.0{1,2})?)$";
		
		System.out.println("task #3: data - text with some number. task - to check whether the number accepts value within 0.00-1600.00");
		System.out.println("text with some number: ");
		System.out.println(line);
		System.out.print("the number accepts value within 0.00-1600.00: ");		
		System.out.println(line.matches(regex));
		System.out.println();
	}
}
