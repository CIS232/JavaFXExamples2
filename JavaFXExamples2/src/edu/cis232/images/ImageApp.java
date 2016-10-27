package edu.cis232.images;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImageApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Load the fxml
		Parent parent = FXMLLoader.load(getClass().getResource("image.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Set & show the stage
		primaryStage.setTitle("Image!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
