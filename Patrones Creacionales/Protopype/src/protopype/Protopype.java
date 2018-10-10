
package protopype;

import java.util.Scanner;

public class Protopype {

    static String opcion;
    static Cliente cliente;
    static Scanner sc = new Scanner(System.in);
        
    public static void operacion(){
        
        System.out.println("¿Desea un xbox o un ps4?");
        
        cliente=new Cliente();
        PrototipoConsola prot;
        
        while(true){
        
            opcion=sc.next();
        
            if(("ps4".equals(opcion)) || ("xbox".equals(opcion))){
            
                prot=cliente.retrievePersonaje(opcion);
                break;
                
            }else{
            
                System.out.println("Digite bien los datos");
            
            }
        }
        
        System.out.println("La empresa creadora de su consola es: "+prot.getCreador());
        System.out.println("Incluye el juego: "+prot.getJuego() );
        System.out.println("Con un mando: "+ prot.getControles());
        System.out.println("A un costo de: "+prot.getCosto());

        
    }
        
    public static void main(String[] args) {

        operacion();
        
    }
    
}
