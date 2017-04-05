package globalWalk.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class RankingNoCompController {
	
	@FXML private ToggleButton tableButton;

	@FXML
	private void goToMap(ActionEvent event) throws IOException {
		Parent mapPage = FXMLLoader.load(getClass().getResource("rankingMap.fxml"));
		Scene mapScene = new Scene(mapPage);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(mapScene);
		appStage.show();
	}
	
	//Metoder for å gå til de ulike sidene i menyen.
			private final MasterController masterController = new MasterController();
			
			@FXML
			public void clickProfile(MouseEvent mouseEvent) throws IOException {
				masterController.clickProfile(mouseEvent);
			}
			
			@FXML
			public void clickList(MouseEvent mouseEvent) throws IOException {
				masterController.clickList(mouseEvent);
			}
			
			@FXML
			public void clickCompetition(MouseEvent mouseEvent) throws IOException {
				masterController.clickCompetition(mouseEvent);
			}
			
			@FXML
			public void clickHome(MouseEvent mouseEvent) throws IOException {
				masterController.clickHome(mouseEvent);
			}
			
			@FXML
			public void clickStep(MouseEvent mouseEvent) throws IOException {
				masterController.clickStep(mouseEvent);
			}
			
			@FXML
			public void clickSettings(MouseEvent mouseEvent) throws IOException {
				masterController.clickSettings(mouseEvent);
			}
}
