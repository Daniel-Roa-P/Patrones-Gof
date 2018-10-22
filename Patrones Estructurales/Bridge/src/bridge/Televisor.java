
package bridge;

public class Televisor implements Samsung{

    @Override
    public void creador(String creador) {
        
        System.out.println("Televisor : "+creador);
        
    }

    @Override
    public void carateristicas(String caracteristicas) {
        
        System.out.println("Calidad de imagen : "+caracteristicas);
        
    }
    
}