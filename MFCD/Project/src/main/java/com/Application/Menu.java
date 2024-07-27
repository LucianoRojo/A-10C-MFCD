package com.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;


public class Menu {

    public String[] osbOptions = new String[20];

    
    
    public Menu(Stage primaryStage, ImageView imageView, StackPane buttonPane) {
        drawScreen(primaryStage, imageView, buttonPane);
    }

    //Draws the whole screen and buttons (NOT the actual content of the screen)
    public void drawScreen(Stage primaryStage, ImageView imageView, StackPane layout) {
                primaryStage.setTitle("Vi är Sverige!");

        
    }

}

