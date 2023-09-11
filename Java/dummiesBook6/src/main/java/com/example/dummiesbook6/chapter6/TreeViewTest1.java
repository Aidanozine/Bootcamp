package com.example.dummiesbook6.chapter6;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewTest1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    TreeView tree;

    @Override
    public void start(Stage primaryStage) {
        TreeItem andy,archie, george,happy,maude;
        TreeItem root = new TreeItem<>("Spin-offs");
        root.setExpanded(true);

        andy = makeShow("The Andy Griffith's Show", root);
        makeShow("Gomer Pyle, U.S.M.C.", andy);
        makeShow("Mayberry R.F.D.", andy);

        archie = makeShow("All in the family", root);
        george = makeShow("The Jeffersons", archie);
        makeShow("Checking in", george);

        maude = makeShow("Maude", george);
        makeShow("Good Times", maude);
        makeShow("Gloria", archie);
        makeShow("Archie Bunker's Place", archie);

        happy = makeShow("Happy Days", root);
        makeShow("Mork and Mindy", happy);
        makeShow("Laverne and Shirley", happy);
        makeShow("Joanie Loves Chachi", happy);

        tree = new TreeView(root);
        tree.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tree.setShowRoot(false);
        tree.setOnMouseClicked(e -> tree_Clicked());

        VBox vBox = new VBox(tree);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Meet the Spin-offs");
        primaryStage.show();
    }

    public TreeItem<String> makeShow(String title, TreeItem<String> parent){
        TreeItem<String> show = new TreeItem<>(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }

    public void tree_Clicked(){
        String message = "";
        ObservableList<TreeItem> spinOffs = tree.getSelectionModel().getSelectedItems();
        for (TreeItem show : spinOffs){
            message += show.getValue() + "\n";
        }
        System.out.println("You've selected these shows: \n" + message);
    }
}
