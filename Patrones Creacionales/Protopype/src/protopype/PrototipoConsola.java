
package protopype;

public class PrototipoConsola implements Cloneable {
    
    private String creador;
    private String Juego;
    private String costo;
    private String controles;

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getJuego() {
        return Juego;
    }

    public void setJuego(String Juego) {
        this.Juego = Juego;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getControles() {
        return controles;
    }

    public void setControles(String controles) {
        this.controles = controles;
    }
    
    @Override
    public PrototipoConsola clone(){
    
        PrototipoConsola clonedPrototipoPersonajes=null;
        
        try {
            clonedPrototipoPersonajes = (PrototipoConsola) super.clone();
            clonedPrototipoPersonajes.setCreador(creador);
            clonedPrototipoPersonajes.setJuego(Juego);
            clonedPrototipoPersonajes.setCosto(costo);
            clonedPrototipoPersonajes.setControles(controles);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonedPrototipoPersonajes;
        
    }
    
}
