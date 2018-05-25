import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class CleanLog {
	public static void CreateCleanLog(File oldLog, File newLog) {
		//data - file with text of logs. task - to find all necessary logs within file and create a new log file
		//to find all regex groups, to create list of all finds, to write list to the file
		String line = null;
		String regex1 = "^([A-Z][a-z]{2}\\s*[0-9]{1,2}\\s\\d{2}:\\d{2}:\\d{2}\\s).*] (Activity: ).*?(\\[Login Username: .*?\\] )"
				+ ".*?(\\[Data Object: .*?\\] )?.*?(\\[Labels: .*?\\] )?.*?(\\[Records: .*?\\] )?.*?(\\[User Action: .*?\\] )?"
				+ ".*?(\\[User Action Status: .*?\\] )?.*?(\\[Service type: .*?\\] )";
		Pattern myRegex1 = Pattern.compile(regex1);
		String regex2 = ".*?(\\[Mapping Ids: .*?\\] ).*?(\\[URI: .*?\\] )?";
		Pattern myRegex2 = Pattern.compile(regex2);
		ArrayList<String> listOfFinds = new ArrayList<String>();
		
    	System.out.println("Proces is started! Please, wait for the end of process");      	
    	System.out.println("==================================================");
		//read every line in file
		try {
    		BufferedReader reader = new BufferedReader(new FileReader(oldLog));	
    		BufferedWriter writer = new BufferedWriter(new FileWriter(newLog));
    		int lineCount = 0;
    		while ((line = reader.readLine()) != null) {
    			lineCount++;
    			System.out.print("line " + lineCount);
    			RegEx.findAllgroups(line, myRegex1, listOfFinds);
    			RegEx.findAllgroups(line, myRegex2, listOfFinds);
    			System.out.print(" is processed.		");					
    			for(int i = 0; i <11; i++){	
    				if (listOfFinds.get(i) != null) {
    					writer.write(listOfFinds.get(i)); 
						}
					}
    			writer.write(System.getProperty("line.separator"));
    			System.out.println("File NewLogs.txt is updated.");
    			listOfFinds.clear();
				}
            reader.close();
            writer.close();
        } catch (IOException e){
            System.err.println("Error: " +e.getMessage());
        }
		System.out.println("==================================================");
		System.out.println("File NewLogs.txt is created");
		System.out.println("==================================================");
		System.out.println("Process completed!"); 	
	}
}
