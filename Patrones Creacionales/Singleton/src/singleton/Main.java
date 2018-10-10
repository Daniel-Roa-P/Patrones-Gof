
package singleton;

public class Main {
    
    static Singleton toyota;
    static Singleton nissan;
    
    public static void proceso(){
        
        toyota= Singleton.getObjeto("Toyota");
        nissan= Singleton.getObjeto("Nissan");
        
        System.out.println("objeto actual: "+toyota.getMarca());
        System.out.println("objeto actual: "+nissan.getMarca());
    }
    
    public static void main(String[] args) {

        proceso();
        
    }
    
}
