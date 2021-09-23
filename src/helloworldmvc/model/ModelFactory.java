/*test
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 *
 * @author steven,irkus
 */
public class ModelFactory {
    
    private static final String modelTypeText = "TEXT";
    private static final String modelTypeBd = "BD";
    
    public static Model getModel() {
        
        Model model = null;
        
        ResourceBundle configFile = ResourceBundle.getBundle("helloworldmvc.properties.config");
        String modelType = configFile.getString("MODEL_TYPE");
        
        if (modelType.equalsIgnoreCase(modelTypeText)) {
            model = new ModelImplementation();
        }
        
        if (modelType.endsWith(modelTypeBd)) {
            model = new ModelBDImplementation();
        }
        
        return model;
        
    }
    
    
    
}
