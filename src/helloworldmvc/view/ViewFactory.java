/*test
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import java.util.ResourceBundle;

/**
 *
 * @author steven,irkus
 */
public class ViewFactory {
    
    private static final String viewTypeText = "TEXT";
    private static final String viewTypeSwing = "SWING";
    private static final String viewTypeFx = "FX";
    
    public static View getView() {
        
        View view = null;
        
        ResourceBundle configFile = ResourceBundle.getBundle("helloworldmvc.properties.config");
        String viewType = configFile.getString("VIEW_TYPE");
        
        if (viewType.equalsIgnoreCase(viewTypeText)) {
            view = new ViewTextImplementation();
        }
        
        return view;
        
    }
    
}
