import java.util.ArrayList;
import java.util.Scanner;

public abstract class Questions {
//Fields
    private String question;
    private boolean isCorrect;
    private int pointValue;
    public static Scanner input = new Scanner(System.in);
//Constructor
    public Questions(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }
    
    public void displayQuestion(){
        System.out.println(question);
    }
    abstract void displayAnswer();
    abstract void getUserAnswer();
    abstract void validateAnswer();
    public int getPointValue() {
        return pointValue;
    }
//Getters and Setters
    public String getQuestion() {
        return question;
    }
    
    public boolean isCorrect() {
        return isCorrect;
    }
    
    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}