
package decorator;

public class DecoratorPc implements Computador{

    protected Computador c;
    
    DecoratorPc(Computador c){
    
        this.c=c;
        
    }
    
    @Override
    public void agregar() {
        this.c.agregar();
    }
    
}
