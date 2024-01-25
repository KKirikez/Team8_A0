import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppDriver {
	public static void main(String[] args) throws IOException{
		Classes c = new Classes();
		Scanner input = new Scanner(System.in);
		System.out.print("Provide the name of the input file (located in data\\input\\): ");
	    String inPath = input.nextLine();
	    System.out.print("Provide the name of the output file (to be placed in data\\output\\): ");
	    String outPath = input.nextLine();
//		String inPath = "dataset-full.txt";
//		String outPath = "test.txt";
		
		ArrayList<Applicant> applicants = c.readFile("input/" + inPath);		
		
		c.writeFile(applicants, "output/" + outPath);
		System.out.println("There were " + applicants.size() + " qualified applicants");
		System.out.println("Run Successfully");
	}
}
