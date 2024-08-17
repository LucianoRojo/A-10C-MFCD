package com.Application.Menus;
import com.Application.Menu;
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

public class Main extends Menu {

    public String[] osbOptions = new String[20];
    

    public Main(Stage primaryStage, ImageView imageView, StackPane buttonPane, Button[] buttons) {  
        super(primaryStage, imageView, buttonPane, buttons);
        osbOptions[0] = "Test";
        for(int i = 0; i<= 19; i++){
            int actual = i;
            buttons[i].setOnAction(event -> handleOSB(actual, primaryStage, imageView, buttonPane));
        }
    }

    @Override
    public void drawScreen(Stage primaryStage, ImageView imageView, StackPane layout) {
        // Implementation of the drawScreen method
        // Add your code here to draw the screen and buttons
        StackPane root = new StackPane();
        Pane newLayout = new Pane();
        Text text = new Text("Testing works!"); // Create a new text object
        text.setFont(Font.font("Arial", FontWeight.BOLD, 24)); // Set font to Arial, bold, size 24
        text.setFill(Color.GREEN); // Set text color to light green

        // Create a StackPane to overlay text on existing content
        layout.getChildren().add(newLayout);
        layout.getChildren().addAll(text);
        Scene scene = new Scene(layout, 600, 600);         
        primaryStage.setScene(scene);
        primaryStage.show();
        

        // Add the overlay StackPane to the existing layout
        // This assumes 'layout' is a Pane that can contain other nodes

        // Assuming the scene and stage are already set up with 'layout' as the root
        //Scene scene1 = new Scene(newLayout, 600, 600);  

        //buttonPane.getChildren().add(newLayout);
        
    }
    

    public void handleOSB(int i, Stage pS, ImageView iV, StackPane bP) {
        // Implementation of the handleOSB method
        // Add your code here to handle the OSB presses
        switch (i) {
            case 0:
            // Handle case 0
            testFunction(pS, iV, bP);
            break;
        default:
            // Handle any other cases
            break;
        }
    }
    public void testFunction(Stage primaryStage, ImageView imageView, StackPane buttonPane) {
        drawScreen(primaryStage, imageView, buttonPane);
    }
}

