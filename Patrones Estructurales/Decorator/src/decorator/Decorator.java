
package decorator;

public class Decorator {

    public static void proceso(){
    
        Computador diseño = new PcGamer(new PcSencillo());
	diseño.agregar();
        
	System.out.println(" ");
		
	Computador gamer = new PcDiseño(new PcSencillo());
	gamer.agregar();
        
    }
    
    public static void main(String[] args) {
       
        proceso();
        
    }
    
}
