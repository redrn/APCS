package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.*;

public class App extends Application {
    // --------------------------------------------------------------
    // Creates and displays several shapes.
    // --------------------------------------------------------------
    public void start(Stage primaryStage) {
        /*
         * // Solid Red Square Rectangle square = new Rectangle(100, 100, 200, 200);
         * square.setFill(Color.RED); square.setStroke(Color.RED); // Blue line Line
         * line = new Line(25, 25, 250, 75); line.setStroke(Color.BLUE); // Circle -
         * unfilled with Green outline Circle circle = new Circle(200, 200, 92);
         * circle.setFill(null); circle.setStroke(Color.LIGHTGREEN);
         * circle.setStrokeWidth(16); // arc Arc arc = new Arc(350, 350, 50, 50, 45,
         * 135); arc.setFill(Color.DARKGRAY); arc.setType(ArcType.ROUND); // Unfilled
         * square with Cyan outline Rectangle box = new Rectangle(300, 300, 100, 100);
         * box.setFill(null); box.setStroke(Color.CYAN); // Solid Magenta Triangle
         * Polygon triangle = new Polygon(); triangle.getPoints().addAll(400.0, 400.0,
         * 350.0, 450.0, 450.0, 450.0); triangle.setFill(Color.MAGENTA);
         * 
         * // Solid Thistle Ellipse Ellipse ellipse = new Ellipse(160, 450, 150, 50);
         * ellipse.setFill(Color.THISTLE); String s = "No matter where you go, "; s = s
         * + "there you are.\n-- Buckaroo Banzai"; Text quote = new Text(50, 450, s);
         * quote.setStroke(Color.MIDNIGHTBLUE);
         * 
         * // Setting up stages and scene Group root = new Group(square, line, circle,
         * box, arc, triangle, ellipse, quote); Scene scene = new Scene(root, 500, 600);
         * primaryStage.setTitle("Graphics Intro"); primaryStage.setScene(scene);
         * primaryStage.show();
         */

        // Image
        Image image = null;
        try {
            image = new Image(new FileInputStream("C:\\Users\\RedRN\\Pictures\\lof-mrfz.jpg"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PixelReader pixelReader = image.getPixelReader();
        
        //Background
        Rectangle background = new Rectangle(0, 0, 600, 600);
        background.setFill(Color.WHITE);
        //Layer 2
        Polygon layer2 = new Polygon();
        layer2.getPoints().addAll(300.0, 400.0, 350.0, 300.0, 400.0, 500.0);
        layer2.setFill(Color.rgb(0, 102, 102));
        //Layer 3 and 4
        Arc leftShoulder = new Arc(100.0, 390.0, 100.0, 100.0, 90.0, 90.0);
        leftShoulder.setFill(Color.rgb(51, 25, 0));
        leftShoulder.setType(ArcType.ROUND);
        Arc leftShoulderEdge = new Arc(100.0, 400.0, 100.0, 100.0, 90.0, 90.0);
        leftShoulderEdge.setFill(Color.rgb(255, 229, 204));
        leftShoulderEdge.setType(ArcType.ROUND);
        //Layer 5
        Polygon layer5 = new Polygon();
        layer5.getPoints().addAll(0.0, 0.0, 250.0, 0.0, 0.0, 450.0);
        layer5.setFill(Color.rgb(48, 219, 203));
        //Layer 6
        Polygon layer6 = new Polygon();
        layer6.getPoints().addAll(100.0, 0.0, 50.0, 100.0, 100.0, 150.0, 150.0, 0.0);
        layer6.setFill(Color.rgb(32, 32, 32));
        //Layer 7
        Polygon layer7 = new Polygon();
        layer7.getPoints().addAll(125.0, 600.0, 375.0, 600.0, 385.0, 525.0, 200.0, 500.0);
        layer7.setFill(Color.rgb(192, 192, 192));

        //Group setup
        Group root = new Group(background, layer2, leftShoulder, leftShoulderEdge, layer5, layer6, layer7);
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Miku");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}