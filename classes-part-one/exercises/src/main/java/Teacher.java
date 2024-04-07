import java.util.ArrayList;

public class Teacher {
    private String firstName;
    private String lastName;
    private int yearsTeaching;
    private ArrayList<Course> subjects = new ArrayList<>();

    public Teacher(String aFirstName, String aLastName, int yearsTeaching, Course aCourse) {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.yearsTeaching = yearsTeaching;
        if (aCourse != null) {
            subjects.add(aCourse);
        }
    }

    public Teacher(String aFirstName, String aLastName, int yearsTeaching) {
        this(aFirstName, aLastName, yearsTeaching, null);
    }
    public Teacher(String aFirstName, String aLastName, Course aCourse) {
        this(aFirstName, aLastName, 0, aCourse);
    }

    public Teacher(String aFirstName, String aLastName) {
        this(aFirstName, aLastName, 0, null);
    }

    public void setName(String aFirstName, String aLastName) {
        this.firstName = aFirstName;
        this.lastName = aLastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    private void setYearsTeaching(){
        this.yearsTeaching ++;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }
    public void addSubject(Course aCourse) {
        subjects.add(aCourse);
    }
    public ArrayList<Course> getSubjects (){
        return subjects;
    }
}
