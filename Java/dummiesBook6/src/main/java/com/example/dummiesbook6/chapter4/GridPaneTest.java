package com.example.dummiesbook6.chapter4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lblName = new Label("Name:");
        TextField txtName1 = new TextField("TextField 1");
        TextField txtName2 = new TextField("TextField 2");
        TextField txtName3 = new TextField("TextField 3");

        GridPane grid = new GridPane();
//        grid.add(lblName, 0, 0);

//        grid.addRow(0, lblName, txtName1);
        grid.addRow(0, txtName1, txtName2, txtName3);


        grid.setColumnSpan(txtName1, 2);

        grid.setHalignment(lblName, HPos.RIGHT);
        grid.setValignment(lblName, VPos.CENTER);

        ColumnConstraints col1;
        ColumnConstraints col2;
        ColumnConstraints col3;

        col1 = new ColumnConstraints();
        col1.setPercentWidth(33);
        col2 = new ColumnConstraints();
        col2.setPercentWidth(33);
        col3 = new ColumnConstraints();
        col3.setPercentWidth(33);

        grid.getColumnConstraints().addAll(col1, col2, col3);

        Scene scene = new Scene(grid, 350, 350);

        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPane");
        primaryStage.show();
    }
}
