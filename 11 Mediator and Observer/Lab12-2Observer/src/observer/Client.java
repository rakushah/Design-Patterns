package observer;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Client extends Application{

    public static void main(String[] args) {
        Application.launch(Client.class, (String[])null);
    }


	@Override
	public void start(Stage primaryStage) throws Exception {
        try {
        	AnchorPane page = FXMLLoader.load(Client.class.getResource("Main.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Demo App");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
