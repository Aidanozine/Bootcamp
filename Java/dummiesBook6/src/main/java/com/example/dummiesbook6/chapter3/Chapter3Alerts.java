package com.example.dummiesbook6.chapter3;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class Chapter3Alerts extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        Alert a = new Alert(Alert.AlertType.INFORMATION, "You Have Clicked Once.");
//        a.showAndWait();
        Alert a1 = new Alert(Alert.AlertType.INFORMATION, "Are You Sure?", ButtonType.NO, ButtonType.YES);
        Optional<ButtonType> r = a1.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES){
            Alert a2 = new Alert(Alert.AlertType.INFORMATION, "Thank You!");
            a2.showAndWait();
        }
    }
}
