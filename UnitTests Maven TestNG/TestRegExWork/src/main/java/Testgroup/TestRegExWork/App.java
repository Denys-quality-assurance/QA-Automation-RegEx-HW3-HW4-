package Testgroup.TestRegExWork;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

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
}
