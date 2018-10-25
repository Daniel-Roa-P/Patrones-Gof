
package composite;

import java.util.ArrayList;

public class Paquete extends ProductoAbstracto{

    ArrayList<ProductoAbstracto> partes = new ArrayList<ProductoAbstracto>(); 
    
    public void addPart(ProductoAbstracto c){
        partes.add(c);
    }
    
    public void agrupar(){
    
        for(ProductoAbstracto parte:partes){
        
            producto=producto+" / "+parte.getProducto()+" / ";
            marca=marca+" / "+parte.getMarca()+" - "+Integer.toString(parte.getPrecio())+"$ / ";
            precio=precio+parte.getPrecio();
            
        }
        
    }
    
     @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getProducto() {
        return producto;
    }

    @Override
    public String getMarca() {
        return marca;
    } 
}
