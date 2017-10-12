
package personalized.job.matcher;

import java.awt.event.ActionEvent;




public class SignInController {
    
    SignInView loginPrompt;
    public SignInController(){
        loginPrompt = new SignInView();
        newButtonListeners();
        //JobSeekerList userList = new JobSeekerList();
    }
    
    public void attemptLogin(){
        
    }
    public void authenticatePass(){
        JobSeekerController jsController = new JobSeekerController();
    }
    public void authenticateFailed(){
        
        
    }
    
    private void newButtonListeners() {
        
        
        loginPrompt.sip.submit.addActionListener((ActionEvent evt) -> {
            
        });
              
    }
}
