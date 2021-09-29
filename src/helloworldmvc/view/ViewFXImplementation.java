package helloworldmvc.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Esta clase pretende mostrar un mensaje mediante una interfaz grafica tipo
 * JavaFX
 * @author steven,irkus
 */
public class ViewFXImplementation extends Application implements View{
    
    private static String mensaje="";
   
    /**
     * Metodo para definir la ventana principal de la interfaz JavaFX
     * @param stage permite manejar o configurar la ventana creada por la 
     * API JavaFX
     */
    @Override
    public void start(Stage stage) {
        Label lbl = new Label(mensaje);
        
        Pane root = new Pane();
        root.getChildren().add(lbl);

        Scene scene = new Scene(root, 300, 250);
        
        stage.setTitle("Hola mundo");
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Metodo para mostrar el saludo usando el metodo launch() que se encarga
     * de iniciar la aplicacion JavaFX
     * @param message recibe el saludo y se lanza el metodo launch() para crear
     * la ventana JavaFX
     */
    @Override
    public void showGreeting(String message) {
        mensaje=message;
        launch(new String[1]);
    }

    
}
