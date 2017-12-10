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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kenneth Schnall
 */
public class JobSuitabilityUiController implements Initializable {

    private JobSeeker currentJobSeeker;

    @FXML
    private ListView results;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void initData(JobSeeker jobSeeker) {
        ArrayList<Job> displayedJobs = new ArrayList<>();
        ArrayList<String> displayedJobsPersonalities = new ArrayList<>();
        ArrayList<Job> jobs = new ArrayList<>();
        currentJobSeeker = jobSeeker;

        EmployerList employerList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheEmployerList();
        ArrayList<Employer> employers;
        employers = employerList.getEmployerList();

        for (int i = 0; i < employers.size(); i++) {
            for (int j = 0; j < employers.get(i).getJobs().size(); j++) {
                jobs.add(employers.get(i).getJobs().get(j)); // get all jobs
            }
        }

        // get testanswers
        ArrayList<String> answers = currentJobSeeker.getTestAnswers();
        try {

            // get all jobs that match testanswers
            nextJob:
            for (int i = 0; i < jobs.size(); i++) {
                for (int j = 0; j < jobs.get(i).getCareerProfile().getPersonalityTraits().size(); j++) {
                    for (int k = 0; k < answers.size(); k++) {
                        if (jobs.get(i).getCareerProfile().getPersonalityTraits().get(j).equals(answers.get(k))) {
                            displayedJobsPersonalities.add(answers.get(k));
                            displayedJobs.add(jobs.get(i));
                            continue nextJob;
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        ObservableList<String> observableArrayList = FXCollections.observableArrayList();

        ListProperty<String> listProperty = new SimpleListProperty<>();
        listProperty.set(FXCollections.observableArrayList(observableArrayList));

        for (int i = 0; i < displayedJobs.size(); i++) {
            String string = displayedJobs.get(i).getTitle();

            string += " - Personality Match: " + displayedJobsPersonalities.get(i);

            observableArrayList.add(new String(string));
        }

        if (displayedJobs.size() <= 0) {
            observableArrayList.add("No results to display! Consider (re)taking the Personality Test.");
        }

        results.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.observableArrayList(observableArrayList));
    }

    @FXML
    protected void handleCancelButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) results.getScene().getWindow();
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
}
