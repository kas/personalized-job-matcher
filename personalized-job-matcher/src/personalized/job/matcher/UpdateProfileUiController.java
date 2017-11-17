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
public class UpdateProfileUiController implements Initializable {
    
    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML private TextField city;
    @FXML private TextField state;
    @FXML private TextField age;
    @FXML private TextField job;
    private JobSeeker currentJobSeeker;
    
    public UpdateProfileUiController(){
        
    }
    
    public void initData(JobSeeker jobSeeker) {
            System.out.println("hello");
            currentJobSeeker = jobSeeker;
            System.out.println(jobSeeker.getUsername());
        }
    
    
    
    
    @FXML protected void handleUpdateButtonAction(ActionEvent event) throws IOException {
        
            currentJobSeeker.setName(firstName.getText() + " " + lastName.getText()); //need to change this later
        
        if(!(age.getText().equals(""))){
            currentJobSeeker.setAge(age.getText());
        }
        
            currentJobSeeker.setLocation(city.getText() + " " + state.getText()); //need to change this later
           
        if(!(job.getText().equals(""))){
            currentJobSeeker.setCurrentJob(job.getText());
        }    
            System.out.println(currentJobSeeker.getName());
            System.out.println(currentJobSeeker.getAge());
            System.out.println(currentJobSeeker.getLocation());
            System.out.println(currentJobSeeker.getCurrentJob());
            
            Stage stage = (Stage) firstName.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();        
        }
    @FXML protected void handleCancelButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) firstName.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();    
        }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * @return the firstName
     */
    public TextField getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(TextField firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public TextField getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(TextField lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the city
     */
    public TextField getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(TextField city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public TextField getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(TextField state) {
        this.state = state;
    }

    /**
     * @return the age
     */
    public TextField getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(TextField age) {
        this.age = age;
    }

    /**
     * @return the job
     */
    public TextField getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(TextField job) {
        this.job = job;
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
    
}
