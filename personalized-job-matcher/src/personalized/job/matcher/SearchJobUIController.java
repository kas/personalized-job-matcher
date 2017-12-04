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
public class SearchJobUIController implements Initializable {

    private JobSeeker currentJobSeeker;

    private ArrayList<Job> allJobs = new ArrayList<Job>();
    private EmployerList employerList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheEmployerList();
    private List<Job> searchList = new ArrayList();
    private CareerProfileList careerProfileList = new CareerProfileList();
    private String keywordString;
    private ListProperty<String> listProperty = new SimpleListProperty<>();
    private ObservableList<String> observableArrayList;
    private Collection<Job> jobs = searchList;
    @FXML
    private ListView searchResults;

    @FXML
    private TextField Keyword;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void initData(JobSeeker jobSeeker) {

        currentJobSeeker = jobSeeker;
        addJobLists(employerList.getEmployerList());

    }

    public ArrayList<Job> addJobLists(ArrayList<Employer> employerL) {
        ArrayList<Job> tempList = new ArrayList<>();
        for (int i = 0; i < employerL.size(); i++) {
            tempList = employerL.get(i).getJobs();
            allJobs.addAll(tempList);
        }
        return allJobs;
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

        jobs = allJobs.stream().filter((d) -> d.getTitle().toLowerCase().contains(keywordString)).collect(Collectors.toList());

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

    /**
     * @return the currentJobSeeker
     */
    public JobSeeker getCurrentJobSeeker() {
        return currentJobSeeker;
    }

    /**
     * @param currentJobSeeker the currentJobSeeker to set
     */
    public void setCurrentJobSeeker(JobSeeker currentJobSeeker) {
        this.currentJobSeeker = currentJobSeeker;
    }

    /**
     * @return the allJobs
     */
    public ArrayList<Job> getAllJobs() {
        return allJobs;
    }

    /**
     * @param allJobs the allJobs to set
     */
    public void setAllJobs(ArrayList<Job> allJobs) {
        this.allJobs = allJobs;
    }

    /**
     * @return the employerList
     */
    public EmployerList getEmployerList() {
        return employerList;
    }

    /**
     * @param employerList the employerList to set
     */
    public void setEmployerList(EmployerList employerList) {
        this.employerList = employerList;
    }

    /**
     * @return the searchList
     */
    public List<Job> getSearchList() {
        return searchList;
    }

    /**
     * @param searchList the searchList to set
     */
    public void setSearchList(List<Job> searchList) {
        this.searchList = searchList;
    }

    /**
     * @return the careerProfileList
     */
    public CareerProfileList getCareerProfileList() {
        return careerProfileList;
    }

    /**
     * @param careerProfileList the careerProfileList to set
     */
    public void setCareerProfileList(CareerProfileList careerProfileList) {
        this.careerProfileList = careerProfileList;
    }

    /**
     * @return the keywordString
     */
    public String getKeywordString() {
        return keywordString;
    }

    /**
     * @param keywordString the keywordString to set
     */
    public void setKeywordString(String keywordString) {
        this.keywordString = keywordString;
    }

    /**
     * @return the listProperty
     */
    public ListProperty<String> getListProperty() {
        return listProperty;
    }

    /**
     * @param listProperty the listProperty to set
     */
    public void setListProperty(ListProperty<String> listProperty) {
        this.listProperty = listProperty;
    }

    /**
     * @return the observableArrayList
     */
    public ObservableList<String> getObservableArrayList() {
        return observableArrayList;
    }

    /**
     * @param observableArrayList the observableArrayList to set
     */
    public void setObservableArrayList(ObservableList<String> observableArrayList) {
        this.observableArrayList = observableArrayList;
    }

    /**
     * @return the jobs
     */
    public Collection<Job> getJobs() {
        return jobs;
    }

    /**
     * @param jobs the jobs to set
     */
    public void setJobs(Collection<Job> jobs) {
        this.jobs = jobs;
    }

    /**
     * @return the searchResults
     */
    public ListView getSearchResults() {
        return searchResults;
    }

    /**
     * @param searchResults the searchResults to set
     */
    public void setSearchResults(ListView searchResults) {
        this.searchResults = searchResults;
    }

    /**
     * @return the Keyword
     */
    public TextField getKeyword() {
        return Keyword;
    }

    /**
     * @param Keyword the Keyword to set
     */
    public void setKeyword(TextField Keyword) {
        this.Keyword = Keyword;
    }

}
