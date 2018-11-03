
package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyMin implements MinTransporte{
    
    private final MinTransporte autos = new RealMinTransporte(); 
    private final List<String>retirados;

    public ProxyMin() {
        
        retirados=new ArrayList<>();
        
        this.retirados.add("Renault 4");
        this.retirados.add("Renault R6");
        this.retirados.add("Mazda 323");
        this.retirados.add("Fiat Premio");
        this.retirados.add("Chevolet Monza");

    }

    @Override
    public void permisos(String coche) {
       
        if(retirados.contains(coche)){
           
            System.out.println("El "+coche+" se encuentra fuera de circulacion");
        
        }else{
            autos.permisos(coche);
        }
        
        
        
    }
    
}
