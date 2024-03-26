package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws IOException {
		
		
		Parent root = FXMLLoader.load(getClass().getResource("Mp3Player.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("My_MP3_Player");
		stage.getIcons().add(new Image("C:\\Users\\satish\\OneDrive\\Desktop\\WorkSpaces\\JavaFX\\Mp3Player\\images\\Music.jpeg"));
		stage.show();
		
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent arg0) {
				
				Platform.exit();
				System.exit(0);	
			}		
		});
	}	

	public static void main(String[] args) {
		launch(args);
	}
}
