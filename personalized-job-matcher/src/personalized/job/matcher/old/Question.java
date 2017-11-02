
package personalized.job.matcher;

import java.util.ArrayList;


public class Question {
    private int questionID = 0;
    private String questionText = " ";
    private ArrayList<Choice> choices = new ArrayList<>();
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

    /**
     * @return the choices
     */
    public ArrayList<Choice> getChoices() {
        return choices;
    }

    /**
     * @param choices the choices to set
     */
    public void setChoices(ArrayList<Choice> choices) {
        this.choices = choices;
    }

    /**
     * @return the Choice2
     */
    public Choice getChoice2() {
        return Choice2;
    }

    /**
     * @param Choice2 the Choice2 to set
     */
    public void setChoice2(Choice Choice2) {
        this.Choice2 = Choice2;
    }

    /**
     * @return the Choice1
     */
    public Choice getChoice1() {
        return Choice1;
    }

    /**
     * @param Choice1 the Choice1 to set
     */
    public void setChoice1(Choice Choice1) {
        this.Choice1 = Choice1;
    }

    /**
     * @return the Choice3
     */
    public Choice getChoice3() {
        return Choice3;
    }

    /**
     * @param Choice3 the Choice3 to set
     */
    public void setChoice3(Choice Choice3) {
        this.Choice3 = Choice3;
    }

    /**
     * @return the Choice4
     */
    public Choice getChoice4() {
        return Choice4;
    }

    /**
     * @param Choice4 the Choice4 to set
     */
    public void setChoice4(Choice Choice4) {
        this.Choice4 = Choice4;
    }
}
