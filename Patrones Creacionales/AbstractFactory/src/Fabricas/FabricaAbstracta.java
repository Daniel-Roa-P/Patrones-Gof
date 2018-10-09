/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.DistribucionAbstracta;
import Productos.NavegadorAbstracto;
import Productos.OfficeAbstracto;

public abstract class FabricaAbstracta {
  
    public abstract DistribucionAbstracta crearDistro();
    public abstract OfficeAbstracto crearOffice();
    public abstract NavegadorAbstracto crearNavegador();
}
