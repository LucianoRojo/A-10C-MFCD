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

public final class App extends Application {

    public void setPosition(Button button, int x1, int y1) {
        // TODO Auto-generated method stub
        button.setLayoutX(x1);
        button.setLayoutY(y1);
        //throw new UnsupportedOperationException("Unimplemented method 'setPosition'");
    }

    @Override

    public void start(Stage primaryStage) {

        int X1 = 150;
        int Y1 = 7;
        int j = 0;

        StackPane root = new StackPane();
        
        // Main image, will switch this line to a relative route in the future.
        Image backgroundImage = new Image("file:/home/luciano_/Projects/A-10C-MFCD/MFCD/Project/Resources/screen.png");
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, false, false);

        // ImageView with the background image, this should never change.
        BackgroundImage bgImage = new BackgroundImage(
    backgroundImage,
    BackgroundRepeat.NO_REPEAT,
    BackgroundRepeat.NO_REPEAT,
    BackgroundPosition.DEFAULT,
    backgroundSize
);
        root.setBackground(new Background(bgImage));

        //These two resolutions should always match. Otherwise you will have to manually resize the window.
        
        //Menu main = new Menu(primaryStage, imageView, root);
        Circle circleShape = new Circle(110); 
        Button[] b = new Button[20];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Button("" + (i + 1));
            b[i].setShape(circleShape);
            b[i].setMinSize(40, 40);
            b[i].setOpacity(0.1);
        }
        while(j<=4){
            setPosition(b[j], X1, Y1);
            X1 += 66;
            j++;
        }  
        X1 += 60;
        Y1 += 115;
        while (j > 4 && j <= 9) {
            setPosition(b[j], X1, Y1);
            X1 -= 1;
            Y1 += 66;
            j++;
        }
        X1 -= 123;
        Y1 += 80;
        while(j>9 && j<=14){
            setPosition(b[j], X1, Y1);
            X1 -= 66;
            j++;
        }
        X1 = 15;
        Y1 -= 150;
        while(j>14 && j <= 19){
            setPosition(b[j], X1, Y1);
            Y1 -= 66;
            j++;
        }

        Pane newLayout = new Pane();
        Text text = new Text("Vi Är Sverige");
        text.setFont(Font.font("Arial", FontWeight.BOLD, 24)); // Set font to Arial, bold, size 24
        text.setFill(Color.GREEN); // Set text color to light green

        // Create a StackPane to overlay text on existing content
        newLayout.getChildren().addAll(text,b[0],b[1],b[2],b[3],b[4],b[5],b[6],b[7],b[8],b[9],b[10],b[11],b[12],b[13],b[14],b[15],b[16],b[17],b[18],b[19]); // Add the text to the overlay

        // Add the overlay StackPane to the existing layout
        // This assumes 'layout' is a Pane that can contain other nodes

        // Assuming the scene and stage are already set up with 'layout' as the root
        //Scene scene1 = new Scene(newLayout, 600, 600);  

        root.getChildren().add(newLayout);
        root.getChildren().addAll(text);
        Scene scene = new Scene(root, 600, 600);         
        primaryStage.setScene(scene);
        primaryStage.show();
        Main main = new Main(primaryStage, new ImageView(), root, b);    
    }

    public static void main(String[] args) {
        launch(args);
    }
}
