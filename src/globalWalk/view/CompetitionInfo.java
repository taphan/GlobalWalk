package globalWalk.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CompetitionInfo {
	
	@FXML private TextField toggleBackground;
	@FXML private Button offButton;
	@FXML private Button onButton;
	@FXML private Button joinButton;
	@FXML private Button leaveButton;
	
	
	@FXML 
	private void initialize() {
		onButton.setVisible(false);
		toggleBackground.disabledProperty();
		toggleBackground.setDisable(true);
		joinButton.setVisible(false);
		
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
	
	public void onJoinPress(){
		joinButton.setVisible(false);
		leaveButton.setVisible(true);
	}
	
	public void onLeavePress(){
		joinButton.setVisible(true);
		leaveButton.setVisible(false);
	}


}
