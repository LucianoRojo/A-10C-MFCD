package com.Application;
import com.Application.Menus.Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public abstract class Menu {

    //the menu each button should take you to.
    public String[] osbOptions = new String[20];

    public Menu(Stage primaryStage, ImageView imageView, StackPane buttonPane,Button[] buttons) {
        //drawScreen(primaryStage, imageView, buttonPane);
    }

    //Draws the content of the screen.
    public abstract void drawScreen(Stage primaryStage, ImageView imageView, StackPane layout);

    //Handles the OSB presses.
    public abstract void handleOSB(int i, Stage pS, ImageView iV, StackPane bP);
}

