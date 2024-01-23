import java.io.IOException;
import java.util.ArrayList;

public class AppDriver {
	public static void main(String[] args) throws IOException{
		Classes c = new Classes();
		ArrayList<Applicant> applicants = c.readFile();		
		
		c.writeFile(applicants);
	}
}
