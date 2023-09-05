package com.example.book6.chapter1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickMe extends Application {

    public static void main(String[] args) {
        System.out.println("Launching");
        launch(args);
        System.out.println("Ended");
    }

    Button btn;

    @Override
    public void start(Stage primaryStage) {
        //Create button
        btn = new Button();
        btn.setText("Click Here!");
        btn.setOnAction(e -> buttonClick());

        //Add to layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        //Add layout pane to scene
        Scene scene = new Scene(pane, 300, 250);

        //Finalize and present stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Here App");
        primaryStage.show();
    }

    public void buttonClick(){
        if (btn.getText() == "Click Here!"){
            btn.setText("Bullseye!");
        } else {
            btn.setText("Click Here!");
        }
    }
}
