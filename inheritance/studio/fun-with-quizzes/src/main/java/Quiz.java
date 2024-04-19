import java.util.ArrayList;

public class Quiz {
    private ArrayList<Questions> questions = new ArrayList<>();
    private int score;
    private int total;
    
    public void runQuiz(){
        for (Questions question : questions) {
            question.displayQuestion();
            question.displayAnswer();
            question.getUserAnswer();
            if (question.isCorrect()) {
                score += question.getPointValue();
            }
            total += question.getPointValue();
            System.out.println("\nCurrent score: " + score + "/" + total + "\n");
        }
    }
    
    public void addQuestion(Questions question){
        questions.add(question);
    }
    public void grade(){
        System.out.println("Score: " + score + "/" + total);
    }
    
    public void setScore(int score) {
        this.score += score;
    }
    
    public ArrayList<Questions> getQuestions() {
        return questions;
    }
    
    public int getScore() {
        return score;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
}
