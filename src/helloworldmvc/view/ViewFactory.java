package helloworldmvc.view;

import java.util.ResourceBundle;

/**
 * Esta clase pretende manejar la creacion de una Vista, accediendo a un 
 * archivo de configuracion para su instanciacion.
 * @author steven,irkus
 */
public class ViewFactory {
    
    private static final String viewTypeText = "TEXT";
    private static final String viewTypeSwing = "SWING";
    private static final String viewTypeFx = "FX";
    
    /**
     * Metodo para instanciar una Vista segun el archivo de configuracion
     * @return devuelve una Vista que se instancia segun la configuracion que
     * se haya hecho
     */
    public static View getView() {
        
        View view = null;
        
        String viewType =  ResourceBundle.getBundle("helloworldmvc.properties."
                + "config").getString("VIEW_TYPE");
        
        if (viewType.equalsIgnoreCase(viewTypeText)) {
             view = new ViewTextImplementation();
        }
        if (viewType.equalsIgnoreCase(viewTypeSwing)) {
            view = new ViewSwingImplementation();
        }
        if (viewType.equalsIgnoreCase(viewTypeFx)) {
            view = new ViewFXImplementation();
        }
        return view;
        
    }
    
}
