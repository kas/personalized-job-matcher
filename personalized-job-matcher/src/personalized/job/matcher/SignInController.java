
package personalized.job.matcher;

import java.awt.event.ActionEvent;




public class SignInController {
    
    SignInView loginPrompt;
    JobSeekerList userList;
    
    public SignInController(){
        loginPrompt = new SignInView();
        userList = new JobSeekerList();
        newButtonListeners();
    }
    
    public void attemptLogin(){
        String tempUserStr = loginPrompt.sip.userText.toString();
        String tempPassStr = loginPrompt.sip.passText.toString();
        //if (tempUserStr.startsWith(userList.))
          
        
    }
    public void authenticatePass(){
        JobSeekerController jsController = new JobSeekerController();
    }
    public void authenticateFailed(){
        loginPrompt.sip.loginFailPrompt();
        
    }
    
    private void newButtonListeners() {
        
        
        loginPrompt.sip.submit.addActionListener((ActionEvent evt) -> {
            attemptLogin();
        });
              
    }
}
