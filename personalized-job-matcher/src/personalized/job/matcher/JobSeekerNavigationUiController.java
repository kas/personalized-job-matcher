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
public class JobSeekerNavigationUiController implements Initializable {

    
private JobSeeker currentJobSeeker;

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
            //System.out.println("pressed button");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UpdateProfileUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            UpdateProfileUiController controller = loader.<UpdateProfileUiController>getController();
            controller.initData(this.currentJobSeeker);
            
            stage.show();   
            
        }
        @FXML protected void handleTestPersonalityButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) name.getScene().getWindow();
            //System.out.println("pressed button");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PersonalityTest.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            PersonalityTestController controller = loader.<PersonalityTestController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();   
           
        }
        
        @FXML protected void handleSearchJCButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) name.getScene().getWindow();
            //System.out.println("pressed button");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchJobUI.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            SearchJobUIController controller = loader.<SearchJobUIController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();   
            
        }
        /*
        @FXML protected void handleReviewResultsButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) name.getScene().getWindow();
            //System.out.println("pressed button");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ReviewResultsUI.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            ReviewResultsUIController controller = loader.<ReviewResultsUIController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();   
            
        }
        */

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
     * @return the name
     */
    public Label getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Label name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Label getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Label age) {
        this.age = age;
    }

    /**
     * @return the location
     */
    public Label getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Label location) {
        this.location = location;
    }

    /**
     * @return the sex
     */
    public Label getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(Label sex) {
        this.sex = sex;
    }

    /**
     * @return the job
     */
    public Label getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(Label job) {
        this.job = job;
    }

    /**
     * @return the traits
     */
    public Label getTraits() {
        return traits;
    }

    /**
     * @param traits the traits to set
     */
    public void setTraits(Label traits) {
        this.traits = traits;
    }
	
}