package com.javaerr.javaerror;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class EquationReader implements EventHandler<ActionEvent> {
    private TextField equation;
    public EquationReader(TextField tf) {
        this.equation = tf;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
