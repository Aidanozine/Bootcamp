package com.example.dummiesbook6.chapter6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    ChoiceBox choice;
    ChoiceBox starSeekers;
    ChoiceBox phobias;
    Label lbl;

    @Override
    public void start(Stage primaryStage) {
        lbl = new Label();
        choice = new ChoiceBox<String>();
        choice.getItems().addAll("Doc","Sneezy","Grumpy","Happy","Sleepy","Bashful","Dopey");
        choice.setValue("Doc");
        choice.setOnAction(e -> choice_Click());
        choice.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) ->
                lbl.setText("Today is " + newValue + "'s turn to do the dishes."));
        lbl.setText("Today is " + choice.getValue() + "'s turn to do the dishes.");
        VBox vBox1 = new VBox(10);
        vBox1.getChildren().addAll(choice, lbl);

        Astronaut sawyer = new Astronaut("Tom", "Sawyer");
        Astronaut drew = new Astronaut("Nancy", "Drew");
        Astronaut doo = new Astronaut("Scooby", "Doo");
        starSeekers = new ChoiceBox<Astronaut>();
        starSeekers.getItems().addAll(sawyer, drew, doo);
        starSeekers.setValue(doo);
        starSeekers.setOnAction(e -> astro_Click());

        VBox vBox2 = new VBox(10);
        vBox2.getChildren().addAll(starSeekers);

        Fears spiders = new Fears("spiders");
        Fears heights = new Fears("heights");
        Fears sharpThings = new Fears("sharp objects");
        phobias = new ChoiceBox<Fears>();
        phobias.getItems().addAll(spiders, heights, sharpThings);
        phobias.setValue(heights);
        phobias.setOnAction(e -> fear_Click());

        VBox vBox3 = new VBox(10);
        vBox3.getChildren().addAll(phobias);

        HBox decisions = new HBox(10, vBox1, vBox2, vBox3);

        Scene scene = new Scene(decisions, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Choices, choices, choices");
        primaryStage.show();
    }

    private void choice_Click(){
        String message = "Today is ";
        message += choice.getValue() + "'s turn to do the dishes.";
        Alert a = new Alert(Alert.AlertType.INFORMATION, message);
        a.showAndWait();
    }

    private void astro_Click(){
        String message = "The person piloting the craft will be ";
        message += starSeekers.getValue() + ".";
        Alert b = new Alert(Alert.AlertType.INFORMATION, message);
        b.showAndWait();
    }

    private void fear_Click(){
        String message = "The truth is ";
        message += phobias.getValue() + ".";
        Alert c = new Alert(Alert.AlertType.INFORMATION, message);
        c.showAndWait();
    }
}

class Astronaut{
    private String firstName;
    private String lastName;

    public Astronaut(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}

class Fears{
    private String trigger;

    public Fears(String trigger){
        this.trigger =  trigger;
    }

    public String toString(){
        return "I'm terrified of " + trigger;
    }
}