package globalWalk.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;

public class PedometerController extends MasterController {
	
	@FXML private TextField addSteps;
	@FXML private Text dailySteps;
	@FXML private Text leftSteps;
	@FXML private Button addStepsbutton;
	@FXML private ToggleButton manual;
	@FXML private Text errorAddSteps;
	
	@FXML 
	private void initialize() {
		errorAddSteps.setVisible(false);
		addSteps.disabledProperty();
		addStepsbutton.disabledProperty();
		addSteps.setDisable(true);
		addStepsbutton.setDisable(true);
	}
		
	
	public void onManualButtonPress(){
		manual.selectedProperty();
		if (manual.isSelected()){
			addSteps.setDisable(false);
			addStepsbutton.setDisable(false);
			manual.setStyle("-fx-base: lightgreen;");
		}
		else{
			addSteps.setDisable(true);
			addStepsbutton.setDisable(true);
			manual.setStyle("-fx-base: lightgray;");
		}
	}
	
	void validate(String value, String regex, TextField textField){
		boolean isValid = value.matches(regex);
		String color = isValid ? "white" : "red";
		textField.setStyle("-fx-background-color: " + color);  // Turns red when incorrect. 
	}
	
	public void isAddStepsValid(String value){ //TODO: Can contain minus values
			if (value.length() > 0){
				String regex = "[\\d]+";
				validate(value, regex, addSteps);
				if (!value.matches(regex)){
					errorAddSteps.setVisible(true);	
			}
				if (Integer.valueOf(value) >= 0){ 
					errorAddSteps.setVisible(false);	
				}
			}
	}
	
	public void addDailySteps(String value){
		Integer oldValue = Integer.valueOf(dailySteps.getText());
		Integer newValue = Integer.valueOf(value);
		
		newValue += oldValue;
		String stringNewValue = newValue + "";
		dailySteps.setText(stringNewValue);	
	}
	
	public void addLeftSteps(String value){
		Integer newValue = Integer.valueOf(value);
		String stringNewValue = 10000 - newValue + "";
		leftSteps.setText(stringNewValue);	
	}
	
	public void onAddStepsButtonPress(){
		isAddStepsValid(addSteps.getText());
		addDailySteps(addSteps.getText());
		addLeftSteps(dailySteps.getText());
		
	}
}
