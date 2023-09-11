package com.example.dummiesbook6.chapter6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class ComboBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    ComboBox box;
    Label lbl;

    @Override
    public void start(Stage primaryStage) {
        lbl = new Label();
        box = new ComboBox();
        box.getItems().addAll("Doc","Sneezy","Grumpy","Happy","Sleepy","Bashful","Dopey");
        box.setValue("Doc");
        box.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> lbl.setText("The new dwarf leader is " + newValue + "."));
        box.setEditable(true);
        box.setVisibleRowCount(7);
        box.setPromptText("Who will lead them?");
        box.setOnAction(e -> box_Click());
        lbl.setText("The new dwarf leader is " + box.getValue() + ".");
        VBox vBox1 = new VBox(10);
        vBox1.getChildren().addAll(box, lbl);

        HBox pane = new HBox(10, vBox1);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The dwarves have increased in number.");
        primaryStage.show();
    }

    private void box_Click(){
        if (!box.getItems().contains(box.getValue())){
            String message = "Are you sure? ";
            message += "We don't really know " + box.getValue() + " yet.";
            Alert b = new Alert(Alert.AlertType.CONFIRMATION, message, ButtonType.YES, ButtonType.NO);
            Optional<ButtonType> r = b.showAndWait();
            if (r.isPresent() && r.get() == ButtonType.YES){
                Alert b2 = new Alert(Alert.AlertType.INFORMATION, "Alright, it's your decision.");
                b2.showAndWait();
            }
        }
        String message = "The new dwarf leader is ";
        message += box.getValue() + ".";
        Alert a = new Alert(Alert.AlertType.INFORMATION, message);
        a.showAndWait();
    }
}
