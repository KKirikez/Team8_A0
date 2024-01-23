import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Classes {
	public static String[] readFile() throws IOException{
//		Reads file and returns a string
		
		File inputFile = new File("input/dataset-10.txt");
		
		Scanner input = new Scanner (inputFile);
		
		String[] data = {};
		
		while (input.hasNext()) {
			// will need to write to the array
		}
		
		input.close();
		return data;
	}
	
	public void writeFile(String[] data) throws IOException{
		FileWriter fw = new FileWriter ("output//test.txt", true);
		PrintWriter pw = new PrintWriter (fw);
		
		// Find a way to empty the file
		
		pw.println("First Name          |Last Name           |  Age|Score");
		pw.println("--------------------+--------------------+-----+-----");
		for(int i = 0; i < data.length; i++) {
			pw.println(data[i]);
		}
		
		pw.close();
		fw.close();
	}
	
	public static int languagePoints() {
//		Calculates and returns language points
		return 0;
	}
	
	public static int educationPoints() {
		int score = 0;
		
		return score;
	}
	
	public static int workPoints() {
//		Calculates language points
		return 0;
	}
	
	public static int agePoints() {
//		Calculates language points
		return 0;
	}
	
	public static int arrangedWorkPoints() {
//		Calculates language points
		return 0;
	}
	
	public static int adaptabilityPoints() {
//		Calculates language points
		return 0;
	}
}
