package com.example.dummiesbook6.chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class UsingVBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button b1;
    Button b2;
    Button b3;

    @Override
    public void start(Stage primaryStage) {
        b1 = new Button();
        b1.setText("1");
//        b1.setMaxWidth(Double.MAX_VALUE);
        b1.setMinWidth(Double.MIN_VALUE);

        b2 = new Button("Button2");
//        b2.setMaxWidth(Double.MAX_VALUE);
        b2.setMinWidth(Double.MIN_VALUE);

        b3 = new Button();
        b3.setText("Third Button");
//        b3.setMaxWidth(Double.MAX_VALUE);
        b3.setMinWidth(Double.MIN_VALUE);

        Region spacer = new Region();

        VBox vBox = new VBox(10, b1, b2, spacer, b3);
//        VBox.setMargin(b1, new Insets(10));
//        VBox.setMargin(b2, new Insets(10));
//        VBox.setMargin(b3, new Insets(10));
//        vBox.setVgrow(spacer, Priority.ALWAYS);

        vBox.setPadding(new Insets(10));
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 350, 350);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Growing Nodes");
        primaryStage.show();
    }
}
