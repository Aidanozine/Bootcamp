package com.example.dummiesbook6.chapter3;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class SceneSwitcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //class fields for ClickCounter scene
    int iClickCount = 0;
    Label lableClick;
    Button clickMe;
    Button switch1To2;
    Scene scene1;

    //class fields for AddSubtract scene
    int iCounter = 0;
    Label lableCount;
    Button add;
    Button subt;
    Button switch2To1;
    Scene scene2;

    //class field for Stage
    Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        //Build Click-Counter scene
        lableClick = new Label();
        lableClick.setText("You haven't clicked anything.");

        clickMe = new Button();
        clickMe.setText("Click This!");
        clickMe.setOnAction(e -> clickMe_Click());

        switch1To2 = new Button();
        switch1To2.setText("Switch 1 -> 2");
        switch1To2.setOnAction(e -> switch1To2_Click());

        VBox pane1 = new VBox(10);
        pane1.getChildren().addAll(lableClick, clickMe, switch1To2);

        scene1 = new Scene(pane1, 250, 150);

        //Build AddSubtract scene
        lableCount = new Label();
        lableCount.setText(Integer.toString(iCounter));

        add = new Button();
        add.setText("Add");
        add.setOnAction(e -> add_Click());

        subt = new Button();
        subt.setText("Minus");
        subt.setOnAction(e -> subt_Click());

        switch2To1 = new Button();
        switch2To1.setText("Switch 2 -> 1");
        switch2To1.setOnAction(e -> switch2To1_Click());

        HBox pane2 = new HBox(10);
        pane2.getChildren().addAll(lableCount, add, subt, switch2To1);

        scene2 = new Scene(pane2, 300, 75);

        //Set and show stage with scene 1
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }

    //Event handlers for scene 1
    public void clickMe_Click(){
        iClickCount++;
        if (iClickCount == 1){
            lableClick.setText("You've Clicked Once!");
        } else {
            lableClick.setText("You've Clicked " + iClickCount + " Times!");
        }
    }

    private void switch1To2_Click(){
        stage.setScene(scene2);
    }

    //Event handlers for scene 2
    private void add_Click(){
        iCounter++;
        lableCount.setText(Integer.toString(iCounter));
    }

    private void subt_Click(){
        iCounter--;
        lableCount.setText(Integer.toString(iCounter));
    }

    private void switch2To1_Click(){
        stage.setScene(scene1);
    }
}
