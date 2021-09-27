package helloworldmvc.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author steven,irkus
 */
public class ModelFactoryTest {
    
    @Test
    public void testGetModel() {      
        ModelFactory mf = new ModelFactory();
        assertNotNull(mf);       
    }
    
    @Test
    public void testGetModelImplementation() {
        Model mi = new ModelImplementation();
        assertTrue(mi instanceof ModelImplementation);        
    }
    
    @Test
    public void testGetModelBDImplementation() {
        Model mibd = new ModelBDImplementation();
        assertTrue(mibd instanceof ModelBDImplementation);
    }
    
}
