package com.example.dummiesbook6.chapter6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewTest2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    TreeView<String> tree; //N.B. defining type is important
    Label lblShowName;

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

        tree = new TreeView<String>(root);
//        tree.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //doesn't display full selection anyway
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> tree_SelectionChanged(newValue));

        lblShowName = new Label();

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20));
        vBox.getChildren().addAll(tree, lblShowName);

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

    public void tree_SelectionChanged(TreeItem<String> item){
        if (item != null){
            lblShowName.setText(item.getValue());
        }
    }
}
