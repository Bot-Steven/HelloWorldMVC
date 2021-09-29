package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 * Esta clase pretende obtener un mensaje de un archivo de configuracion
 * @author steven,irkus
 */
public class ModelImplementation implements Model{
    
    /**
     * Metodo para obtener el parametreo "MESSAGE" del archivo de configuracion
     * @return devuelve el mensaje obtenido del archivo de configuracion
     */
    @Override
    public String getGreeting() {
        
        ResourceBundle greetingFile = ResourceBundle.getBundle("helloworldmvc.properties.greeting");
        return greetingFile.getString("MESSAGE");
        
    }
    
}
