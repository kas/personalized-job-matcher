/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import javax.swing.*;


public class SignInView extends JFrame{
    
    private SignInPanel sip;
    SignInView()
    {
        super("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sip = new SignInPanel();
        add(sip);
        setSize(900,500);
        setVisible(true);
     
    }

    /**
     * @return the sip
     */
    public SignInPanel getSip() {
        return sip;
    }

    /**
     * @param sip the sip to set
     */
    public void setSip(SignInPanel sip) {
        this.sip = sip;
    }
    
    
    
    

    
    
}
