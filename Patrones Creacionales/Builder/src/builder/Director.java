
package builder;

public class Director {
    
    private Constructor constructor;

    public void setConstructor(Constructor constructor) {
        
        this.constructor = constructor; 
        
    }
    
    public Computador getComputador(){
        return constructor.getComputador();
    }
    
    public void construirComputador(){
        
        constructor.construirComputador();
        constructor.construirRam();
        constructor.construirDiscoDuro();
        constructor.construirProcesador();
        constructor.construirReferencia();
    }
    
}
