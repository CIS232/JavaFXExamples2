package edu.cis232.radiobuttons;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FavoriteColorController {

    @FXML
    private RadioButton rdoRed;

    @FXML
    private ToggleGroup color;

    @FXML
    private RadioButton rdoBlue;

    @FXML
    private RadioButton rdoYellow;

    @FXML
    private Label lblOutput;

    @FXML
    void submitFavoriteColorListener(ActionEvent event) {
    	//Could get the selected color in one of two ways
    	//Option 1: get the text of the selected radio button from the toggle group
    	String selectedText = ((RadioButton)color.getSelectedToggle()).getText();
    	System.out.println(selectedText);
    	
    	//Option 2: call "isSelected" on each of the radio buttons
    	if(rdoRed.isSelected()){
    		lblOutput.setText("Here are some strawberries.");
    	} else if(rdoBlue.isSelected()){
    		lblOutput.setText("Here are some blueberries");
    	} else if(rdoYellow.isSelected()){
    		lblOutput.setText("Here is a banana");
    	} else {
    		lblOutput.setText("Please select a favorite color.");
    	}
    }

}
