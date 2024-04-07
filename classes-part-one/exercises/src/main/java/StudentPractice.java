import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args) {
        //instantiate your Student class below
        Student myself = new Student("Trevor", 12345, 1, 4.0);
        Course mathClass = new Course("Math 100", "teach", 1111);
        Teacher firstTeacher = new Teacher("Mary","Addams", 4, mathClass);
        Teacher secondTeacher = new Teacher("Susan", "Murdock");
        
        ArrayList<Course> firstTeacherSubjects = firstTeacher.getSubjects();
        
        for (Course firstTeacherSubject : firstTeacherSubjects) {
            System.out.println(firstTeacherSubject.getCourseTitle());
        }

    }
}
