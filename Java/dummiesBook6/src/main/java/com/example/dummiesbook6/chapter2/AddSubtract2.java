package com.example.dummiesbook6.chapter2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button add;
    Button subt;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        ClickHandler ch = new ClickHandler();

        add = new Button();
        add.setText("Add");
        add.setOnAction(ch);

        subt = new Button();
        subt.setText("Minus");
        subt.setOnAction(ch);

        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, add, subt);

        Scene scene = new Scene(pane, 200, 75);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Fun With Add & Subtract!");
        primaryStage.show();
    }

    private class ClickHandler implements EventHandler <ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
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
}
