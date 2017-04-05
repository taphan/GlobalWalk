package globalWalk;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private Pane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("GlobalWalk");
		showMainView();
	}
	
	private void showMainView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
<<<<<<< HEAD
		loader.setLocation(Main.class.getResource("view/ranking.fxml"));
=======
		loader.setLocation(Main.class.getResource("view/settings.fxml"));
>>>>>>> 56ff9e814265e25fbdb36f47b44d5998b56916e3
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
