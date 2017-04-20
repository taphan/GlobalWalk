package globalWalk.view;

import java.io.IOException; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MasterController {

    // Profil siden bruker denne som Controller, siden den har ingen spesielle funksjoner.

    public void clickProfile(MouseEvent mouseEvent) throws IOException {
    	Parent homePage = FXMLLoader.load(getClass().getResource("profile.fxml"));
		Scene homeScene = new Scene(homePage);
		Stage appStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
		appStage.setScene(homeScene);
		appStage.show();
    }

    public void clickList(MouseEvent mouseEvent) throws IOException {
    	Parent homePage = FXMLLoader.load(getClass().getResource("CompetitionsActive.fxml"));
		Scene homeScene = new Scene(homePage);
		Stage appStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
		appStage.setScene(homeScene);
		appStage.show();
    }

    public void clickCompetition(MouseEvent mouseEvent) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("ranking.fxml"));
		Scene homeScene = new Scene(homePage);
		Stage appStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
		appStage.setScene(homeScene);
		appStage.show();
        
 
    		
    }

    public void clickHome(MouseEvent mouseEvent) throws IOException {
    	Parent homePage = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
		Scene homeScene = new Scene(homePage);
		Stage appStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
		appStage.setScene(homeScene);
		appStage.show();
    }

    public void clickStep(MouseEvent mouseEvent) throws IOException {
    	Parent homePage = FXMLLoader.load(getClass().getResource("Pedometer.fxml"));
		Scene homeScene = new Scene(homePage);
		Stage appStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
		appStage.setScene(homeScene);
		appStage.show();
    }

    public void clickSettings(MouseEvent mouseEvent) throws IOException {
    	Parent homePage = FXMLLoader.load(getClass().getResource("settings.fxml"));
		Scene homeScene = new Scene(homePage);
		Stage appStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
		appStage.setScene(homeScene);
		appStage.show();
    }
}
