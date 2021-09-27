/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import javax.swing.JOptionPane;

/**
 *
 * @author steven,irkus
 */
public class ViewSwingImplementation implements View{

    @Override
    public void showGreeting(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
    
}
