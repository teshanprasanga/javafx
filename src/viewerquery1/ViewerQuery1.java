/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewerquery1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Ram
 */
public class ViewerQuery1 extends Application {
    private int degree = 0;
    @Override
    public void start(Stage primaryStage) {
        BorderPane root  = new BorderPane();
        Scene scene = new Scene(root, 500, 500);
        Color foreground = Color.rgb(255, 255, 255, 0.9);
        
        //Rectangle
        Rectangle box = new Rectangle(320, 200);
        box.setX(0);
        box.setY(0);
        box.setArcHeight(15);
        box.setArcWidth(15);
        box.setFill(Color.rgb(0, 0, 0, 0.55));
        box.setStroke(foreground);
        box.setStrokeWidth(1.5);
        
        root.setCenter(box);
        
        Button btn = new Button("Rotate");
        btn.setOnAction(e ->{
            if(e.getSource() == btn){
                degree = degree + 15;
                box.setRotate(degree);
            }
        });
        root.setBottom(btn);
        BorderPane.setMargin(btn, new Insets(0, 0, 20, 220));
        
        primaryStage.setTitle("JavaFX 8 Viewer Query 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
