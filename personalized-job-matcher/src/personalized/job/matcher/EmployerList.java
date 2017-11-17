/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;

/**
 *
 * @author KAS6570
 */
public class EmployerList {
    private ArrayList<Employer> employerList;
    
    public EmployerList() {
        employerList = new ArrayList<>();
        makeEmployerList();
    }
    
    private void makeEmployerList() {
        Employer employer1 = new Employer("Walmart", "walmart", "password");
        
        employerList.add(employer1);
    }
}
