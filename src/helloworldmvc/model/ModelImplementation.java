/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**test
 *
 * @author steven,irkus
 */
public class ModelImplementation implements Model{
    
    @Override
    public String getGreeting() {
        
        ResourceBundle greetingFile = ResourceBundle.getBundle("helloworldmvc.properties.greeting");
        return greetingFile.getString("MESSAGE");
        
    }
    
}
