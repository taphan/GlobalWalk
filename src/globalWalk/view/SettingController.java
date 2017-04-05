package globalWalk.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SettingController extends MasterController{
	
	@FXML private TextField toggleBackground;
	@FXML private Button offButton;
	@FXML private Button onButton;
	
	
	@FXML 
	private void initialize() {
		onButton.setVisible(false);
		toggleBackground.disabledProperty();
		toggleBackground.setDisable(true);
	}
	
	public void offButtonPress(){
		toggleBackground.setStyle("-fx-base: green; -fx-background-radius: 20;");
		offButton.setVisible(false);
		onButton.setVisible(true);
	}
	
	public void onButtonPress(){
		toggleBackground.setStyle("-fx-base: lightgray; -fx-background-radius: 20;");
		offButton.setVisible(true);
		onButton.setVisible(false);
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


