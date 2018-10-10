
package builder;

public abstract class Constructor {
    
     protected Computador computador;
    
    public Computador getComputador(){
        return computador;
    }
    
    public abstract void construirComputador();
    public abstract void construirReferencia();
    public abstract void construirRam();
    public abstract void construirProcesador();
    public abstract void construirDiscoDuro();
    
}
