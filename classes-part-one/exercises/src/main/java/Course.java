import java.util.ArrayList;

public class Course {
    private String courseTitle;
    private String teacher;
    private int courseID;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course (String aCourseTitle, String aTeacher, int aCourseID){
        this.courseTitle = aCourseTitle;
        this.teacher = aTeacher;
        this.courseID = aCourseID;
    }

    public void setCourseTitle(String aCourseTitle) {
        this.courseTitle = aCourseTitle;
    }
    public String getCourseTitle(){
        return courseTitle;
    }

    private void setCourseID(int aCourseID) {
        this.courseID = aCourseID;
    }
    public int getCourseID(){
        return courseID;
    }

    public void setTeacher(String aTeacher) {
        this.teacher = aTeacher;
    }
    public String getTeacher(){
        return teacher;
    }

    public void addEnrolledStudent(Student enrolledStudent) {
        enrolledStudents.add(enrolledStudent);
    }
    public ArrayList<Student> getEnrolledStudents(){
        return enrolledStudents;
    }
}
