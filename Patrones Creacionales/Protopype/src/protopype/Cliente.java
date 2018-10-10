
package protopype;

public class Cliente {
    
    private XboxOne xbox;
    private PlayStation4 play;
 
    public Cliente(){
        
        xbox=new XboxOne();
        play=new PlayStation4();
        
        xbox.setCreador("Microsoft");
        xbox.setJuego("Halo infinite");
        xbox.setCosto("300 $");
        xbox.setControles("Xbox Elite");
        
        play.setCreador("Sony");
        play.setJuego("The last of us 2");
        play.setCosto("350 $");
        play.setControles("DualShock 4");
        
    }
    
    public PrototipoConsola retrievePersonaje(String id) {
        if (null != id) switch (id) {
            case "xbox":
                return (PrototipoConsola) xbox.clone();
            case "ps4":
                return (PrototipoConsola) play.clone();
            default:
                break;
        }

        return null;
    }
    
}
