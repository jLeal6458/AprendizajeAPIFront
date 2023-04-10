package com.jleal6458.aprendizajeAPIFront.controllers;

import com.jleal6458.aprendizajeAPIFront.services.PsychologistService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.io.IOException;

public class PsychologistController {

    private PsychologistService service = new PsychologistService();

    @FXML
    private Label overTextFieldLabel;
    @FXML
    private Button input;
    @FXML
    private TextField psychologistTextfield;
    @FXML
    private Label labelResult;
    @FXML
    private Label label3;

    @FXML
    public void initialize() {
        // Add initialization code here, if necessary
    }

    @FXML
    public void inputPressed(){

        if(labelResult.getTextAlignment().equals(Color.RED)){
            labelResult.setTextFill(Color.INDIGO);
        }

        final String text = psychologistTextfield.getText();

        try {
            String result = service.doPost(text);
            labelResult.setText(result);

        } catch (IOException e) {
            labelResult.setText("IOException");
            labelResult.setTextFill(Color.RED);
        }
    }
}
