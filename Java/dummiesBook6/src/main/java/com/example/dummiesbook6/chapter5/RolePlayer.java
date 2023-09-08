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

public class RolePlayer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    TextField txtRole;
    TextField txtActor;

    @Override
    public void start(Stage primaryStage) {
        Label lblRole = new Label("What's the role?");
        lblRole.setMinWidth(100);
        lblRole.setAlignment(Pos.BOTTOM_RIGHT);

        txtRole = new TextField();
        txtRole.setMinWidth(200);
        txtRole.setMaxWidth(200);
        txtRole.setPromptText("Enter the name of the role");

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

        HBox paneRole = new HBox(20, lblRole, txtRole);
        paneRole.setPadding(new Insets(10));

        HBox paneActor = new HBox(20, lblActor, txtActor);
        paneActor.setPadding(new Insets(10));

        HBox paneBtn = new HBox(20, okBtn);
        paneBtn.setPadding(new Insets(10));
        paneBtn.setAlignment(Pos.BOTTOM_RIGHT);

        VBox pane = new VBox(10, paneRole, paneActor, paneBtn);

        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void okBtn_Click(){
        String errorMessage = "Field(s) can't be empty:";
        String messageCast = "The role of " + txtRole.getText() + " will be played by " + txtActor.getText();
        if (txtRole.getText().length() == 0){
            errorMessage += " Role";
        }
        if (txtActor.getText().length() == 0){
            errorMessage += " Actor";
        }
        if (txtRole.getText().length() >= 1 && txtActor.getText().length() >= 1){
            messageCast += ".";
            Alert a = new Alert(Alert.AlertType.INFORMATION, messageCast);
            a.setTitle("Cast");
            a.showAndWait();
        } else {
            Alert b = new Alert(Alert.AlertType.WARNING, errorMessage);
            b.setTitle("UH-OH");
            b.showAndWait();
        }
    }
}
