/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Krafty
 */
public class ReviewResultsUIController implements Initializable {

    private JobSeeker currentJobSeeker;
    @FXML private Label resultsLabel;
    @FXML private ListView results;
    private PersonalityTraitList currentPersonalityTraitList;
    protected ListProperty<String> listProperty = new SimpleListProperty<>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initData(JobSeeker jobSeeker, PersonalityTraitList personalityTraitList) {
            try {
            this.currentJobSeeker = jobSeeker;
            results.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
            personalityTraitList = new PersonalityTraitList();

            results.itemsProperty().bind(listProperty);
            listProperty.set(FXCollections.observableArrayList(personalityTraitList.getPersonalityTraitList()));
            
            }
            catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    
    }
    
    @FXML protected void handleExitButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) resultsLabel.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();    
        }
}
