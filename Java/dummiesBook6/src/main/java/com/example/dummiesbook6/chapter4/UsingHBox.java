package com.example.dummiesbook6.chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UsingHBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    public void start(Stage primaryStage) {
        btn1 = new Button();
        btn1.setText("1");

        btn2 = new Button();
        btn2.setText("2");

        btn3 = new Button();
        btn3.setText("3");

//        HBox hBox = new HBox(10,btn1, btn2, btn3); //version1
//
//        HBox hBox = new HBox(10); //version2
//        hBox.getChildren().addAll(btn1, btn2, btn3);

//        HBox hBox = new HBox(); //version3
//        hBox.setSpacing(10);
//        hBox.getChildren().addAll(btn1, btn2, btn3);

//        HBox hBox = new HBox(); //padding around entire pane
//        hBox.setPadding(new Insets(10));
//        hBox.getChildren().addAll(btn1, btn2, btn3);

//        HBox hBox = new HBox();
//        hBox.setPadding(new Insets(20, 10, 30, 10));
//        hBox.getChildren().addAll(btn1, btn2, btn3);

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(20, 10, 30, 10));
        hBox.getChildren().addAll(btn1, btn2, btn3);
        hBox.setMargin(btn1, new Insets(10, 10, 10, 10));
        hBox.setMargin(btn2, new Insets(10, 20, 10, 20));
        hBox.setMargin(btn3, new Insets(10, 30, 10, 30));

        Scene scene = new Scene(hBox, 350, 350);

        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox Test");
        primaryStage.show();
    }
}
