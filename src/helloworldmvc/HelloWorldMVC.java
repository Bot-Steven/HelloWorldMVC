package helloworldmvc;

import helloworldmvc.controller.Controller;
import static helloworldmvc.model.ModelFactory.getModel;
import static helloworldmvc.view.ViewFactory.getView;

/**
 * Esta clase se usa como punto de entrada de la aplicacion.
 * @author steven,irkus
 */
public class HelloWorldMVC {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Controller controller = new Controller();
        controller.run(getView(), getModel());
    }
    
}
