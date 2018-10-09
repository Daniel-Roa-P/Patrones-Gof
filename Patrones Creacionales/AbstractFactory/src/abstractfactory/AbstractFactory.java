
package abstractfactory;

import Fabricas.FabricaWindows;
import Fabricas.FabricaLinux;
import Fabricas.FabricaAbstracta;
import java.util.Scanner;


public class AbstractFactory {
    
    public static void main(String[] args) {
        
        int k=0;
        String cadena;
        Scanner sc = new Scanner(System.in);
        Cliente c = null;
            
        while(k==0){
        
        System.out.println("Eliga el sistema operativo que desea para su pc:");
        System.out.println("1)Windows");
        System.out.println("2)Linux");
        
        cadena=sc.next();
        
        if("1".equals(cadena)){
            
            FabricaAbstracta factory=new FabricaWindows();
            c = new Cliente(factory);
            k=1;
            
        }else if("2".equals(cadena)){
        
            FabricaAbstracta factory=new FabricaLinux();
            c = new Cliente(factory);
            k=1;
            
        }else{
            
            System.out.println("Digite bien los datos");
            
        }
        }
        
        System.out.println("Su PC posee:");
        System.out.println("Disrtibucion: "+c.recibirDristo());
        System.out.println("Navegador por defecto: "+c.recibirNav());
        System.out.println("Los programas de oficina son "+c.recibirOffice());
        
    }
    
}
