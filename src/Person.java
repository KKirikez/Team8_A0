
public class Person {
	private int points;
//	Information 
	private String firstName;
	private String lastName;
	private int age;
	private boolean maritalStatus;
	private int[] languageSkills;
	private String education;
	private int workExperience;
	private boolean arrangedWork;
	private boolean[] adaptability;
	
//	Getters
	public int getPoints() {
		return points;
	}
	public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isMaritalStatus() {
        return maritalStatus;
    }
    public int[] getLanguageSkills() {
        return languageSkills;
    }
    public String getEducation() {
        return education;
    }
    public int getWorkExperience() {
        return workExperience;
    }
    public boolean hasArrangedWork() {
        return arrangedWork;
    }
    public boolean[] getAdaptability() {
        return adaptability;
    }

//    Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public void setLanguageSkills(int[] languageSkills) {
        this.languageSkills = languageSkills;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
    public void setArrangedWork(boolean arrangedWork) {
        this.arrangedWork = arrangedWork;
    }
    public void setAdaptability(boolean[] adaptability) {
        this.adaptability = adaptability;
    }
}
