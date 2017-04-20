package globalWalk.view;

import javafx.fxml.FXML; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

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

    @FXML
    public void dellBackButtonClick(MouseEvent event) throws IOException{
        Parent rankingPage = FXMLLoader.load(getClass().getResource("CompetitionsActive.fxml"));
        Scene rankingScene = new Scene(rankingPage);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(rankingScene);
        appStage.show();
    }

    @FXML
    public void ntnuBackButtonClick(MouseEvent event) throws IOException{
        Parent rankingPage = FXMLLoader.load(getClass().getResource("CompetitionsActive2.fxml"));
        Scene rankingScene = new Scene(rankingPage);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(rankingScene);
        appStage.show();
    }

}
