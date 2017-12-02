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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author austi
 */
public class PostJobUiController implements Initializable {
    private Employer currentEmployer;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML private TextField name;
    @FXML private TextArea description;

    private PersonalityTraitList personalityTraitList;
    protected ListProperty<String> listProperty = new SimpleListProperty<>();
    
    public void initData(Employer employer) {
        this.currentEmployer = employer;
        
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        personalityTraitList = new PersonalityTraitList();

        listView.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.observableArrayList(personalityTraitList.getPersonalityTraitList()));
    }
    
    @FXML protected void handleCancelAction(ActionEvent event) throws IOException {
        System.out.println("Canceled");
        
        Stage stage = (Stage) name.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            EmployerNavigationUiController controller = loader.<EmployerNavigationUiController>getController();
            controller.initData(this.currentEmployer);
        
            stage.show();    
    }
    
    @FXML protected void handleSubmitAction(ActionEvent event) throws IOException {
        ArrayList<CareerProfile> newList = new ArrayList<CareerProfile>();
        
        List<String> personalityTraitsList = listView.getSelectionModel().getSelectedItems();
        
        CareerProfile careerProfile = new CareerProfile(name.getText(), medianSalary.getText(), description.getText(), personalityTraitsList);

        CareerProfileList careerProfileList = new CareerProfileList();
        careerProfileList.add(careerProfile);
        
        System.out.println("Submitted Career Profile");
        
        Stage stage = (Stage) name.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployerNavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        EmployerNavigationUiController controller = loader.<EmployerNavigationUiController>getController();
        controller.initData(currentEmployer);
        
        stage.show();             
    }
}
