/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kas
 */
public class EmployerNavigationUiController implements Initializable {

    
private Employer currentEmployer;
@FXML
    private Label name;		
    
    /**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}	
        
        public void initData(Employer employer) {
            try {
                this.currentEmployer = employer;
                this.name.setText(employer.getName());
            }
            catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
        
        @FXML protected void handleCreateCareerProfileButtonAction(ActionEvent event) throws IOException {            
            Stage stage = (Stage) name.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateCareerProfileUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));

            CreateCareerProfileUiController controller = loader.<CreateCareerProfileUiController>getController();
            controller.initData(this.currentEmployer);
        
            stage.show();
        }

    /**
     * @return the currentEmployer
     */
    public Employer getCurrentEmployer() {
        return currentEmployer;
    }

    /**
     * @param currentEmployer the currentEmployer to set
     */
    public void setCurrentEmployer(Employer currentEmployer) {
        this.currentEmployer = currentEmployer;
    }

    /**
     * @return the name
     */
    public Label getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Label name) {
        this.name = name;
    }
}