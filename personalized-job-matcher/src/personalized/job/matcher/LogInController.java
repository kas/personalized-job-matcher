
package personalized.job.matcher;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class LogInController implements Initializable {
    
    JobSeekerList userList;
    @FXML private TextField username;
    @FXML private PasswordField pw;
    
    public LogInController() {   
        
        userList = new JobSeekerList();
	
    }
            
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        
        
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
    public void authenticatePass(){
        
        //loginPrompt.setVisible(false);
        loginSuccessPrompt();
        //JobSeekerController jsController = new JobSeekerController();
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
