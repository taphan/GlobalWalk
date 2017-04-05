package globalWalk.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ranking2Controller {
	
	@FXML private Button previousButton;

	@FXML
	private void buttonClick(ActionEvent event) throws IOException {
		Parent rankingPage = FXMLLoader.load(getClass().getResource("ranking.fxml"));
		Scene rankingScene = new Scene(rankingPage);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(rankingScene);
		appStage.show();
	}
	

}
