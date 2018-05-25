import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	//to find all regex groups, to create list of all finds
	public static void findAllgroups(String line, Pattern regex, ArrayList<String> listOfFinds) {
		Matcher matcher = regex.matcher(line);
		
        if (matcher.find()) {
        	for (int i=1; i <= matcher.groupCount(); i++) {
        		listOfFinds.add(matcher.group(i));
        	}
        } else {
            System.out.println("No compliance of the line and expression!");
        }
	}
}
