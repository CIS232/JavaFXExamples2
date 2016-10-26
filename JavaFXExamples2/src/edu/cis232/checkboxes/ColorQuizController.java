package edu.cis232.checkboxes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class ColorQuizController {

    @FXML
    private CheckBox cbxRed;

    @FXML
    private CheckBox cbxGreen;

    @FXML
    private CheckBox cbxBlue;

    @FXML
    private CheckBox cbxBlack;

    @FXML
    private Label lblOutput;

    @FXML
    void submitAnswerListener(ActionEvent event) {
    	if(cbxRed.isSelected() && cbxBlue.isSelected() && !cbxBlack.isSelected() && !cbxGreen.isSelected()){
    		lblOutput.setText("You are correct.");
    	} else {
    		lblOutput.setText("You are wrong. Try again!");
    	}
    }

}
