/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creadores;

import Productos.Carro;
import Productos.Vehiculo;

/**
 *
 * @author danbr
 */
public class CreadorCarro extends CreadorAbstracto{

    @Override
    public Vehiculo MetodoFactoria() {
        
        return new Carro();
        
    }
    
}
