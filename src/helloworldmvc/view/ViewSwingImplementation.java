package helloworldmvc.view;

import javax.swing.JOptionPane;

/**
 * Esta clase pretende mostrar un mensaje mediante una interfaz grafica
 * @author steven,irkus
 */
public class ViewSwingImplementation implements View{

    /**
     * Metodo para mostrar el saludo mediante una interfaz grafica usando 
     * la biblioteca grafica Java Swing
     * @param message recibe el saludo y lo muestra creando una ventana con 
     * el parametro recibido
     */
    @Override
    public void showGreeting(String message) {
        JOptionPane.showMessageDialog(null,message);
    }   
    
}
