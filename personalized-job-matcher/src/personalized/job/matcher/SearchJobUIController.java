/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Krafty
 */
public class SearchJobUIController implements Initializable {

    private JobSeeker currentJobSeeker;
    private JobSeeker tempEmployer;
    
    @FXML private TextField Keyword;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initData(JobSeeker jobSeeker) {
            //System.out.println("hello");
            currentJobSeeker = jobSeeker;
            //System.out.println(jobSeeker.getUsername());
        }
    
    
    @FXML protected void handleCancelButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) Keyword.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();    
        }
}
