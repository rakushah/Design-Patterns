package momento;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MementoApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {

		primaryStage.setTitle("Memento Design Pattern");
		Pane myPane = (Pane) FXMLLoader.load(getClass().getResource("createUser.fxml"));
		Scene myScene = new Scene(myPane);
		primaryStage.setScene(myScene);
		primaryStage.show();

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
