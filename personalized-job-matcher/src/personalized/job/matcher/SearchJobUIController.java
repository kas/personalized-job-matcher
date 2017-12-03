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
import java.util.Collection;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
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
    private Employer tempEmployer;
    private String keywordString;
    
    @FXML private TextField Keyword;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initData(JobSeeker jobSeeker) {
            //System.out.println("hello");
            currentJobSeeker = jobSeeker;
            //System.out.println(jobSeeker.getUsername());
        }
    
    
    @FXML protected void handleCancelButtonAction(ActionEvent event) throws IOException {
            Stage stage = (Stage) Keyword.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
            stage.setScene(new Scene((Pane) loader.load()));
            
            JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
            controller.initData(this.currentJobSeeker);
        
            stage.show();    
        }
    @FXML protected void handleSearchButtonAction(ActionEvent event) throws IOException {
            keywordString = Keyword.getText().toLowerCase();
            //tempEmployer.getJobs();
            Collection<Job> jobs = tempEmployer.getJobs().stream().filter((d) -> d.getTitle().toLowerCase().equals(keywordString)).collect(Collectors.toList());
            System.out.println(jobs);
            //System.out.println(keywordString);
        }
     
}
