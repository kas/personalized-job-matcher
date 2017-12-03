/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Krafty
 */
public class SearchJobUIController implements Initializable {

    private JobSeeker currentJobSeeker;
    private ArrayList<Job> testJobs = new ArrayList<Job>();
    List<Job> searchList = new ArrayList();
    private CareerProfileList careerProfileList = new CareerProfileList();
    private String keywordString;
    protected ListProperty<String> listProperty = new SimpleListProperty<>();
    ObservableList<String> observableArrayList;
    Collection<Job> jobs = searchList;
    @FXML
    private ListView searchResults;

    @FXML
    private TextField Keyword;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void addJobs() {
        Job testjob1 = new Job("Software Engineer", "Tests the testing test", careerProfileList.getCareerProfileList().get(0));
        Job testjob2 = new Job("Application Developer", "Tests the testing test", careerProfileList.getCareerProfileList().get(0));
        Job testjob3 = new Job("Code Tester", "Tests the testing test", careerProfileList.getCareerProfileList().get(0));
        Job testjob4 = new Job("Game Designer", "Tests the testing test", careerProfileList.getCareerProfileList().get(0));
        Job testjob5 = new Job("Cashier", "Tests the testing test", careerProfileList.getCareerProfileList().get(1));
        Job testjob6 = new Job("Manager", "Tests the testing test", careerProfileList.getCareerProfileList().get(1));
        Job testjob7 = new Job("Supervisor", "Tests the testing test", careerProfileList.getCareerProfileList().get(1));
        Job testjob8 = new Job("Stocker", "Tests the testing test", careerProfileList.getCareerProfileList().get(1));
        Job testjob9 = new Job("Janitor", "Tests the testing test", careerProfileList.getCareerProfileList().get(1));

        testJobs.add(testjob1);
        testJobs.add(testjob2);
        testJobs.add(testjob3);
        testJobs.add(testjob4);
        testJobs.add(testjob5);
        testJobs.add(testjob6);
        testJobs.add(testjob7);
        testJobs.add(testjob8);
        testJobs.add(testjob9);

    }

    public void initData(JobSeeker jobSeeker) {
        //System.out.println("hello");
        currentJobSeeker = jobSeeker;
        addJobs();
        //System.out.println(jobSeeker.getUsername());
    }

    @FXML
    protected void handleCancelButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) Keyword.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
        controller.initData(this.currentJobSeeker);

        stage.show();
    }

    @FXML
    protected void handleSearchButtonAction(ActionEvent event) throws IOException {
        
        
        
        observableArrayList = FXCollections.observableArrayList();
        
        clearData();
        
        observableArrayList.clear();
        jobs.clear();
        
        searchList = (List<Job>) jobs;
        listProperty.set(FXCollections.observableArrayList(observableArrayList));
        searchResults.getItems().clear();
        searchResults.refresh();
        
        keywordString = Keyword.getText().toLowerCase();
        
        
        jobs = testJobs.stream().filter((d) -> d.getTitle().toLowerCase().contains(keywordString)).collect(Collectors.toList());
        
        
        searchList = (List<Job>) jobs;

        for (int i = 0; i < searchList.size(); i++) {

            String string = searchList.get(i).getTitle().toString();
            observableArrayList.add(new String(string));
        }
        searchResults.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        searchResults.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.observableArrayList(observableArrayList));
        
        
    }
    
    

    private void clearData() {
        observableArrayList.clear();
        jobs.clear();
        searchList.clear();    
        searchResults.getItems().clear();
        searchResults.refresh();
    }
    
    public static boolean stringContainsItemFromList(String inputStr, ObservableList<String> observableArrayList) {
        return observableArrayList.parallelStream().anyMatch(inputStr::contains);
}
    
    

}
