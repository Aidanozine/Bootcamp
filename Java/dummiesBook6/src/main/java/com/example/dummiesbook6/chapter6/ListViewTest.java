package com.example.dummiesbook6.chapter6;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    ListView list;

    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Pizza Toppings");
        list = new ListView();
        list.getItems().addAll("Avocado", "Bacon", "Feta", "Ham", "Pineapple",
                "Banana", "Sausage", "Pepperoni", "Linguica", "Salame", "Olives",
                "Mushrooms", "Onions", "Peppers", "Pineapple", "Spinach", "Canadian Bacon",
                "Tomatoes");
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//        list.setOrientation(Orientation.HORIZONTAL);
        list.setOrientation(Orientation.VERTICAL); //default
        list.setOnMouseClicked(e -> list_Click());

//        HBox hBox = new HBox(10, lbl, list);
        VBox vBox = new VBox(10, lbl, list);

        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("List Views");
        primaryStage.show();
    }

    public void list_Click(){
        String toppings = "";
        ObservableList<String> watchtops = list.getSelectionModel().getSelectedItems();
        for (String s : watchtops){
            toppings += s + " \n";
        }
        System.out.println("You have selected toppings: \n" + toppings);
    }
}
