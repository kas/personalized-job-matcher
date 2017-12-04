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
import javafx.application.Application;
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
    
    @FXML private TextField title;
    @FXML private TextArea description;
    @FXML private ListView listView;
    private CareerProfileList careerProfileList;

    protected ListProperty<String> listProperty = new SimpleListProperty<>();
    
    public void initData(Employer employer) {
        this.currentEmployer = employer;
        
        //careerProfileList = new CareerProfileList(); // size 2
        careerProfileList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheCareerProfileList();
//        ObservableList<CareerProfile> careerProfiles = FXCollections.observableArrayList();
//        careerProfiles.addAll(careerProfileList.getCareerProfileList());
//        
//        System.out.println(careerProfiles.size()); // size 2
        
        
        
        listView.itemsProperty().bind(listProperty);
        
        ObservableList<String> observableArrayList = FXCollections.observableArrayList();
        
        for (CareerProfile careerProfile : careerProfileList.getCareerProfileList()) {
            String string = careerProfile.toString();
            observableArrayList.add(new String(string) );
        }
        
        listProperty.set(FXCollections.observableArrayList(observableArrayList));
    }
    
    @FXML protected void handleCancelAction(ActionEvent event) throws IOException {
        System.out.println("Canceled");
        
        Stage stage = (Stage) title.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            EmployerNavigationUiController controller = loader.<EmployerNavigationUiController>getController();
            controller.initData(this.currentEmployer);
        
            stage.show();    
    }
    
    @FXML protected void handleSubmitAction(ActionEvent event) throws IOException {
        int careerProfileIndex =  listView.getSelectionModel().getSelectedIndex();
        CareerProfile careerProfile = careerProfileList.getCareerProfileList().get(careerProfileIndex);
        
        Job job = new Job(title.getText(), description.getText(), careerProfile);
        
        ArrayList<Job> jobs = currentEmployer.getJobs();
        
        jobs.add(job);
        currentEmployer.setJobs(jobs);
        PersistentDataController.getPersistentDataController().writeJSONDataModel();
        
        System.out.println("Submitted Job");
         System.out.println("Title: " + job.getTitle() + " Description: " + job.getDescription() + " Career Profile: " + careerProfile.getName());
        
        Stage stage = (Stage) title.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployerNavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        EmployerNavigationUiController controller = loader.<EmployerNavigationUiController>getController();
        controller.initData(currentEmployer);
        
        stage.show();             
    }
}
