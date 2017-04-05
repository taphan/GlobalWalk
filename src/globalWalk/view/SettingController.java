package globalWalk.view;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class SettingController extends MasterController{
	
	@FXML private ToggleButton anonymous;
	
	
	public void onAnoButtonPress(){
		anonymous.selectedProperty();
		if(anonymous.isSelected()){
			anonymous.setStyle("-fx-base: lightgreen;");
		}
		else{
			anonymous.setStyle("-fx-base: lightgray;");
		}
		
	}

}


