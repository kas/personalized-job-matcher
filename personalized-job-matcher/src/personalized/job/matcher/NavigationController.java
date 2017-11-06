
package personalized.job.matcher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NavigationController {
    JobSeeker jobSeeker;
    Parent root1;
    Stage stage;
    
    public NavigationController(JobSeeker jobSeeker){
        this.jobSeeker = jobSeeker;
        
	System.out.println(jobSeeker.getUsername());
        System.out.println(jobSeeker.getAge());
	
        try {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NavigationUi.fxml"));
                
                root1 = (Parent) fxmlLoader.load();
                
		//NavigationUiController controller = fxmlLoader.<NavigationUiController>getController();

		NavigationUiController customController = new NavigationUiController(this.jobSeeker);
                
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