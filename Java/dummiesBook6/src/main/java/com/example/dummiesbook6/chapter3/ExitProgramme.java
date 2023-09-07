package com.example.dummiesbook6.chapter3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Optional;

public class ExitProgramme extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btn;
    Label lbl;
    int iClickCount = 0;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        btn = new Button();
        btn.setText("Click Here!");
        btn.setOnAction(e -> btn_Click());

        Button btnClose = new Button();
        btnClose.setText("Close");
        btnClose.setOnAction(e -> btnClose_Click());
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            btnClose_Click();
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        pane.setBottom(btnClose);

        Scene scene = new Scene(pane, 250, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Alert");
        primaryStage.show();
    }

    public void btn_Click(){
        iClickCount++;
        if (iClickCount == 1){
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You Have Clicked Once!");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You HAve Clicked " + iClickCount + " Times!");
            a.showAndWait();
        }
    }

    public void btnClose_Click(){
        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure?", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> r = a.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES){
            Alert aBye = new Alert(Alert.AlertType.INFORMATION, "Good-Bye!");
            aBye.showAndWait();
            stage.close();
        }
    }
}
