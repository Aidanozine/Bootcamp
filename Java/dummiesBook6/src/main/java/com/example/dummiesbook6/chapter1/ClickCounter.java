package com.example.dummiesbook6.chapter1;

import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.*;

public class ClickCounter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn;
    Label lbl;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        btn = new Button();
        btn.setText("CLick Here!");
        btn.setOnAction(e -> buttonClick());

        lbl = new Label();
        lbl.setText("You still need to click 'da button.");

        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        Scene scene = new Scene(pane, 250, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Let's Count The Clicks!");
        primaryStage.show();
    }

    public void buttonClick(){
        iClickCount++;
        if (iClickCount == 1){
            lbl.setText("You've Clicked Once!");
        } else {
            lbl.setText("You've Clicked " + iClickCount + " Times!");
        }
    }
}
