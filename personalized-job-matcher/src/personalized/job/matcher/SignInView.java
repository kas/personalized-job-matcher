/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SignInView extends JFrame{
    
    SignInPanel sip;
    SignInView()
    {
        super("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sip = new SignInPanel();
        add(sip);
        setSize(900,500);
        setVisible(true);
     
    }
    
    
    
    

    
    
}
