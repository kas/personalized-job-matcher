/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author austi
 */
public class CreateProfileUIController implements Initializable {

    Parent root1;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateProfileUI.fxml"));
                
                root1 = (Parent) fxmlLoader.load();
                CreateProfileUIController customController = new CreateProfileUIController();
                fxmlLoader.setController(customController);
                stage = new Stage();
                stage.setScene(new Scene(root1));                
                stage.show();
                
                
                
        } catch(Exception e) {
           e.printStackTrace();
          }
    }    
    @FXML private Text actiontarget;
    @FXML private TextField username;
    @FXML private TextField password;
    @FXML private TextField name;
    @FXML private TextField age;
    @FXML private TextField location;
    @FXML private TextField sex;
    @FXML private TextField currentJob;
    
    @FXML protected void handleSubmitAction(ActionEvent event) {
        ArrayList<JobSeeker> newList = new ArrayList<JobSeeker>();
        JobSeeker newJobSeeker = new JobSeeker(username.getText(), name.getText(), 7, password.getText(), 
            age.getText(), location.getText(), sex.getText(), currentJob.getText());
        //JobSeekerList.JobSeekerList.add(newJobSeeker);
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
        NavigationController navControl = new NavigationController(newJobSeeker);
    }
    
     @FXML protected void handleCancelAction(ActionEvent event) {
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
        LogInController logInContrl = new LogInController();
    }
    
}
