/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

/**
 *
 * @author eem5034
 */
public class Question {
    private int questionID = 0;
    private String questionText = " ";
    
    public Question(int newQuestionID, String newQuestionText){
        
        this.questionID = newQuestionID;
        this.questionText = newQuestionText;
    
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
}
