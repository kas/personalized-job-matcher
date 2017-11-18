/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
    
    @FXML private TextField name;
    @FXML private TextField medianSalary;
    @FXML private TextArea description;
    @FXML private ListView traitList;
    @FXML
    private ObservableList<String> listofTraits;
    private PersonalityTraitList personalityTraitList;
    PersonalityTraits2 personalitytraits2 = new PersonalityTraits2();
     protected ListProperty<String> listProperty = new SimpleListProperty<>();
    
    public void initData(Employer employer) {
        //personalityTraitList = new PersonalityTraitList();
          
         listofTraits = personalitytraits2.getPersonalityTraits();
            
                this.currentEmployer = employer;
                
                
                 
                
                traitList.setItems(listofTraits);
               // TODO populate listview with personality traits (personalitytraitlist)
            
            
              
            
        }
    
    @FXML protected void handleCancelAction(ActionEvent event) {
        Stage stage = (Stage) name.getScene().getWindow();
        stage.close();
        EmployerNavigationUiController employerNavigationUiController = new EmployerNavigationUiController();
    }
    
    @FXML protected void handleSubmitAction(ActionEvent event) throws IOException {
        ArrayList<CareerProfile> newList = new ArrayList<CareerProfile>();
        
        List<String> personalityTraitsList = traitList.getSelectionModel().getSelectedItems();
        
        CareerProfile careerProfile = new CareerProfile(name.getText(), medianSalary.getText(), description.getText(), personalityTraitsList);

        CareerProfileList careerProfileList = new CareerProfileList();
        careerProfileList.add(careerProfile);
        
        Stage stage = (Stage) name.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployerNavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        EmployerNavigationUiController controller = loader.<EmployerNavigationUiController>getController();
        controller.initData(currentEmployer);
        
        stage.show();             
    }
}
