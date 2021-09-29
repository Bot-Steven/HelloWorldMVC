
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import static org.junit.Assert.*;




import org.junit.Test;

/**
 *
 * @author steven,irkus
 */
public class ModelBDImplementationTest {
    
    

    @Test
    public void testgetGreeting() {
        Model bdim = new ModelBDImplementation();
        String resultado = "Hola mundo desde la BD";
        assertEquals("No es BD",resultado,bdim.getGreeting());
    }
    
}

