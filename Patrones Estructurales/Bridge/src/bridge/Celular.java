
package bridge;

public class Celular implements Samsung{

    @Override
    public void creador(String creador) {
        
        System.out.println("Celular : "+creador);
        
    }

    @Override
    public void carateristicas(String caracteristicas) {
        
        System.out.println("Camara de  : "+caracteristicas+ "megapixeles");
        
    }
    
}
