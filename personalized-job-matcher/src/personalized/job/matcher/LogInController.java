package personalized.job.matcher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogInController implements Initializable {

    private JobSeekerList jobSeekerList;
    private JobSeeker currentJobSeeker;
    private Employer currentEmployer;
    private EmployerList employerList;
    @FXML
    private TextField username;
    @FXML
    private PasswordField pw;

    public LogInController() {
        jobSeekerList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheJobSeekerList();
        employerList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheEmployerList();
    }

    @FXML
    protected void handleJobSeekerLoginButtonAction(ActionEvent event) throws IOException {
        handleLoginButtonAction(false);
    }

    @FXML
    protected void handleEmployerLoginButtonAction(ActionEvent event) throws IOException {
        handleLoginButtonAction(true);
    }

    private void handleLoginButtonAction(boolean isEmployer) throws IOException {
        String userText = username.getText();
        String passwordText = pw.getText();
        boolean loginResult;

        if (isEmployer) {
            loginResult = validateEmployerUserPass(employerList.getEmployerList(), userText, passwordText);
            if (loginResult) {
                authenticatePass(true);
            } else {
                authenticateFailed();
            }
        } else {
            loginResult = validateJobSeekerUserPass(jobSeekerList.getJobSeekerList(), userText, passwordText);
            if (loginResult) {
                authenticatePass(false);
            } else {
                authenticateFailed();
            }
        }
    }

    @FXML
    protected void handleCreateButtonAction(ActionEvent event) {
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();
        CreateProfileUIController createProfileContrl = new CreateProfileUIController();

    }

    public void authenticatePass(boolean isEmployer) throws IOException {
        loginSuccessPrompt();
        Stage stage = (Stage) username.getScene().getWindow();
        stage.close();

        FXMLLoader loader;

        if (isEmployer) {
            loader = new FXMLLoader(getClass().getResource("EmployerNavigationUi.fxml"));
        } else {
            loader = new FXMLLoader(getClass().getResource("JobSeekerNavigationUi.fxml"));
        }
        stage.setScene(new Scene((Pane) loader.load()));

        if (isEmployer) {
            EmployerNavigationUiController controller = loader.<EmployerNavigationUiController>getController();
            controller.initData(this.currentEmployer);
        } else {
            JobSeekerNavigationUiController controller = loader.<JobSeekerNavigationUiController>getController();
            controller.initData(this.currentJobSeeker);
        }

        stage.show();
    }

    public void authenticateFailed() {
        loginFailPrompt();
    }

    public boolean validateJobSeekerUserPass(ArrayList<JobSeeker> userList, String userName, String password) {
        boolean flag = false;
        boolean authenticateFlag = false;
        for (JobSeeker object : userList) {
            if (object.getUsername().equalsIgnoreCase(userName)) {
                flag = true;
                if (flag == true && object.getPassword().equals(password)) {
                    authenticateFlag = true;
                    currentJobSeeker = object;
                }
            }
        }
        return authenticateFlag;
    }

    public boolean validateEmployerUserPass(ArrayList<Employer> userList, String userName, String password) {
        boolean flag = false;
        boolean authenticateFlag = false;
        for (Employer object : userList) {
            if (object.getUsername().equalsIgnoreCase(userName)) {
                flag = true;
                if (flag == true && object.getPassword().equals(password)) {
                    authenticateFlag = true;
                    currentEmployer = object;
                }
            }
        }
        return authenticateFlag;
    }

    public void loginFailPrompt() {

        JOptionPane.showMessageDialog(new JPanel(),
                "Incorrect username or password",
                "Login Error",
                JOptionPane.ERROR_MESSAGE);

    }

    public void loginSuccessPrompt() {
        JOptionPane.showMessageDialog(new JPanel(),
                "Login successful!",
                "Login Success",
                JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * @return the userList
     */
    public JobSeekerList getUserList() {
        return jobSeekerList;
    }

    /**
     * @param userList the userList to set
     */
    public void setJobSeekerList(JobSeekerList userList) {
        this.jobSeekerList = userList;
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
     * @return the pw
     */
    public PasswordField getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(PasswordField pw) {
        this.pw = pw;
    }

    /**
     * @return the jobSeekerList
     */
    public JobSeekerList getJobSeekerList() {
        return jobSeekerList;
    }

    /**
     * @return the currentEmployer
     */
    public Employer getCurrentEmployer() {
        return currentEmployer;
    }

    /**
     * @param currentEmployer the currentEmployer to set
     */
    public void setCurrentEmployer(Employer currentEmployer) {
        this.currentEmployer = currentEmployer;
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

}
