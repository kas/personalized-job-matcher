/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class SignInView extends JFrame{
    
    
    SignInView()
    {
        super("Practice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SignInPanel sip = new SignInPanel();
        add(sip);
        setSize(900,500);
        setVisible(true);
    }
    
    public void loginFailPrompt(){
        /*
        JOptionPane.showMessageDialog(fillthisinlater,
        "Incorrect username or password",
        "Login Error",
        JOptionPane.ERROR_MESSAGE);
        */
    }
    
}
