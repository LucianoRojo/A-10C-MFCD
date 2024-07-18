package com.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Vi är Sverige!");

        StackPane root = new StackPane();
        
        // Main image, will switch this line to a relative route in the future.
        Image image = new Image("file:/home/luciano_/Projects/A-10C-MFCD/MFCD/Project/Resources/screen.png");

        // ImageView with the background image, this should never change.
        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(600); // Adjust width 
        imageView.setFitHeight(600); // Adjust height
        imageView.setPreserveRatio(false);

        // Create a button and set its text
        Button button = new Button("OSB 1");

        // Set button position
        button.setLayoutX(50); // X position
        button.setLayoutY(50); // Y position

        // Add an event handler to the button
        /* 
        button.setOnAction(event -> {
            System.out.println("Button clicked!");
            // Add actions to perform when the button is clicked
        });
        */

        // Add the ImageView and Button to the Pane
        root.getChildren().addAll(imageView, button);
        
        //These two resolutions should always match. Otherwise you will have to manually resize the window.
        Scene scene = new Scene(root, 600, 600);         
        primaryStage.setScene(scene);
        primaryStage.show();
        Menu main = new Menu(primaryStage, imageView, root);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
