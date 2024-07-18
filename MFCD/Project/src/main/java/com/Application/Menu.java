package com.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;


public class Menu {

    public String[] osbOptions = new String[20];

    public void setPosition(Button button, int x, int y) {
        button.setLayoutX(x);
        button.setLayoutY(y);
    }
    
    public Menu(Stage primaryStage, ImageView imageView, StackPane buttonPane) {
        drawMenu(primaryStage, imageView, buttonPane);
    }

    public void drawMenu(Stage primaryStage, ImageView imageView, StackPane layout) {
        Circle circleShape = new Circle(110); 
        Button[] b = new Button[20];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Button("" + (i + 1));
            b[i].setShape(circleShape);
            b[i].setMinSize(40, 40);
        }
        int X1 = 150;
        int Y1 = 7;
        int j = 0;
        while(j<=4){
            setPosition(b[j], X1, Y1);
            X1 += 66;
            j++;
        }  
        X1 = 900;
        while (j > 4 && j <= 9) {
            b[j].setLayoutX(X1); // X position
            b[j].setLayoutY(Y1); // Y position
            X1 += 64;
            j++;
        }
        Pane newLayout = new Pane();
        Text text = new Text("I'm a sample menu");
        text.setFill(Color.GREEN); // Set the text color to green

        // Create a StackPane to overlay text on existing content
        newLayout.getChildren().addAll(imageView,text,b[0],b[1],b[2],b[3],b[4],b[5],b[6],b[7],b[8],b[9],b[10],b[11],b[12],b[13],b[14],b[15],b[16],b[17],b[18],b[19]); // Add the text to the overlay

        // Add the overlay StackPane to the existing layout
        // This assumes 'layout' is a Pane that can contain other nodes

        // Assuming the scene and stage are already set up with 'layout' as the root
        Scene scene = new Scene(newLayout, 600, 600);      
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

