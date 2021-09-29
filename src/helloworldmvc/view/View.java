package helloworldmvc.view;

/**
 * Esto es una interfaz para obtener un tipo de interfaz de usuario
 * @author steven,irkus
 */
public interface View {
    
    /**
     * Metodo para mostrar mediante una vista el saludo 
     * @param message recibe un mensaje o saludo para luego mostrarla en la 
     * vista
     */
    public void showGreeting(String message);
    
}
