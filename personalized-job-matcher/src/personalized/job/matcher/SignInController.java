
package personalized.job.matcher;

import javax.swing.JOptionPane;


public class SignInController {
    public SignInController(){
        SignInView loginPrompt = new SignInView();
        //JobSeekerList userList = new JobSeekerList();
    }
    
    public void login(){
        
    }
    public void authenticatePass(){
        JobSeekerController jsController = new JobSeekerController();
    }
    public void authenticateFailed(){
        
        /*
        JOptionPane.showMessageDialog(fillthisinlater,
        "Incorrect username or password",
        "Login Error",
        JOptionPane.ERROR_MESSAGE);
        */
    }
}
