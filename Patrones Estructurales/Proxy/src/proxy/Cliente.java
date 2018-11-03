
package proxy;

public class Cliente {

    public static void main(String[] args) {
        
        MinTransporte carros =new ProxyMin();
        
        carros.permisos("Audi R8");
        carros.permisos("Renault 4");
        carros.permisos("Mazda 323");
        carros.permisos("Ford Fiesta");
        
    }
    
}
