package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 * Esta clase pretende manejar la creacion de un Modelo, accediendo a un 
 * archivo de configuracion para su instanciacion.
 * @author steven,irkus
 */
public class ModelFactory {
    
    private static final String modelTypeText = "TEXT";
    private static final String modelTypeBd = "BD";
    
    /**
     * Metodo para instanciar un Modelo segun el archivo de configuracion
     * @return devuelve un Modelo que se instancia segun la configuracion que
     * se haya hecho
     */
    public static Model getModel() {
        
        Model model = null;
        
        ResourceBundle configFile = ResourceBundle.getBundle("helloworldmvc.properties.config");
        String modelType = configFile.getString("MODEL_TYPE");
        
        if (modelType.equalsIgnoreCase(modelTypeText)) {
            model = new ModelImplementation();
        }
        
        if (modelType.equalsIgnoreCase(modelTypeBd)) {
            model = new ModelBDImplementation();
        }
        
        return model;
        
    }
    
    
    
}
