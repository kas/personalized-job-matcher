
package personalized.job.matcher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class NavigationController {
    
    JobSeekerList userList;
    Parent root1;
    Stage stage;
    
    public NavigationController(JobSeekerList newUserList){
        this.userList = newUserList;
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NavigationUi.fxml"));
                root1 = (Parent) fxmlLoader.load();
                stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
        
    }
}
