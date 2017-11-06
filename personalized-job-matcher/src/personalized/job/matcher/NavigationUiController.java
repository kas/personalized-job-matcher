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

@FXML
    private Label name;	

@FXML
    private Label age;

@FXML
    private Label location;	

@FXML
    private Label sex;	

@FXML
    private Label currentJob;	

@FXML
    private Label personalityTraits;	
    
    /**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}	
        
        public void initData(JobSeeker jobSeeker) {
            try {
            this.name.setText(jobSeeker.getName());
            this.age.setText(jobSeeker.getAge());
            this.location.setText(jobSeeker.getLocation());
            this.sex.setText(jobSeeker.getSex());
            this.currentJob.setText(jobSeeker.getCurrentJob());
            // TODO populate personality traits
            }
            catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        }
        
        @FXML protected void handleUpdateProfileButtonAction(ActionEvent event) {
            //open new update profile window
            this.name.setText("I'm a Label.");
        }
	
}