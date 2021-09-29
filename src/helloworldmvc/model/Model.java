/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

/**
 * Esto es una interfaz para obtener el saludo de un almacenamiento persistente
 * @author steven,irkus
 */
public interface Model {
    /**
     * Este metodo se va a usar para obtener el mensaje del Modelo
     * @return devuelve el saludo segun el tipo de Modelo   
     */
    public String getGreeting();
    
}
