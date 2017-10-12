
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
        
        String text = loginPrompt.sip.userText.getText().toString();
        String text1 = loginPrompt.sip.passText.getText().toString();
        System.out.println(text + "\n" + text1);
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
