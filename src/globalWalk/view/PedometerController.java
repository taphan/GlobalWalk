package globalWalk.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class PedometerController extends MasterController {
	
	@FXML private TextField addSteps;
	@FXML private Text dailySteps;
	@FXML private Text leftSteps;
	@FXML private Button addStepsbutton;
	@FXML private Text errorAddSteps;
	@FXML private TextField toggleBackground;
	@FXML private Button offButton;
	@FXML private Button onButton;

	@FXML 
	private void initialize() {
		errorAddSteps.setVisible(false);
		onButton.setVisible(false);
		addSteps.disabledProperty();
		toggleBackground.disabledProperty();
		addStepsbutton.disabledProperty();
		toggleBackground.setDisable(true);
		addSteps.setDisable(true);
		addStepsbutton.setDisable(true);
	}
		
	
	public void offButtonPress(){
		addSteps.setDisable(false);
		addStepsbutton.setDisable(false);
		toggleBackground.setStyle("-fx-base: green; -fx-background-radius: 20;");
		offButton.setVisible(false);
		onButton.setVisible(true);
	}
	
	public void onButtonPress(){
		addSteps.setDisable(true);
		addStepsbutton.setDisable(true);
		toggleBackground.setStyle("-fx-base: lightgray; -fx-background-radius: 20;");
		offButton.setVisible(true);
		onButton.setVisible(false);
	}
	
	void validate(String value, String regex, TextField textField){
		boolean isValid = value.matches(regex);
		String color = isValid ? "white" : "red";
		textField.setStyle("-fx-background-color: " + color);  // Turns red when incorrect. 
	}
	
	public void isAddStepsValid(String value){
			if (value.length() > 0){
				String regex = "-?[\\d]+"; // Only digits ect. -70 and 70
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
