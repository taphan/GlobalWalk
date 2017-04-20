package globalWalk.view;

import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CompetitionsActive {

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

    @FXML
    private void dellCompetitionClick(MouseEvent event) throws IOException {
        Parent rankingPage = FXMLLoader.load(getClass().getResource("competition-info.fxml"));
        Scene rankingScene = new Scene(rankingPage);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(rankingScene);
        appStage.show();
    }

    @FXML
    private void ntnuCompetitionClick(MouseEvent event) throws IOException {
        Parent rankingPage = FXMLLoader.load(getClass().getResource("compinfoOsloNP.fxml"));
        Scene rankingScene = new Scene(rankingPage);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(rankingScene);
        appStage.show();
    }

    @FXML
    private void nextButtonClick(ActionEvent event) throws IOException {
        Parent rankingPage = FXMLLoader.load(getClass().getResource("CompetitionsActive2.fxml"));
        Scene rankingScene = new Scene(rankingPage);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(rankingScene);
        appStage.show();
    }

    @FXML
    private void prevButtonClick(ActionEvent event) throws IOException {
        Parent rankingPage = FXMLLoader.load(getClass().getResource("CompetitionsActive.fxml"));
        Scene rankingScene = new Scene(rankingPage);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(rankingScene);
        appStage.show();
    }

    @FXML
    private void toFinishClick(ActionEvent event) throws IOException {
        Parent rankingPage = FXMLLoader.load(getClass().getResource("CompetitionsFinished.fxml"));
        Scene rankingScene = new Scene(rankingPage);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(rankingScene);
        appStage.show();
    }
}
