package com.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Set the title of the window (Stage)
        primaryStage.setTitle("JavaFX Sample");

        // Initialize the root node. In this case, a simple Pane will do.
        Pane root = new Pane();

        // Create a Scene with the root node and set its dimensions
        Scene scene = new Scene(root, 300, 200); // Width, height

        // Add the Scene to the Stage
        primaryStage.setScene(scene);

        // Display the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
