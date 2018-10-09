/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.DistribucionAbstracta;
import Productos.InternetExplorer;
import Productos.MicrosoftOffice;
import Productos.NavegadorAbstracto;
import Productos.OfficeAbstracto;
import Productos.Windows10;

/**
 *
 * @author danbr
 */
public class FabricaWindows extends FabricaAbstracta{

    @Override
    public DistribucionAbstracta crearDistro() {
        
        return new Windows10();
        
    }

    @Override
    public OfficeAbstracto crearOffice() {
        
        return new MicrosoftOffice();

    }

    @Override
    public NavegadorAbstracto crearNavegador() {
        
        return new InternetExplorer();

    }
    
}
