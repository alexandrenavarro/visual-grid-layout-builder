package com.github.alexandrenavarro.visualgridlayoutbuilder.demo;

import com.github.alexandrenavarro.visualgridlayoutbuilder.javafx.gridpane.GridPaneVisualGridBuilder;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBuilder;
import javafx.scene.control.LabelBuilder;
import javafx.scene.control.TextFieldBuilder;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Created by anavarro on 25/12/16.
 */

public class JavaFxAppWithGridPaneVisualGridBuilder extends Application {

    @Override
    public void start(final Stage primaryStage) {

        // GridPane
        final GridPane gridPane = GridPaneVisualGridBuilder.create()
                .add(LabelBuilder.create()
                        .id("firstNameLabel")
                        .text("First Name").build())
                .add(TextFieldBuilder.create()
                        .id("firstNameTextField")
                        .text("").build())
                .add(LabelBuilder.create()
                        .id("lastNameLabel")
                        .text("Last Name").build())
                .add(TextFieldBuilder.create()
                        .id("lastNameTextField")
                        .text("").build())
                .add(ButtonBuilder.create()
                        .id("okButton")
                        .text("Ok")
                        .maxWidth(Double.MAX_VALUE)
                        .onAction(e -> System.out.println("Ok action")).build())
                .add(ButtonBuilder.create()
                        .id("cancelButton")
                        .maxWidth(Double.MAX_VALUE)
                        .text("Cancel").build())
                .columnCstr("[right]        [fill]            ")
                .addCtrlRow("firstNameLabel firstNameTextField")
                .addCtrlRow("lastNameLabel  lastNameTextField ")
                .addCtrlRow("okButton       cancelButton      ")
                .build();

        primaryStage.setScene(new Scene(gridPane, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
