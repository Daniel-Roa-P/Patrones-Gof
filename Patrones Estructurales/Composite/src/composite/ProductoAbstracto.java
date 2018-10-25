
package composite;

public abstract class ProductoAbstracto {
  
    protected int precio=0;
    protected String producto="";
    protected String marca="";

    public abstract int getPrecio();

    public abstract String getProducto();

    public abstract String getMarca();
    
}
