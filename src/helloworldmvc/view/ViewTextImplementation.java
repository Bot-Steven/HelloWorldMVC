/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

/**
 *
 * @author steven,irkus
 */
public class ViewTextImplementation implements View{

    @Override
    public void showGreeting(String message) {
        System.out.print(message);
    }
    
    
    
}
