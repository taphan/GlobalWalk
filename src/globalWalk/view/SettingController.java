package globalWalk.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

}


