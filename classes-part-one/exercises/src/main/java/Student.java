public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;


    public Student (String aName, int aStudentID, int aNumberOfCredits, double aGPA){
        this.name = aName;
        this.studentId = aStudentID;
        this.numberOfCredits = aNumberOfCredits;
        this.gpa = aGPA;
    }

    public Student (String aName, int aStudentID) {
        this(aName,aStudentID, 0, 0.0);
    }
    // Drop your getters and setters below for the Student class.

    public void setName(String aName) {
        this.name = aName;
    }

    public String getName() {
        return this.name;
    }

    private void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    public double getGpa() {
        return this.gpa;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
