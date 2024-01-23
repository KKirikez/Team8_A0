public class Applicant {
    private String firstName;
    private String lastName;
    private int age;
    private String maritalStatus;

    private int speak1;
    private int listen1;
    private int read1;
    private int write1;
    private String all2;

    private String education;
    private int workExperience;
    private String arrangedEmployment;

    private String adaptabilitySpouseLanguage;
    private String adaptabilitySpouseEducation;
    private String adaptabilitySpouseWork;
    
    private String adaptabilityYouEducation;
    private String adaptabilityYouWork;
    private String adaptabilityYouEmployment;
    private String adaptabilityRelatives;

    private int score;

    public Applicant(String[] data) {
        
    	this.firstName = data[0];
        this.lastName = data[1];
        this.age = Integer.parseInt(data[2]);
        this.maritalStatus = data[3];

        this.speak1 = Integer.parseInt(data[4]);
        this.listen1 = Integer.parseInt(data[5]);
        this.read1 = Integer.parseInt(data[6]);
        this.write1 = Integer.parseInt(data[7]);
        this.all2 = data[8];

        this.education = data[9];
        this.workExperience = Integer.parseInt(data[10]);
        this.arrangedEmployment = data[11];

        this.adaptabilitySpouseLanguage = data[12];
        this.adaptabilitySpouseEducation = data[13];
        this.adaptabilitySpouseWork = data[14];
        this.adaptabilityYouEducation = data[15];
        this.adaptabilityYouWork = data[16];
        this.adaptabilityYouEmployment = data[17];
        this.adaptabilityRelatives = data[18];

        this.score = 0;
    }
    
// 	Getter methods    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public int getSpeak1() {
        return speak1;
    }
    public int getListen1() {
        return listen1;
    }
    public int getRead1() {
        return read1;
    }
    public int getWrite1() {
        return write1;
    }
    public String getAll2() {
        return all2;
    }
    public String getEducation() {
        return education;
    }
    public int getWorkExperience() {
        return workExperience;
    }
    public String getArrangedEmployment() {
        return arrangedEmployment;
    }
    public String getAdaptabilitySpouseLanguage() {
        return adaptabilitySpouseLanguage;
    }
    public String getAdaptabilitySpouseEducation() {
        return adaptabilitySpouseEducation;
    }
    public String getAdaptabilitySpouseWork() {
        return adaptabilitySpouseWork;
    }
    public String getAdaptabilityYouEducation() {
        return adaptabilityYouEducation;
    }
    public String getAdaptabilityYouWork() {
        return adaptabilityYouWork;
    }
    public String getAdaptabilityYouEmployment() {
        return adaptabilityYouEmployment;
    }
    public String getAdaptabilityRelatives() {
        return adaptabilityRelatives;
    }
    public int getScore() {
        return score;
    }
    
//    Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public void setSpeak1(int speak1) {
        this.speak1 = speak1;
    }
    public void setListen1(int listen1) {
        this.listen1 = listen1;
    }
    public void setRead1(int read1) {
        this.read1 = read1;
    }
    public void setWrite1(int write1) {
        this.write1 = write1;
    }
    public void setAll2(String all2) {
        this.all2 = all2;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
    public void setArrangedEmployment(String arrangedEmployment) {
        this.arrangedEmployment = arrangedEmployment;
    }
    public void setAdaptabilitySpouseLanguage(String adaptabilitySpouseLanguage) {
        this.adaptabilitySpouseLanguage = adaptabilitySpouseLanguage;
    }
    public void setAdaptabilitySpouseEducation(String adaptabilitySpouseEducation) {
        this.adaptabilitySpouseEducation = adaptabilitySpouseEducation;
    }
    public void setAdaptabilitySpouseWork(String adaptabilitySpouseWork) {
        this.adaptabilitySpouseWork = adaptabilitySpouseWork;
    }
    public void setAdaptabilityYouEducation(String adaptabilityYouEducation) {
        this.adaptabilityYouEducation = adaptabilityYouEducation;
    }
    public void setAdaptabilityYouWork(String adaptabilityYouWork) {
        this.adaptabilityYouWork = adaptabilityYouWork;
    }
    public void setAdaptabilityYouEmployment(String adaptabilityYouEmployment) {
        this.adaptabilityYouEmployment = adaptabilityYouEmployment;
    }
    public void setAdaptabilityRelatives(String adaptabilityRelatives) {
        this.adaptabilityRelatives = adaptabilityRelatives;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
