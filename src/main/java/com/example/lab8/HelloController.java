package com.example.lab8;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label result;

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    protected void onClearButtonClick() {
        result.setText("");
    }

    @FXML
    protected void onPlusButtonClick(){
        result.setText(String.valueOf(Calc.addTwoNum(Integer.parseInt(number1.getText()),Integer.parseInt(number2.getText()))));
    }
}