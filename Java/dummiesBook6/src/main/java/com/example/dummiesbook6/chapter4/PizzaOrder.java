package com.example.dummiesbook6.chapter4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class PizzaOrder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage stage;
    TextField txtName;
    Label lblName;
    TextField txtPhone;
    Label lblPhone;
    TextField txtAddress;
    Label lblAddress;
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    Label lblSize;
    RadioButton rdoThick;
    RadioButton rdoThin;
    Label lblCrust;
    CheckBox chkPepperoni;
    CheckBox chkMushrooms;
    CheckBox chkAnchovies;
    Label lblToppings;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        lblName = new Label("Name:");
        txtName = new TextField();
        txtName.setMinWidth(100);
        txtName.setPrefWidth(200);
        txtName.setMaxWidth(300);
        txtName.setPromptText("Enter name...");

        lblPhone = new Label("Phone Number:");
        txtPhone = new TextField();
        txtPhone.setMinWidth(100);
        txtPhone.setPrefWidth(200);
        txtPhone.setMaxWidth(300);
        txtPhone.setPromptText("Enter phone number...");

        lblAddress = new Label("Address:");
        txtAddress = new TextField();
        txtAddress.setMinWidth(100);
        txtAddress.setPrefWidth(200);
        txtAddress.setMaxWidth(300);
        txtAddress.setPromptText("Enter address...");

        lblSize = new Label("Size:");
        rdoSmall = new RadioButton("Small");
        rdoMedium = new RadioButton("Medium");
        rdoLarge = new RadioButton("Large");
        rdoMedium.setSelected(true);
        ToggleGroup grpSize = new ToggleGroup();
        rdoSmall.setToggleGroup(grpSize);
        rdoMedium.setToggleGroup(grpSize);
        rdoLarge.setToggleGroup(grpSize);

        VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
        paneSize.setSpacing(10);

        lblCrust = new Label("Crust:");
        rdoThin = new RadioButton("Thin");
        rdoThick = new RadioButton("Thick");
        rdoThin.setSelected(true);
        ToggleGroup grpCrust = new ToggleGroup();
        rdoThin.setToggleGroup(grpCrust);
        rdoThick.setToggleGroup(grpCrust);

        VBox paneCrust = new VBox(lblCrust, rdoThin, rdoThick);
        paneCrust.setSpacing(10);

        lblToppings = new Label("Toppings:");
        chkPepperoni = new CheckBox("Pepperoni");
        chkMushrooms = new CheckBox("Mushrooms");
        chkAnchovies = new CheckBox("Anchovies");

        VBox paneToppings = new VBox(lblToppings, chkPepperoni, chkMushrooms, chkAnchovies);
        paneToppings.setSpacing(10);

        Button btnOK = new Button("OK");
        btnOK.setPrefWidth(80);
        btnOK.setOnAction(e -> btnOK_Click());

        Button btnCancel = new Button("Cancel");
        btnCancel.setPrefWidth(80);
        btnCancel.setOnAction(e -> {
            e.consume();
            btnCancel_Click();
        });

        HBox paneBtn = new HBox(10, btnOK, btnCancel);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setMinWidth(500);
        grid.setPrefWidth(500);
        grid.setMaxWidth(800);

        grid.addRow(0, lblName, txtName);
        grid.addRow(1, lblPhone, txtPhone);
        grid.addRow(2, lblAddress, txtAddress);
        grid.addRow(3, paneSize, paneCrust, paneToppings);
        grid.add(paneBtn,2, 4);

        grid.setHalignment(lblName, HPos.RIGHT);
        grid.setHalignment(lblPhone, HPos.RIGHT);
        grid.setHalignment(lblAddress, HPos.RIGHT);
        grid.setColumnSpan(txtName, 2);
        grid.setColumnSpan(txtPhone, 2);
        grid.setColumnSpan(txtAddress, 2);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(33);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(33);
        grid.getColumnConstraints().addAll(col1, col2, col3);

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Order a Pizza");
        primaryStage.setMinWidth(500);
        primaryStage.setMaxWidth(900);
        primaryStage.show();
    }

    private void btnOK_Click(){
        String msg = "Customer:\n\n";
        msg += "\t" + txtName.getText() + "\n";
        msg += "\t" + txtPhone.getText() + "\n\n";
        msg += "\t" + txtAddress.getText() + "\n";
        msg += "You ordered a ";

        if (rdoSmall.isSelected()){
            msg += "small ";
        }
        if (rdoMedium.isSelected()){
            msg += "medium ";
        }
        if (rdoLarge.isSelected()){
            msg += "large";
        }

        if (rdoThin.isSelected()){
            msg += "thin crust pizza, topped with ";
        }
        if (rdoThick.isSelected()){
            msg += "thick crust pizza, topped with ";
        }

        String toppings = "";
        toppings = buildToppings(chkPepperoni, toppings);
        toppings = buildToppings(chkMushrooms, toppings);
        toppings = buildToppings(chkAnchovies, toppings);
        if (toppings.isEmpty()){
            msg += "no toppings.";
        } else {
            msg += "the following toppings:\n" + toppings;
        }

        Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
        a.setTitle("Order Summary");
        a.showAndWait();
    }

    public String buildToppings(CheckBox chk, String msg){
        if (chk.isSelected()){
            if (!msg.isEmpty()){
                msg += ", ";
            }
            msg += chk.getText();
        }
        return msg;
    }

    private void btnCancel_Click(){
        Alert x = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure?", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> r = x.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES){
            Alert xBye = new Alert(Alert.AlertType.INFORMATION, "Good-Bye.");
            xBye.showAndWait();
            stage.close();
        }
    }
}
