
package bridge;

public class Electronicos extends Tecnologia{
        
        private final String marca;
        private final String car;
        
    public Electronicos(Samsung fabrica, String marca, String car) {
        
        super(fabrica);
        this.marca=marca;
        this.car=car;
        
    }

    @Override
    public void operacion() {
        
        fabrica.creador(marca);
        fabrica.carateristicas(car);
        
    }
        
    
    
}
