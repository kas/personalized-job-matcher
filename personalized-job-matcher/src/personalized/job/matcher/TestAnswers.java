
package personalized.job.matcher;

import java.util.ArrayList;


public class TestAnswers {
    private ArrayList<Boolean> answers;
    private Boolean tempAnswer;
    
    public TestAnswers(){
        answers = new ArrayList<>();
    }
    public void addAnswer(){
        answers.add(tempAnswer);
    }

    /**
     * @return the answers
     */
    public ArrayList<Boolean> getAnswers() {
        return answers;
    }

    /**
     * @param answers the answers to set
     */
    public void setAnswers(ArrayList<Boolean> answers) {
        this.answers = answers;
    }

    /**
     * @return the tempAnswer
     */
    public Boolean getTempAnswer() {
        return tempAnswer;
    }

    /**
     * @param tempAnswer the tempAnswer to set
     */
    public void setTempAnswer(Boolean tempAnswer) {
        this.tempAnswer = tempAnswer;
    }
}
