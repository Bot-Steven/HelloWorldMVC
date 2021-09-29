
package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author steven,irkus
 */
public class ModelImplementationTest {
    
    @Test
    public void testGetGreeting() {
        
        Model model = new ModelImplementation();
        String resultado = "HOLA MUNDO";
        assertEquals("No es archivo",resultado,model.getGreeting());
        
    }
    
}

