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

public class SignInPanel extends JPanel{
    JLabel user;
    JLabel pass;
    JTextField userText;
    JTextField passText;
    JButton submit;
    JList employer;
    
    public SignInPanel()
    {
        setLayout(null);
        setBackground(Color.white);
        initComponents();
        
        
    }
    
    

    private void initComponents() {
        
        user = new JLabel("Username:");
        pass = new JLabel("Password:");
        userText = new JTextField(20);
        passText = new JTextField(20);
        submit = new JButton("Log In");
        employer = new JList();
        
        add(user);
        user.setBounds(100,100,100,50);
        
        add(pass);
        pass.setBounds(100,100,100,100);
        
        add(userText);
        userText.setBounds(200,115,100,20);
        
        add(passText);
        passText.setBounds(200, 140, 100, 20);
        
        
        add(submit);
        submit.setBounds(400, 125, 100, 25);
        
        
        add(employer);
        employer.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        employer.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        employer.setVisibleRowCount(-1);
        employer.setBounds(400, 200, 100, 200);
        
        JScrollPane employerScroller = new JScrollPane(employer);
        employerScroller.setPreferredSize(new Dimension(250,80));
    }
    
    public void loginFailPrompt(){
        
        JOptionPane.showMessageDialog(new JPanel(),
        "Incorrect username or password",
        "Login Error",
        JOptionPane.ERROR_MESSAGE);
        
    }
}
