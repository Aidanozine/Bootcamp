package com.example.dummiesbook6.chapter4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;

    @Override
    public void start(Stage primaryStage) {
        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("Third");
        b4 = new Button("Fourth");
        b5 = new Button("Fifth");
        b6 = new Button("Sixth");
        b7 = new Button("Seventh");
        b8 = new Button("Eigth");
        b9 = new Button("Ninth");
        b10 = new Button("Tenth");

        VBox vb1 = new VBox(b1, b2);
        VBox vb2 = new VBox(b3, b4);
        VBox vb3 = new VBox(b6, b5);
        VBox vb4 = new VBox(b7, b8);
        VBox vb5 = new VBox(b10, b9);

//        BorderPane bp = new BorderPane();
//        bp.setCenter(vb3);
//        bp.setBottom(vb5);
//        bp.setTop(vb1);
//        bp.setLeft(vb2);
//        bp.setRight(vb4);

        BorderPane bp = new BorderPane(vb1, vb2, vb3, vb4,vb5);
        vb1.setAlignment(Pos.CENTER);
        vb5.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER);
        vb4.setAlignment(Pos.CENTER);

        Scene scene = new Scene(bp, 350, 350);

        primaryStage.setScene(scene);
        primaryStage.setTitle("The BorderPane");
        primaryStage.show();
    }
}
