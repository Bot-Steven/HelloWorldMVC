package helloworldmvc.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelFactoryTest {
    
    @Test
    public void testGetModel() {
       
       assertNotNull("nulo",ModelFactory.getModel());
       //assertEquals("no es modelo",mo,ModelFactory.getModel());
       
        
    }
    
}
