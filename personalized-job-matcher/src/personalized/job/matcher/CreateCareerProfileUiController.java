/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author austi
 */
public class CreateCareerProfileUiController implements Initializable {
    private Employer currentEmployer;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initData(Employer employer) {
            try {
                this.currentEmployer = employer;
            }
            catch (Exception e) {
                System.out.println(e.getStackTrace());
        }
        }
    
}
