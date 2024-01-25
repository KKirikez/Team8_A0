import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Classes {
	private int calculateScore(Applicant applicant) {
//		Calculates the score for each applicant
		int points = 0;
		
		points += languagePoints(applicant);
    	points += educationPoints(applicant);
    	points += workExperiencePoints(applicant);
    	points += agePoints(applicant);
    	points += arrangedWorkPoints(applicant);
    	points += adaptabilityPoints(applicant);
		
		return points;
	}
	
	public ArrayList<Applicant> readFile(String filePath) throws IOException{
//		Reads file and returns an arrayList of qualified applicant objects
		
		File inputFile = new File(filePath);
		
		Scanner input = new Scanner (inputFile);
		
		ArrayList<Applicant> data = new ArrayList<>();
		
		
		while (input.hasNext()) {
			String[] currentLine = input.nextLine().split("\t");
			if(currentLine[0].equals("first_name")) {
				continue;
			}
			Applicant currentApplicant = new Applicant(currentLine);
			int score = calculateScore(currentApplicant);
			if(score > 66) {
				currentApplicant.setScore(score);
				data.add(currentApplicant);
			}
		}
		input.close();
		return data;
	}
	
	public void writeFile(ArrayList<Applicant> data, String filePath) throws IOException{
//		Takes in an arrayList of applicants and writes it to a file with proper formatting
		FileWriter fw = new FileWriter (filePath, false);
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
	
	private static int langPointCounter(int input) {
//		Helper function for calculating the language points
		int points = 0;
		if (input == 7) {
	        points += 4;
	    } else if (input == 8) {
	        points += 5;
	    } else if (input >= 9) {
	        points += 6;
	    }
		return points;
	}
	
	public static int languagePoints(Applicant applicant) {
//    Language points calculation for each category
	int languageScore = 0;
    
    // Speaking
    languageScore += langPointCounter(applicant.getSpeak1());
    
    // Listening
    languageScore += langPointCounter(applicant.getListen1());

    // Reading
    languageScore += langPointCounter(applicant.getRead1());
   
    // Writing
    languageScore += langPointCounter(applicant.getWrite1());

    // Secondary Language
    if (applicant.getAll2().equals("yes")) {
        languageScore += 4;
    }

    return languageScore;
	}
	
public static int educationPoints(Applicant applicant) {
//    Calculates education points
	String education = applicant.getEducation();
    int educationPoints = 0;
    
    switch(education) {
    case("Secondary school (high school diploma)"):
    	educationPoints = 5;
    	break;
    case("One-year degree, diploma or certificate"):
    	educationPoints = 15;
    	break;
    case("Two-year degree, diploma or certificate"):
    	educationPoints = 19;
    	break;
    case("Bachelor's degree or other programs (three or more years)"):
    	educationPoints = 21;
    	break;
    case("Two or more certificates, diplomas, or degrees"):
    	educationPoints = 22;
		break;
    case("Professional degree needed to practice in a licensed profession"):
    	educationPoints = 23;
		break;
    case("University degree at the Master's level"):
    	educationPoints = 23;
		break;
    case("University degree at the Doctoral (PhD) level"):
    	educationPoints = 25;
		break;
    default:
    	educationPoints = 0;
    	break;
    }

    return educationPoints;
}



public static int workExperiencePoints(Applicant applicant) {
//    Calculates points for work experience
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
//    Calculates points for age
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
//    Calculates points for arranged work
	int arrangedWorkPoints = "true" == applicant.getArrangedEmployment() ? 10 : 0;
    return arrangedWorkPoints;
}

public static int adaptabilityPoints(Applicant applicant) {
//    Calculates the adaptability points for the applicant
	int adaptabilityScore = 0;

    if (applicant.getAdaptabilitySpouseLanguage().equals("yes")) {
        adaptabilityScore += 5;
    }
    if (applicant.getAdaptabilitySpouseEducation().equals("yes")) {
        adaptabilityScore += 5;
    }
    if (applicant.getAdaptabilitySpouseWork().equals("yes")) {
        adaptabilityScore += 5;
    }
    if (applicant.getAdaptabilityYouEducation().equals("yes")) {
        adaptabilityScore += 5;
    }
    if (applicant.getAdaptabilityYouWork().equals("yes")) {
        adaptabilityScore += 10;
    }
    if (applicant.getAdaptabilityYouEmployment().equals("yes")) {
        adaptabilityScore += 5;
    }
    if (applicant.getAdaptabilityRelatives().equals("yes")) {
        adaptabilityScore += 5;
    }

    return adaptabilityScore >= 10 ? 10 : adaptabilityScore;
}
}
