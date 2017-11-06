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
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kas
 */
public class NavigationUiController implements Initializable {

    
JobSeeker currentJobSeeker;
@FXML
    private Label name;	

@FXML
    private Label age;

@FXML
    private Label location;	

@FXML
    private Label sex;	

@FXML
    private Label job;	

@FXML
    private Label traits;	
    
    /**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}	
        
        public void initData(JobSeeker jobSeeker) {
            try {
            this.currentJobSeeker = jobSeeker;
            this.name.setText(jobSeeker.getName());
            this.age.setText(jobSeeker.getAge());
            this.location.setText(jobSeeker.getLocation());
            this.sex.setText(jobSeeker.getSex());
            this.job.setText(jobSeeker.getCurrentJob());
            this.traits.setText("Later sprint");
            // TODO populate personality traits
            }
            catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        }
        
        @FXML protected void handleUpdateProfileButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) name.getScene().getWindow();
            System.out.println("pressed button");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UpdateProfileUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            UpdateProfileUiController controller = loader.<UpdateProfileUiController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();   
            
        }
	
}