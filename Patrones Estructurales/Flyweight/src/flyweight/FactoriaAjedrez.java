
package flyweight;

public class FactoriaAjedrez {
    
    private static PeonConcreto PeonInstanciado = null;
    
    public static PeonConcreto getPeon(){
        
        if (PeonInstanciado == null){
            PeonInstanciado = new PeonConcreto();
        }
        return PeonInstanciado;
    }
    
}
