/*
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
    
    private final static String viewTypeText = "TEXT";
    private final static String viewTypeSwing = "SWING";
    private final static String viewTypeFx = "FX";
    
    public static View getView() {
        
        View view = null;
        
        ResourceBundle configFile = ResourceBundle.getBundle("C:\\Users\\2dam.TARTANGALH\\Documents\\HelloWorldMVC\\src\\helloworldmvc\\properties\\config");
        String viewType = configFile.getString("VIEW_TYPE");
        
        if (viewType.equalsIgnoreCase(viewTypeText)) {
            view = new ViewTextImplementation();
        }
        
        return view;
        
    }
    
}
