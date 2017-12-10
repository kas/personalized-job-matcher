/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Krafty
 */
public class ReviewResultsUIController implements Initializable {

    private JobSeeker currentJobSeeker;
    @FXML
    private Label resultsLabel;
    @FXML
    private ListView results;
    private ArrayList<String> currentTestAnswers;
    private ListProperty<String> listProperty = new SimpleListProperty<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void initData(JobSeeker jobSeeker) {
        try {
            this.currentJobSeeker = jobSeeker;
            results.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            
            currentTestAnswers = currentJobSeeker.getTestAnswers();

            results.itemsProperty().bind(listProperty);
            listProperty.set(FXCollections.observableArrayList(currentTestAnswers));

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

    @FXML
    protected void handleExitButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) resultsLabel.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
        controller.initData(this.currentJobSeeker);

        stage.show();
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
     * @return the resultsLabel
     */
    public Label getResultsLabel() {
        return resultsLabel;
    }

    /**
     * @param resultsLabel the resultsLabel to set
     */
    public void setResultsLabel(Label resultsLabel) {
        this.resultsLabel = resultsLabel;
    }

    /**
     * @return the results
     */
    public ListView getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(ListView results) {
        this.results = results;
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
     * @return the currentTestAnswers
     */
    public ArrayList<String> getCurrentTestAnswers() {
        return currentTestAnswers;
    }

    /**
     * @param currentTestAnswers the currentTestAnswers to set
     */
    public void setCurrentTestAnswers(ArrayList<String> currentTestAnswers) {
        this.currentTestAnswers = currentTestAnswers;
    }
}
