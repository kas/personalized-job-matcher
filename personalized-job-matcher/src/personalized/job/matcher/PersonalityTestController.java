
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PersonalityTestController implements Initializable {

    TestQuestionList questions = new TestQuestionList();
    private Parent root1;
   
    @FXML private Label questionArea;
    @FXML RadioButton rbYes;
    @FXML RadioButton rbNo;
    int questionNumber = 0;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        questionArea.setText(questions.testQuestions.get(questionNumber).questionText);
    }    
    
    @FXML protected void handleNextAction(ActionEvent event) throws IOException {
        if (questionNumber < questions.testQuestions.size() - 1){
            questionNumber++;
            questionArea.setText(questions.testQuestions.get(questionNumber).questionText);
        }else if (questionNumber == questions.testQuestions.size() - 1){
            testDone();
            
            Stage stage = (Stage) questionArea.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
            
        
            stage.show();    
        }
        
    }
    
    public void testDone(){
        JOptionPane.showMessageDialog(new JPanel(),
        "Test Complete",
        "Test Complete",
        JOptionPane.PLAIN_MESSAGE);
    }
    
}
