/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import helloworldmvc.model.Model;
import helloworldmvc.model.ModelBDImplementation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ViewFactoryTest {
    

    @Test
    public void testGetView() {

        ViewFactory vf = new ViewFactory();
        assertNotNull(vf);
        
    }
    @Test
    public void testGetViewTextImplementation() {
        Model mibd = new ModelBDImplementation();
        assertTrue("No es Texto",mibd instanceof ModelBDImplementation);
    }
    @Test
    public void testGetViewFxImplementation() {
        Model mibd = new ModelBDImplementation();
        assertTrue("No es JavaFx",mibd instanceof ModelBDImplementation);
    }
    @Test
    public void testGetViewSwingImplementation() {
        Model mibd = new ModelBDImplementation();
        assertTrue("No es Swing",mibd instanceof ModelBDImplementation);
    }
    
}
