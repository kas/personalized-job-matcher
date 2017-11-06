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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kas
 */
public class NavigationUiController implements Initializable {

	private Parent root1;
        //Scene currentScene;
        private Stage stage;
        @FXML private Button updateProfile;
        private JobSeeker currentJobSeeker;
        @FXML Label name;
        @FXML Label age;
        @FXML Label location;
        @FXML Label sex;
        @FXML Label job;
        @FXML Label traits;
        
        
        
        public NavigationUiController(){
            
            
        }

    NavigationUiController(JobSeeker newCurrentJobSeeker) {
        this.currentJobSeeker = newCurrentJobSeeker;
        System.out.println(currentJobSeeker.getUsername());
        //setLabels();
    }

        
        
        @FXML protected void handleUpdateProfileButtonAction(ActionEvent event) {
            try {
                
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UpdateProfileUi.fxml"));
                root1 = (Parent) fxmlLoader.load();
                UpdateProfileUiController updateController = new UpdateProfileUiController(currentJobSeeker);
                fxmlLoader.setController(updateController);
                stage = new Stage();
                //currentScene = updateProfile.getScene();
                //currentScene.getWindow().hide();
                stage.setScene(new Scene(root1)); 
                //UpdateProfileUiController controller = fxmlLoader.<UpdateProfileUiController>getController();
                //controller.setCurrentJobSeeker(currentJobSeeker);
                stage.show();
                updateProfile.setOnAction(null);
            }catch(Exception e) {
                e.printStackTrace();
            }
                  
        }
        
        
        
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

    /**
     * @return the root1
     */
    public Parent getRoot1() {
        return root1;
    }

    /**
     * @param root1 the root1 to set
     */
    public void setRoot1(Parent root1) {
        this.root1 = root1;
    }

    /**
     * @return the stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * @param stage the stage to set
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * @return the updateProfile
     */
    public Button getUpdateProfile() {
        return updateProfile;
    }

    /**
     * @param updateProfile the updateProfile to set
     */
    public void setUpdateProfile(Button updateProfile) {
        this.updateProfile = updateProfile;
    }

    /**
     * @return the currentJobSeeker
     */
    public JobSeeker getCurrentJobSeeker() {
        return currentJobSeeker;
    }

    
    public void setCurrentJobSeeker(JobSeeker newCurrentJobSeeker) {
        this.currentJobSeeker = newCurrentJobSeeker;
    }

    public void setLabels() {
        name.setText(currentJobSeeker.getName());
        age.setText(currentJobSeeker.getAge());
        location.setText(currentJobSeeker.getLocation());
        sex.setText(currentJobSeeker.getSex());
        job.setText(currentJobSeeker.getCurrentJob());
        traits.setText("Personality Test not taken yet.");
    }
	
}
