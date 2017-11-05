
package personalized.job.matcher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class NavigationController {
    
    JobSeekerList userList;
    JobSeeker currentJobSeeker;
    Parent root1;
    Stage stage;
    
    
    public NavigationController(JobSeeker newJobSeeker){
        this.currentJobSeeker = newJobSeeker;
        System.out.println(currentJobSeeker.getUsername());
        System.out.println(currentJobSeeker.getAge());
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NavigationUi.fxml"));
                
                root1 = (Parent) fxmlLoader.load();
                //NavigationUiController controller = fxmlLoader.<NavigationUiController>getController();
                NavigationUiController customController = new NavigationUiController(currentJobSeeker);
                //controller.setCurrentJobSeeker(currentJobSeeker);
                fxmlLoader.setController(customController);
                stage = new Stage();
                stage.setScene(new Scene(root1));                
                stage.show();
                
                
                
        } catch(Exception e) {
           e.printStackTrace();
          }
        
    }
}
