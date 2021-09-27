/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author steven,irkus
 */
public class ModelBDImplementationTest {
    
    

    @Test
    public void testgetGreeting() {
        Model bdim = new ModelBDImplementation();
        String resultado = "Hola mundo desde la BD";
        assertEquals(resultado,bdim.getGreeting());
    }
    
}
