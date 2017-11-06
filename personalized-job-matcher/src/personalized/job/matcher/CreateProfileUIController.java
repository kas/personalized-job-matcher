/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author austi
 */
public class CreateProfileUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        String userText = username.getText();
        UserProfile newUser = new UserProfile(username.getText(), password.getText(), name.getText(), Integer.parseInt(age.getText()),
            location.getText(), sex.getText(), currentJob.getText());
        
    }
    
     @FXML protected void handleCancelAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
    
}
