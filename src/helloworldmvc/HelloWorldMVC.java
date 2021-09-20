/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc;

import helloworldmvc.controller.Controller;
import static helloworldmvc.model.ModelFactory.getModel;
import static helloworldmvc.view.ViewFactory.getView;

/**
 *
 * @author steven,irkus
 */
public class HelloWorldMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controller controller = new Controller();
        controller.run(getView(), getModel());
    }
    
}
