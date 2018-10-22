
package bridge;

public abstract class Tecnologia {
    
    protected Samsung fabrica;
    
    public Tecnologia(Samsung fabrica){
    
        this.fabrica=fabrica;
        
    }
    
    public abstract void operacion();
    
}
