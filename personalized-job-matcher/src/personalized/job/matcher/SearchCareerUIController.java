/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;
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
public class SearchCareerUIController implements Initializable {

    private JobSeeker currentJobSeeker;

    private ArrayList<CareerProfile> allCareers = new ArrayList<>();
    private EmployerList employerList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheEmployerList();
    private List<CareerProfile> searchList = new ArrayList();
    private CareerProfileList careerProfileList = new CareerProfileList();
    private String keywordString;
    private ListProperty<String> listProperty = new SimpleListProperty<>();
    private ObservableList<String> observableArrayList;
    private Collection<CareerProfile> careers = searchList;
    @FXML
    private ListView searchResults;

    @FXML
    private TextField Keyword;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void initData(JobSeeker jobSeeker) {

        currentJobSeeker = jobSeeker;
        addCareerLists(employerList.getEmployerList());

    }

    public ArrayList<CareerProfile> addCareerLists(ArrayList<Employer> employerL) {
        ArrayList<CareerProfile> tempList = new ArrayList<>();
        for (int i = 0; i < employerL.size(); i++) {
            tempList = employerL.get(i).getCareerProfileList();
            allCareers.addAll(tempList);
        }
        return allCareers;
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

        searchList = (List<CareerProfile>) careers;
        listProperty.set(FXCollections.observableArrayList(observableArrayList));
        searchResults.getItems().clear();
        searchResults.refresh();

        keywordString = Keyword.getText().toLowerCase();

        careers = allCareers.stream().filter((d) -> d.getName().toLowerCase().contains(keywordString)).collect(Collectors.toList());

        searchList = (List<CareerProfile>) careers;

        for (int i = 0; i < searchList.size(); i++) {

            String string = searchList.get(i).getName();
            observableArrayList.add(string);
        }
        searchResults.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        searchResults.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.observableArrayList(observableArrayList));

    }

    private void clearData() {
        observableArrayList.clear();
        careers.clear();
        searchList.clear();
        searchResults.getItems().clear();
        searchResults.refresh();
    }

    public static boolean stringContainsItemFromList(String inputStr, ObservableList<String> observableArrayList) {
        return observableArrayList.parallelStream().anyMatch(inputStr::contains);
    }
}
