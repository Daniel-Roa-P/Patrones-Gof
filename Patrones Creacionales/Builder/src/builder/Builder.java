
package builder;

import java.util.Scanner;

public class Builder {

    static String opcion;
    static Director director=new Director();
    static Computador computador;
    static Scanner sc = new Scanner(System.in);
        
    public static void operacion(){
        
        System.out.println("¿elija un computador : Lenovo ó ASUS?");
        
        while(true){
        
            opcion=sc.next();
        
            if("lenovo".equals(opcion) || "Lenovo".equals(opcion)){
            
                director.setConstructor(new ConstructorLenovo());
                
                break;
            
            }else if("asus".equals(opcion) || "ASUS".equals(opcion)){
        
                director.setConstructor(new ConstructorAsus());
                break;
            
            }else{
            
                System.out.println("Digite bien los datos");
            
            }
        }
        
        director.construirComputador();
        computador=director.getComputador();
        
        System.out.println("La referencia de su computador es: "+computador.getReferencia());
        System.out.println("Posee un disco duro de: "+computador.getDiscoDuro() );
        System.out.println("Su memoria es de: "+ computador.getRam());
        System.out.println("cuenta con un procesador: "+computador.getProcesador());
    }
        
    public static void main(String[] args) {

        operacion();
        
    }
    
}
