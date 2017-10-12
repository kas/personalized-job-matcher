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
    JLabel user = new JLabel("Username:");
    JLabel pass = new JLabel("Password:");
    JTextField userText = new JTextField(20);
    JTextField passText = new JTextField(20);
    JButton submit = new JButton("Log In");
    JList employer = new JList();
    
    public SignInPanel()
    {
        setLayout(null);
        setBackground(Color.white);
        
        
        initComponents();
        newButtonListeners();
        
    }
    
    private void newButtonListeners() {
        
       
        /*
        view.getIframe().getInp().getTop().getbSpeed1().addActionListener((ActionEvent evt) -> {
            model.setDefaultSpeed(model.getRookieSpeed());
            view.getIframe().getInp().getBot().repaint();
        });
        */
    }

    private void initComponents() {
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
        /*
        JOptionPane.showMessageDialog(fillthisinlater,
        "Incorrect username or password",
        "Login Error",
        JOptionPane.ERROR_MESSAGE);
        */
    }
}
