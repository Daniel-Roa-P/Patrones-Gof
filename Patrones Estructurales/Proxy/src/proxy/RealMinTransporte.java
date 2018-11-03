
package proxy;

public class RealMinTransporte implements MinTransporte{

    @Override
    public void permisos(String coche) {
        
        System.out.println("El "+ coche +" esta en circulacion.");
        
    }
    
}
