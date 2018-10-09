/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creadores;

import Productos.Vehiculo;

/**
 *
 * @author danbr
 */
public abstract class CreadorAbstracto {
    
    public abstract Vehiculo MetodoFactoria();
    
    public Vehiculo crearVehiculo(){
        return MetodoFactoria();
    }
    
    
    
}
