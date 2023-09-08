package com.example.dummiesbook6.chapter5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ActorFilms extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    TextField intOfFilms;
    TextField txtActor;
    String errorMessage;

    @Override
    public void start(Stage primaryStage) {
        Label lblIntOfFilms = new Label("Number of movies");
        lblIntOfFilms.setMinWidth(100);
        lblIntOfFilms.setAlignment(Pos.BOTTOM_RIGHT);

        intOfFilms = new TextField();
        intOfFilms.setMinWidth(200);
        intOfFilms.setMaxWidth(200);
        intOfFilms.setPromptText("Number of movies acted in");

        Label lblActor = new Label("Name of the actor/actress");
        lblActor.setMinWidth(100);
        lblActor.setAlignment(Pos.BOTTOM_RIGHT);

        txtActor = new TextField();
        txtActor.setMinWidth(200);
        txtActor.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the actor/actress");

        Button okBtn = new Button("OK");
        okBtn.setMinWidth(75);
        okBtn.setOnAction(e -> okBtn_Click());

        HBox paneFilms = new HBox(20, lblIntOfFilms, intOfFilms);
        paneFilms.setPadding(new Insets(10));

        HBox paneActor = new HBox(20, lblActor, txtActor);
        paneActor.setPadding(new Insets(10));

        HBox paneBtn = new HBox(20, okBtn);
        paneBtn.setPadding(new Insets(10));
        paneBtn.setAlignment(Pos.BOTTOM_RIGHT);

        VBox pane = new VBox(10, paneActor, paneFilms, paneBtn);

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void okBtn_Click(){
        errorMessage = "";

        if (txtActor.getText().length() == 0){
            errorMessage = "Actor's name is required";
        }
        if (intOfFilms.getText().length() == 0){
            errorMessage = "Number of films required";
        }

        if (errorMessage.length() == 0 && isInt(intOfFilms, "Needs to be an integer")){
            String message = txtActor.getText() + " has acted in " + intOfFilms.getText() + " movies.";
            Alert a = new Alert(Alert.AlertType.INFORMATION, message);
            a.setTitle("Cast");
            a.showAndWait();
        } else {
            Alert b = new Alert(Alert.AlertType.WARNING, errorMessage);
            b.setTitle("UH-OH");
            b.showAndWait();
        }
    }

    private boolean isInt(TextField f, String msg){
        try{
            Integer.parseInt(f.getText());
            return true;
        } catch(NumberFormatException e){
            errorMessage = msg;
            return false;
        }
    }
}
