package helloworldmvc.view;

/**
 * Esta clase pretende mostrar un mensaje mediante una interfaz de usuario
 * @author steven,irkus
 */
public class ViewTextImplementation implements View{

    /**
     * Metodo para mostrar el mensaje obtenido mediante una interfaz de tipo
     * texto
     * @param message recibe el saludo y lo muestra por consola
     */
    @Override
    public void showGreeting(String message) {
        System.out.println(message);
    }
    
    
    
}
