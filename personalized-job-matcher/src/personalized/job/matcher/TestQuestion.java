package personalized.job.matcher;

public class TestQuestion {

    private String questionText;
    private String associatedTrait;

    public TestQuestion(String newQuestionText, String newAssociatedTrait) {
        this.questionText = newQuestionText;
        this.associatedTrait = newAssociatedTrait;
    }

    /**
     * @return the questionText
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * @param questionText the questionText to set
     */
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    /**
     * @return the associatedTrait
     */
    public String getAssociatedTrait() {
        return associatedTrait;
    }

    /**
     * @param associatedTrait the associatedTrait to set
     */
    public void setAssociatedTrait(String associatedTrait) {
        this.associatedTrait = associatedTrait;
    }

}
