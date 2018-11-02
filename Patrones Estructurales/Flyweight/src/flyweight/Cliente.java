
package flyweight;

public class Cliente {

    public static void proceso(){
        
        int x,y;
        
        PeonSinCompartir[] peones = new PeonSinCompartir[8];
        
        for(int i=0; i<8; i++){
            
            x=(int) (8*Math.random());
            y=(int) (8*Math.random());
            
            peones[i] = new PeonSinCompartir(x,y,i);
            peones[i].operacion();
            
        }
        
        
    }
    
    public static void main(String[] args) {

        proceso();
        
    }
    
}
