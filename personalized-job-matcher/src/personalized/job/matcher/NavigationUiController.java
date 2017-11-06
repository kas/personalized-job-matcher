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
    
    /**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}	
        
        public void initData(JobSeeker jobSeeker) {
            System.out.println("hello");
            currentJobSeeker = jobSeeker;
            System.out.println(jobSeeker.getUsername());
        }
        
        @FXML protected void handleUpdateProfileButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) name.getScene().getWindow();
            System.out.println("pressed button");
            this.name.setText("I'm a Label.");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UpdateProfileUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            UpdateProfileUiController controller = loader.<UpdateProfileUiController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();   
        }
	
}