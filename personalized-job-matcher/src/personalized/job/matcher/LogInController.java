
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class LogInController implements Initializable {
    
    private JobSeekerList userList;
    private JobSeeker currentJobSeeker;
    @FXML private TextField username;
    @FXML private PasswordField pw;
    
    public LogInController() {   
        
        userList = new JobSeekerList();
	
    }
    
    
    
    
    @FXML protected void handleLoginButtonAction(ActionEvent event) throws IOException {
        
        
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
    public void authenticatePass() throws IOException{
        
        //loginPrompt.setVisible(false);
        loginSuccessPrompt();
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        NavigationUiController controller = loader.<NavigationUiController>getController();
        controller.initData(this.currentJobSeeker);
        
        stage.show();             
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

    /**
     * @return the userList
     */
    public JobSeekerList getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(JobSeekerList userList) {
        this.userList = userList;
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

    /**
     * @return the username
     */
    public TextField getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(TextField username) {
        this.username = username;
    }

    /**
     * @return the pw
     */
    public PasswordField getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(PasswordField pw) {
        this.pw = pw;
    }
    
}
