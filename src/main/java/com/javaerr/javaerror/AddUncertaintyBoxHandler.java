package com.javaerr.javaerror;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import org.controlsfx.control.spreadsheet.Grid;

import java.util.ArrayList;

public class AddUncertaintyBoxHandler implements EventHandler<ActionEvent>{
    GridPane root;
    int i;
    public AddUncertaintyBoxHandler(GridPane root, int i){
        this.root = root;
        this.i = i;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        if (((CheckBox)actionEvent.getSource()).isSelected()){
            root.add(new TextField("Uncertainty Range"), 2 , i+1);
        }
    }
}
