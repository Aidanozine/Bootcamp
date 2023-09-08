package com.example.dummiesbook6.chapter4;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    public void start(Stage primaryStage) {
        b1 = new Button("First");
        b1.setMinWidth(Double.MIN_VALUE);
        b2 = new Button("Second");
        b2.setMinWidth(Double.MIN_VALUE);
        b3 = new Button("Third");
        b3.setMinWidth(Double.MIN_VALUE);
        b4 = new Button("Fourth");
        b4.setMinWidth(Double.MIN_VALUE);

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 10, 10, b1, b2, b3, b4);
        flowPane.setPrefWrapLength(300);
//        FlowPane flowPane = new FlowPane(Orientation.VERTICAL, 10, 10, b1, b2, b3, b4);
//        flowPane.setPrefWrapLength(300);

        Scene scene = new Scene(flowPane, 350, 350);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Flowpane Test");
        primaryStage.show();
    }
}
