/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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
        
        @FXML protected void handleUpdateProfileButtonAction(ActionEvent event) {
            System.out.println("pressed button");
            this.name.setText("I'm a Label.");
        }
	
}