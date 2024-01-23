import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Classes {
	public static ArrayList<Applicant> readFile() throws IOException{
//		Reads file and returns an array of applicant objects
		
		File inputFile = new File("input/dataset-10.txt");
		
		Scanner input = new Scanner (inputFile);
		
		ArrayList<Applicant> data = new ArrayList<>();
		
		while (input.hasNext()) {
			String[] currentLine = input.nextLine().split("\t");
			if(currentLine[0].equals("first_name")) {
				continue;
			}
			Applicant currentApplicant = new Applicant(currentLine);
			data.add(currentApplicant);
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
	
	public static int languagePoints(Applicant applicant) {
    int languageScore = 0;

    // Speaking
    if (applicant.getSpeak1() == 7) {
        languageScore += 4;
    } else if (applicant.getSpeak1() == 8) {
        languageScore += 5;
    } else if (applicant.getSpeak1() >= 9) {
        languageScore += 6;
    }

    // Listening
    if (applicant.getListen1() == 7) {
        languageScore += 4;
    } else if (applicant.getListen1() == 8) {
        languageScore += 5;
    } else if (applicant.getListen1() >= 9) {
        languageScore += 6;
    }

    // Reading
    if (applicant.getRead1() == 7) {
        languageScore += 4;
    } else if (applicant.getRead1() == 8) {
        languageScore += 5;
    } else if (applicant.getRead1() >= 9) {
        languageScore += 6;
    }

    // Writing
    if (applicant.getWrite1() == 7) {
        languageScore += 4;
    } else if (applicant.getWrite1() == 8) {
        languageScore += 5;
    } else if (applicant.getWrite1() >= 9) {
        languageScore += 6;
    }

    // Secondary Language
    if (applicant.getAll2().equals("yes")) {
        languageScore += 4;
    }

    return languageScore;
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
