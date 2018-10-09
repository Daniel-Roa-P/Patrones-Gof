package Creadores;

import Productos.Moto;
import Productos.Vehiculo;

public class CreadorMoto extends CreadorAbstracto {
    
    @Override
    public Vehiculo MetodoFactoria() {
        
        return new Moto();
        
    }
    
}
