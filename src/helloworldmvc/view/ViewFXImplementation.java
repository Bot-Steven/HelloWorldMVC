/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author steven,irkus
 */
public class ViewFXImplementation extends Application implements View{
    private static String mensaje="";
   
    @Override
    public void start(Stage stage) {
        Label lbl =new Label(mensaje);
        
        Pane root = new Pane();
        root.getChildren().add(lbl);

        Scene scene = new Scene(root, 300, 250);
        
        stage.setTitle("Hola mundo");
        stage.setScene(scene);
        stage.show();
    }

     @Override
    public void showGreeting(String message) {
        mensaje=message;
        launch(new String[1]);
    }

    
}
