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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
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
public class CreateCareerProfileUiController implements Initializable {

    private Employer currentEmployer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private TextField name;
    @FXML
    private TextField medianSalary;
    @FXML
    private TextArea description;
    @FXML
    private ListView listView;
    private PersonalityTraitList personalityTraitList;
    protected ListProperty<String> listProperty = new SimpleListProperty<>();

    public void initData(Employer employer) {
        this.currentEmployer = employer;

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        personalityTraitList = new PersonalityTraitList();

        listView.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.observableArrayList(personalityTraitList.getPersonalityTraitList()));
    }

    @FXML
    protected void handleCancelAction(ActionEvent event) throws IOException {
        System.out.println("Canceled");

        Stage stage = (Stage) name.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployerNavigationUi.fxml"));
        stage.setScene(new Scene((Pane) loader.load()));

        EmployerNavigationUiController controller = loader.<EmployerNavigationUiController>getController();
        controller.initData(this.currentEmployer);

        stage.show();
    }

    @FXML
    protected void handleSubmitAction(ActionEvent event) throws IOException {
        ArrayList<CareerProfile> newList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheCareerProfileList().getCareerProfileList();

        List<String> personalityTraitsList = listView.getSelectionModel().getSelectedItems();

        CareerProfile careerProfile = new CareerProfile(name.getText(), medianSalary.getText(), description.getText(), personalityTraitsList);

        CareerProfileList careerProfileList = PersistentDataController.getPersistentDataController().getPersistentDataCollection().getTheCareerProfileList();
        careerProfileList.add(careerProfile);
        PersistentDataController.getPersistentDataController().writeJSONDataModel();
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
