public class Applicant {
    private String firstName;
    private String lastName;
    private int age;
    private String maritalStatus;

    private int speak1;
    private int listen1;
    private int read1;
    private int write1;
    private int all2;

    private String education;
    private String workExperience;
    private String arrangedEmployment;

    private int adaptabilitySpouseLanguage;
    private int adaptabilitySpouseEducation;
    private int adaptabilitySpouseWork;
    private int adaptabilityYouEducation;
    private int adaptabilityYouWork;
    private int adaptabilityYouEmployment;
    private int adaptabilityRelatives;

    private int score;

    public Applicant(String firstName, String lastName, int age, String maritalStatus, 
                     int speak1, int listen1, int read1, int write1, int all2, 
                     String education, String workExperience, String arrangedEmployment, 
                     int adaptabilitySpouseLanguage, int adaptabilitySpouseEducation, 
                     int adaptabilitySpouseWork, int adaptabilityYouEducation, 
                     int adaptabilityYouWork, int adaptabilityYouEmployment, 
                     int adaptabilityRelatives) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.maritalStatus = maritalStatus;

        this.speak1 = speak1;
        this.listen1 = listen1;
        this.read1 = read1;
        this.write1 = write1;
        this.all2 = all2;

        this.education = education;
        this.workExperience = workExperience;
        this.arrangedEmployment = arrangedEmployment;

        this.adaptabilitySpouseLanguage = adaptabilitySpouseLanguage;
        this.adaptabilitySpouseEducation = adaptabilitySpouseEducation;
        this.adaptabilitySpouseWork = adaptabilitySpouseWork;
        this.adaptabilityYouEducation = adaptabilityYouEducation;
        this.adaptabilityYouWork = adaptabilityYouWork;
        this.adaptabilityYouEmployment = adaptabilityYouEmployment;
        this.adaptabilityRelatives = adaptabilityRelatives;

        this.score = 0;
    }

    // Getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getSpeak1() {
        return speak1;
    }

    public void setSpeak1(int speak1) {
        this.speak1 = speak1;
    }

    public int getListen1() {
        return listen1;
    }

    public void setListen1(int listen1) {
        this.listen1 = listen1;
    }

    public int getRead1() {
        return read1;
    }

    public void setRead1(int read1) {
        this.read1 = read1;
    }

    public int getWrite1() {
        return write1;
    }

    public void setWrite1(int write1) {
        this.write1 = write1;
    }

    public int getAll2() {
        return all2;
    }

    public void setAll2(int all2) {
        this.all2 = all2;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getArrangedEmployment() {
        return arrangedEmployment;
    }

    public void setArrangedEmployment(String arrangedEmployment) {
        this.arrangedEmployment = arrangedEmployment;
    }

    public int getAdaptabilitySpouseLanguage() {
        return adaptabilitySpouseLanguage;
    }

    public void setAdaptabilitySpouseLanguage(int adaptabilitySpouseLanguage) {
        this.adaptabilitySpouseLanguage = adaptabilitySpouseLanguage;
    }

    public int getAdaptabilitySpouseEducation() {
        return adaptabilitySpouseEducation;
    }

    public void setAdaptabilitySpouseEducation(int adaptabilitySpouseEducation) {
        this.adaptabilitySpouseEducation = adaptabilitySpouseEducation;
    }

    public int getAdaptabilitySpouseWork() {
        return adaptabilitySpouseWork;
    }

    public void setAdaptabilitySpouseWork(int adaptabilitySpouseWork) {
        this.adaptabilitySpouseWork = adaptabilitySpouseWork;
    }

    public int getAdaptabilityYouEducation() {
        return adaptabilityYouEducation;
    }

    public void setAdaptabilityYouEducation(int adaptabilityYouEducation) {
        this.adaptabilityYouEducation = adaptabilityYouEducation;
    }

    public int getAdaptabilityYouWork() {
        return adaptabilityYouWork;
    }

    public void setAdaptabilityYouWork(int adaptabilityYouWork) {
        this.adaptabilityYouWork = adaptabilityYouWork;
    }

    public int getAdaptabilityYouEmployment() {
        return adaptabilityYouEmployment;
    }

    public void setAdaptabilityYouEmployment(int adaptabilityYouEmployment) {
        this.adaptabilityYouEmployment = adaptabilityYouEmployment;
    }

    public int getAdaptabilityRelatives() {
        return adaptabilityRelatives;
    }

    public void setAdaptabilityRelatives(int adaptabilityRelatives) {
        this.adaptabilityRelatives = adaptabilityRelatives;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
