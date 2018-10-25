
package composite;

public class ProductoSimple extends ProductoAbstracto{

    ProductoSimple(String producto, String marca, int precio){
    
        this.producto=producto;
        this.marca=marca;
        this.precio=precio;
        
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
