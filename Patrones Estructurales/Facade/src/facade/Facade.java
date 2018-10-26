
package facade;

import java.util.Scanner;

public class Facade {

    public static double n1;
    public static double n2;
    public static String opcion;
    public static Scanner sc = new Scanner(System.in);
    
    public static void proceso(){
        
        
        
        while(true){
        
            System.out.println("Ingrese el primer numero: ");
            n1=sc.nextDouble();
            System.out.println("Ingrese el segundo numero: ");  
            n2=sc.nextDouble();
            
            Fachada f=new Fachada(n1,n2);
            
            System.out.println("ingrese la oprecaion que desea hacer");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            
            opcion=sc.next();
            
            if("1".equals(opcion)){
               System.out.println("Suma: "+n1+" + "+n2+" = "+f.llamaSuma());
            }else if("2".equals(opcion)){
               System.out.println("Resta: "+n1+" - "+n2+" = "+f.llamaResta());
            }else if("3".equals(opcion)){
               System.out.println("Multiplicacion: "+n1+" * "+n2+" = "+f.llamaMul());
            }else if("4".equals(opcion)){
               System.out.println("Division: "+n1+" / "+n2+" = "+f.llamaDiv());
            } else {
                System.out.println("digite bien las opciones");
            }
            
            System.out.println(" ");
            
        }
        
    }
    
    public static void main(String[] args) {

        proceso();
    }
    
}
