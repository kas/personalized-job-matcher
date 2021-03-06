package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PersonalityTestController implements Initializable {

    private TestQuestionList questions = new TestQuestionList();
    private TestAnswers testAnswers = new TestAnswers();
    private PersonalityTraitList traits = new PersonalityTraitList();

    private JobSeeker currentJobSeeker;
    private Employer currentEmployer;
    @FXML
    private Label questionArea;
    @FXML
    private RadioButton rbYes;
    @FXML
    private RadioButton rbNo;
    @FXML
    private ToggleGroup rbGroup;
    @FXML
    private ProgressBar testProgress;

    private int questionNumber = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        questionArea.setText(questions.getTestQuestions().get(questionNumber).getQuestionText());

    }

    @FXML
    protected void handleNextAction(ActionEvent event) throws IOException {

        testProgress.setProgress((questionNumber + 1) * .1);
        if (questionNumber < questions.getTestQuestions().size() - 1) {
            questionNumber++;
            questionArea.setText(questions.getTestQuestions().get(questionNumber).getQuestionText());
            if (rbGroup.getSelectedToggle().equals(rbYes)) {
                String tempAnswer = questions.getTestQuestions().get(questionNumber).getAssociatedTrait();
                testAnswers.getAnswers().add(tempAnswer);
            } else if (rbGroup.getSelectedToggle().equals(rbNo)) {

            }

        } else if (questionNumber == questions.getTestQuestions().size() - 1) {
            testDone();

            currentJobSeeker.setTestAnswers(testAnswers.getAnswers());

            Stage stage = (Stage) questionArea.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ReviewResultsUI.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            ReviewResultsUIController controller = loader.<ReviewResultsUIController>getController();
            controller.initData(this.currentJobSeeker);

            stage.show();
        }

    }

    public void testDone() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Personality Test");
        alert.setHeaderText(null);
        alert.setContentText("Your personality test is now complete.");
        alert.showAndWait();
    }

    public void initData(JobSeeker jobSeeker) {

        currentJobSeeker = jobSeeker;
        //System.out.println(jobSeeker.getUsername());
    }

    /**
     * @return the questions
     */
    public TestQuestionList getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(TestQuestionList questions) {
        this.questions = questions;
    }

    /**
     * @return the testAnswers
     */
    public TestAnswers getTestAnswers() {
        return testAnswers;
    }

    /**
     * @param testAnswers the testAnswers to set
     */
    public void setTestAnswers(TestAnswers testAnswers) {
        this.testAnswers = testAnswers;
    }

    /**
     * @return the traits
     */
    public PersonalityTraitList getTraits() {
        return traits;
    }

    /**
     * @param traits the traits to set
     */
    public void setTraits(PersonalityTraitList traits) {
        this.traits = traits;
    }

    /**
     * @return the currentJobSeeker
     */
    public JobSeeker getCurrentJobSeeker() {
        return currentJobSeeker;
    }

    /**
     * @param currentJobSeeker the currentJobSeeker to set
     */
    public void setCurrentJobSeeker(JobSeeker currentJobSeeker) {
        this.currentJobSeeker = currentJobSeeker;
    }

    /**
     * @return the questionArea
     */
    public Label getQuestionArea() {
        return questionArea;
    }

    /**
     * @param questionArea the questionArea to set
     */
    public void setQuestionArea(Label questionArea) {
        this.questionArea = questionArea;
    }

    /**
     * @return the rbYes
     */
    public RadioButton getRbYes() {
        return rbYes;
    }

    /**
     * @param rbYes the rbYes to set
     */
    public void setRbYes(RadioButton rbYes) {
        this.rbYes = rbYes;
    }

    /**
     * @return the rbNo
     */
    public RadioButton getRbNo() {
        return rbNo;
    }

    /**
     * @param rbNo the rbNo to set
     */
    public void setRbNo(RadioButton rbNo) {
        this.rbNo = rbNo;
    }

    /**
     * @return the rbGroup
     */
    public ToggleGroup getRbGroup() {
        return rbGroup;
    }

    /**
     * @param rbGroup the rbGroup to set
     */
    public void setRbGroup(ToggleGroup rbGroup) {
        this.rbGroup = rbGroup;
    }

    /**
     * @return the questionNumber
     */
    public int getQuestionNumber() {
        return questionNumber;
    }

    /**
     * @param questionNumber the questionNumber to set
     */
    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    /**
     * @return the currentEmployer
     */
    public Employer getCurrentEmployer() {
        return currentEmployer;
    }

    /**
     * @param currentEmployer the currentEmployer to set
     */
    public void setCurrentEmployer(Employer currentEmployer) {
        this.currentEmployer = currentEmployer;
    }

    /**
     * @return the testProgress
     */
    public ProgressBar getTestProgress() {
        return testProgress;
    }

    /**
     * @param testProgress the testProgress to set
     */
    public void setTestProgress(ProgressBar testProgress) {
        this.testProgress = testProgress;
    }
}
