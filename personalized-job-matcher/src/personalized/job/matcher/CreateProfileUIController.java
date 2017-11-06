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
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author austi
 */
public class CreateProfileUIController implements Initializable {

    private Parent root1;
    private Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateProfileUI.fxml"));
                
                root1 = (Parent) fxmlLoader.load();
                CreateProfileUIController customController = new CreateProfileUIController();
                fxmlLoader.setController(customController);
                stage = new Stage();
                stage.setScene(new Scene(root1));                
                stage.show();
                
                
                
        } catch(Exception e) {
           e.printStackTrace();
          }
    }    
    @FXML private Text actiontarget;
    @FXML private TextField username;
    @FXML private TextField password;
    @FXML private TextField name;
    @FXML private TextField age;
    @FXML private TextField location;
    @FXML private TextField sex;
    @FXML private TextField currentJob;
    @FXML private AnchorPane ap;
    
    @FXML protected void handleSubmitAction(ActionEvent event) throws IOException {
        ArrayList<JobSeeker> newList = new ArrayList<JobSeeker>();
        JobSeeker newJobSeeker = new JobSeeker(username.getText(), name.getText(), 7, password.getText(), 
            age.getText(), location.getText(), sex.getText(), currentJob.getText());
        //JobSeekerList.JobSeekerList.add(newJobSeeker);
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        NavigationUiController controller = loader.<NavigationUiController>getController();
        controller.initData(newJobSeeker);
        
        stage.show();             
    }
    
     @FXML protected void handleCancelAction(ActionEvent event) {
        Stage stage = (Stage) ap.getScene().getWindow();
        stage.close();
        LogInController logInContrl = new LogInController();
    }

    /**
     * @return the root1
     */
    public Parent getRoot1() {
        return root1;
    }

    /**
     * @param root1 the root1 to set
     */
    public void setRoot1(Parent root1) {
        this.root1 = root1;
    }

    /**
     * @return the stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * @param stage the stage to set
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * @return the actiontarget
     */
    public Text getActiontarget() {
        return actiontarget;
    }

    /**
     * @param actiontarget the actiontarget to set
     */
    public void setActiontarget(Text actiontarget) {
        this.actiontarget = actiontarget;
    }

    /**
     * @return the username
     */
    public TextField getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(TextField username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public TextField getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(TextField password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public TextField getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(TextField name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public TextField getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(TextField age) {
        this.age = age;
    }

    /**
     * @return the location
     */
    public TextField getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(TextField location) {
        this.location = location;
    }

    /**
     * @return the sex
     */
    public TextField getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(TextField sex) {
        this.sex = sex;
    }

    /**
     * @return the currentJob
     */
    public TextField getCurrentJob() {
        return currentJob;
    }

    /**
     * @param currentJob the currentJob to set
     */
    public void setCurrentJob(TextField currentJob) {
        this.currentJob = currentJob;
    }

    /**
     * @return the ap
     */
    public AnchorPane getAp() {
        return ap;
    }

    /**
     * @param ap the ap to set
     */
    public void setAp(AnchorPane ap) {
        this.ap = ap;
    }
    
}
