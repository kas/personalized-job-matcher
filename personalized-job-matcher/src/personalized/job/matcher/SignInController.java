
package personalized.job.matcher;

import java.awt.event.ActionEvent;




public class SignInController {
    
    SignInView loginPrompt;
    
    public SignInController(){
        loginPrompt = new SignInView();
        JobSeekerList userList = new JobSeekerList();
        newButtonListeners();
    }
    
    public void attemptLogin(){
        String tempUserStr = loginPrompt.sip.userText.toString();
        String tempPassStr = loginPrompt.sip.passText.toString();
        
    }
    public void authenticatePass(){
        JobSeekerController jsController = new JobSeekerController();
    }
    public void authenticateFailed(){
        
        
    }
    
    private void newButtonListeners() {
        
        
        loginPrompt.sip.submit.addActionListener((ActionEvent evt) -> {
            attemptLogin();
        });
              
    }
}
