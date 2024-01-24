import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Classes {
	private int calculateScore(Object Applicant) {
		//Do all calculations here
		return 69;
	}
	
	public ArrayList<Applicant> readFile() throws IOException{
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
			int score = calculateScore(currentApplicant);
			if(score > 68) {
				currentApplicant.setScore(score);
				data.add(currentApplicant);
			}
		}
		
		input.close();
		return data;
	}
	
	public void writeFile(ArrayList<Applicant> data) throws IOException{
		FileWriter fw = new FileWriter ("output//test.txt", false);
		PrintWriter pw = new PrintWriter (fw);
		
		pw.println("First Name          |Last Name           |  Age|Score");
		pw.println("--------------------+--------------------+-----+-----");
		for(int i = 0; i < data.size(); i++) {	
			pw.printf("%-21s",data.get(i).getFirstName());
			pw.printf("%-20s",data.get(i).getLastName());
			pw.printf("%6s",data.get(i).getAge());
			pw.printf("%6s",data.get(i).getScore());
			pw.println("");
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
public static int educationPoints(Applicant applicant) {
    String education = applicant.getEducation();
    int educationPoints = 0;
    
    switch(education) {
    case("Secondary school (high school diploma)"):
    	educationPoints = 5;
    case("One-year degree, diploma or certificate"):
    	educationPoints = 15;
    case("Two-year degree, diploma or certificate"):
    	educationPoints = 19;
    case("Bachelor's degree or other programs (three or more years)"):
    	educationPoints = 21;
    case("Two or more certificates, diplomas, or degrees"):
    	educationPoints = 22;
    case("Professional degree needed to practice in a licensed profession"):
    	educationPoints = 23;
    case("University degree at the Master's level"):
    	educationPoints = 23;
    case("University degree at the Doctoral (PhD) level"):
    	educationPoints = 25;
    default:
    	educationPoints = 0;
    }

    return educationPoints;
}



public static int workExperiencePoints(Applicant applicant) {
    int workExperience = applicant.getWorkExperience();
    int workExperiencePoints = 0;

    if (workExperience == 1) {
        workExperiencePoints = 9;
    } else if (workExperience <= 3) {
        workExperiencePoints = 11;
    } else if (workExperience <= 5) {
        workExperiencePoints = 13;
    } else if (workExperience > 5) {
        workExperiencePoints = 15;
    }

    return workExperiencePoints;
}

public static int agePoints(Applicant applicant) {
    int age = applicant.getAge();
    int agePoints = 0;

    if (age < 18) {
        agePoints = 0;
    } else if (age >= 18 && age <= 35) {
        agePoints = 12;
    } else if (age < 47) {
        agePoints = 47 - age;
    } else {
        agePoints = 0;
    }
    	

    return agePoints;
}

public static int arrangedWorkPoints(Applicant applicant) {
    int arrangedWorkPoints = "true" == applicant.getArrangedEmployment() ? 10 : 0;
    return arrangedWorkPoints;
}

public static int adaptabilityPoints(Applicant applicant) {
    int adaptabilityScore = 0;

    if ("true" == applicant.getAdaptabilitySpouseLanguage()) {
        adaptabilityScore += 5;
    }
    if ("true" == applicant.getAdaptabilitySpouseEducation()) {
        adaptabilityScore += 5;
    }
    if ("true" == applicant.getAdaptabilitySpouseWork()) {
        adaptabilityScore += 5;
    }
    if ("true" == applicant.getAdaptabilityYouEducation()) {
        adaptabilityScore += 5;
    }
    if ("true" == applicant.getAdaptabilityYouWork()) {
        adaptabilityScore += 10;
    }
    if ("true" == applicant.getAdaptabilityYouEmployment()) {
        adaptabilityScore += 5;
    }
    if ("true" == applicant.getAdaptabilityRelatives()) {
        adaptabilityScore += 5;
    }

    return adaptabilityScore >= 10 ? 10 : adaptabilityScore;
}
}
