/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.controller;

import helloworldmvc.model.Model;
import helloworldmvc.view.View;

/**
 *
 * @author steven,irkus
 */
public class Controller {

    public Controller() {
        
    }
    
    public void run(View view,Model model){
        view.showGreeting(model.getGreeting());
    }
    
}
