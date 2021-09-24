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
    
    private static final String viewTypeText = "TEXT";
    private static final String viewTypeSwing = "SWING";
    private static final String viewTypeFx = "FX";
    
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
