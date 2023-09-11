package com.example.dummiesbook6.chapter6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ListViewTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Pizza Toppings");
        ListView list = new ListView();
        list.getItems().addAll("Avocado", "Bacon", "Feta", "Ham", "Pineapple",
                "Banana", "Sausage", "Pepperoni", "Linguica", "Salame", "Olives",
                "Mushrooms", "Onions", "Peppers", "Pineapple", "Spinach", "Canadian Bacon",
                "Tomatoes");

        HBox hBox = new HBox(10, lbl, list);

        Scene scene = new Scene(hBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("List Views");
        primaryStage.show();
    }
}
