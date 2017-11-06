
package personalized.job.matcher;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class LogInController implements Initializable {
    
    JobSeekerList userList;
    JobSeeker currentJobSeeker;
    @FXML private TextField username;
    @FXML private PasswordField pw;
    
    public LogInController() {   
        
        userList = new JobSeekerList();
	
    }
    
    
    
    
    @FXML protected void handleLoginButtonAction(ActionEvent event) {
        
        
        String userText = username.getText();
        String passwordText = pw.getText();
        boolean userInList;
        
        userInList = validateUserPass(userList.getUserList(), userText, passwordText);
        if (userInList == true){
            authenticatePass();
            
        }else{
            authenticateFailed();
        }
    }
        
    @FXML protected void handleCreateButtonAction(ActionEvent event) {
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
        CreateProfileUIController createProfileContrl = new CreateProfileUIController();
        
    }
    public void authenticatePass(){
        
        //loginPrompt.setVisible(false);
        loginSuccessPrompt();
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
        NavigationController navControl = new NavigationController(currentJobSeeker);
    }
    public void authenticateFailed(){
        
        loginFailPrompt();
    }
    public boolean validateUserPass(ArrayList<JobSeeker> userList, String userName,String password){
        boolean flag = false;
        boolean authenticateFlag = false;
        for(JobSeeker object : userList){
            if (object.getUsername().equalsIgnoreCase(userName)){
                flag = true;
                if (flag == true && object.getPassword().equals(password)){
                    authenticateFlag = true;
                    currentJobSeeker = object;
                }
            }
        }
        return authenticateFlag;
    }
    public void loginFailPrompt(){
        
        JOptionPane.showMessageDialog(new JPanel(),
        "Incorrect username or password",
        "Login Error",
        JOptionPane.ERROR_MESSAGE);
        
    }
    
    public void loginSuccessPrompt(){
        JOptionPane.showMessageDialog(new JPanel(),
        "Login successful!",
        "Login Success",
        JOptionPane.PLAIN_MESSAGE);
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
