package com.example.dummiesbook6.chapter2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract1 extends Application implements EventHandler <ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    Button add;
    Button subt;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        add = new Button();
        add.setText("Add");
        add.setOnAction(this);

        subt = new Button();
        subt.setText("Subtract");
        subt.setOnAction(this);

        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, add, subt);

        Scene scene = new Scene(pane, 200, 75);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }

    @Override
    public void handle (ActionEvent e){
        if (e.getSource() == add){
            iCounter++;
        } else {
            if (e.getSource() == subt){
                iCounter--;
            }
        }
        lbl.setText(Integer.toString(iCounter));
    }
}