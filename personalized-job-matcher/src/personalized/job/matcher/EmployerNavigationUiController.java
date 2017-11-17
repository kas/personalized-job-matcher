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
public class EmployerNavigationUiController implements Initializable {

    
private Employer currentEmployer;
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
        
        public void initData(Employer employer) {
//            try {
//                this.currentEmployer = employer;
//                this.name.setText(employer.getName());
//                this.age.setText(employer.getAge());
//                this.location.setText(employer.getLocation());
//                this.sex.setText(employer.getSex());
//                this.job.setText(employer.getCurrentJob());
//                this.traits.setText("Later sprint");
//            // TODO populate personality traits
//            }
//            catch (Exception e) {
//            System.out.println(e.getStackTrace());
//        }
        }
        
        @FXML protected void handleUpdateProfileButtonAction(ActionEvent event) throws IOException {
//            Stage stage = (Stage) name.getScene().getWindow();
//            System.out.println("pressed button");
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("UpdateProfileUi.fxml"));
//            stage.setScene(new Scene((Pane) loader.load()));
//
//            UpdateProfileUiController controller = loader.<UpdateProfileUiController>getController();
//            controller.initData(this.currentEmployer);
//        
//            stage.show();   
            
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