package edu.cis232.checkboxes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckboxApp extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		//Load the FXML
		Parent parent = FXMLLoader.load(getClass().getResource("checkboxgui.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Set & show the stage
		stage.setScene(scene);
		stage.setTitle("Color Quiz");
		stage.show();
	}

}
