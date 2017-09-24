
package personalized.job.matcher;

import java.util.ArrayList;


public class Question {
    private int questionID = 0;
    private String questionText = " ";
    ArrayList<Choice> choices = new ArrayList<>();
    private Choice Choice2;
    private Choice Choice1;
    private Choice Choice3;
    private Choice Choice4;
    
    
    public Question(int newQuestionID, String newQuestionText){
        
        this.questionID = newQuestionID;
        this.questionText = newQuestionText;
        makeChoices();
        addChoices();
    }
    
    public void makeChoices(){
        Choice1 = new Choice(1, "Red");
        Choice2 = new Choice(2, "Blue");
        Choice3 = new Choice(3, "Yellow");
        Choice4 = new Choice(4, "Green");
    }
    
    
    public void addChoices(){
        choices.add(Choice1);
        choices.add(Choice2);
        choices.add(Choice3);
        choices.add(Choice4);
    }
    
    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    
    public void getQuestionInfo(){
        System.out.println(questionID + " " + questionText);
    }
}
