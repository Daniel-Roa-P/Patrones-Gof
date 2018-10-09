/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Productos.OfficeAbstracto;
import Productos.NavegadorAbstracto;
import Fabricas.FabricaAbstracta;
import Productos.DistribucionAbstracta;

/**
 *
 * @author danbr
 */
public class Cliente {

    private final DistribucionAbstracta distro;
    private final OfficeAbstracto office;
    private final NavegadorAbstracto nav; 
    
    Cliente(FabricaAbstracta factory) {
        
        distro=factory.crearDistro();
        office=factory.crearOffice();
        nav=factory.crearNavegador();
        
    }
    
    public String recibirDristo(){
        
        return distro.getDistro();
        
    }
    
    public String recibirOffice(){
        
        return office.getOffice();
        
    }
    
    public String recibirNav(){
        
        return nav.getNavegador();
        
    }
    
    
    
}
