/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Productos.DistribucionAbstracta;

/**
 *
 * @author danbr
 */
public class Ubuntu extends DistribucionAbstracta {

    @Override
    public String getDistro() {
        
        return "Ubuntu de 64 bits";
        
    }
    
}
