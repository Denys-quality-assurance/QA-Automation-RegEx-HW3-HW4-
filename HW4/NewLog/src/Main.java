import java.io.File;

public class Main {

	    public static void main(String[] args) {
			File oldLog = new File("Logs.txt");
			File newLog = new File("NewLogs.txt");
	    	CleanLog.CreateCleanLog(oldLog, newLog);
	    }
}
