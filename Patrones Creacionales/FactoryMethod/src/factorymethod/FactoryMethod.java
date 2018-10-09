
package factorymethod;

import Creadores.CreadorAbstracto;
import Creadores.CreadorCarro;
import Creadores.CreadorMoto;
import Productos.Vehiculo;
import java.util.Scanner;

public class FactoryMethod {
    
    static String opcion;
    static CreadorAbstracto creador;
    static Vehiculo vehiculo;
    static Scanner sc = new Scanner(System.in);
        
    public static void operacion(){
        
        System.out.println("¿Desea una moto o un carro?");
        
        while(true){
        
            opcion=sc.next();
        
            if("moto".equals(opcion)){
            
                creador = new CreadorMoto();
                break;
            
            }else if("carro".equals(opcion)){
        
                creador = new CreadorCarro();
                break;
            
            }else{
            
                System.out.println("Digite bien los datos");
            
            }
        }
        
        vehiculo=creador.crearVehiculo();
        System.out.println(vehiculo.entrega());
        
    }
        
    public static void main(String[] args) {

        operacion();
        
    }   
    
}
