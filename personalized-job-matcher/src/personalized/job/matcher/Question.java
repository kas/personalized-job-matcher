
package personalized.job.matcher;

import java.util.ArrayList;


public class Question {
    private int questionID = 0;
    private String questionText = " ";
    ArrayList<Choice> choices = new ArrayList<>();
    
    public Question(int newQuestionID, String newQuestionText, ArrayList newChoices){
        
        this.questionID = newQuestionID;
        this.questionText = newQuestionText;
        this.choices = newChoices;
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
        System.out.println(questionID + questionText);
    }
}
