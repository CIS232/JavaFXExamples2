package edu.cis232.radiobuttons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RadioButtonApp extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Load the fxml
		Parent parent = FXMLLoader.load(getClass().getResource("radiogui.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Set & show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Favorite Color Picker");
		primaryStage.show();
	}

}
