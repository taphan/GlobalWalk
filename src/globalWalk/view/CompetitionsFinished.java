package globalWalk.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class CompetitionsFinished {

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
