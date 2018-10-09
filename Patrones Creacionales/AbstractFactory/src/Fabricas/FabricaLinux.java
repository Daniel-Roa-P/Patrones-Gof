/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.DistribucionAbstracta;
import Productos.Firefox;
import Productos.LibreOffice;
import Productos.NavegadorAbstracto;
import Productos.OfficeAbstracto;
import Productos.Ubuntu;

/**
 *
 * @author danbr
 */
public class FabricaLinux extends FabricaAbstracta{

    @Override
    public DistribucionAbstracta crearDistro() {
        
        return new Ubuntu();

    }

    @Override
    public OfficeAbstracto crearOffice() {
        
        return new LibreOffice();
        
    }

    @Override
    public NavegadorAbstracto crearNavegador() {
    
        return new Firefox();
        
    }
    
}
