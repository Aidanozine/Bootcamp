package com.example.dummiesbook6.chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class GrowingNodes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button b1;
    Button b2;
    Button b3;

    @Override
    public void start(Stage primaryStage) {
        b1 = new Button();
        b1.setText("Button1");

        b2 = new Button();
        b2.setText("Button2");

        b3 = new Button();
        b3.setText("Button3");

        Region spacer = new Region();

        HBox hBox = new HBox(10, b1, b2, spacer, b3);
        hBox.setMargin(b1, new Insets(10));
        hBox.setMargin(b2, new Insets(10));
        hBox.setMargin(b3, new Insets(10));

        hBox.setHgrow(spacer, Priority.ALWAYS);

        Scene scene = new Scene(hBox, 350, 350);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Growing Nodes");
        primaryStage.show();
    }
}
