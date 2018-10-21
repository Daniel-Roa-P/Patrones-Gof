
package adapter;

public class HotWheels extends Juguete{

    private final Carro carro;
    
    public HotWheels(Carro carro){
    
        this.carro=carro;
        
    }
    
    @Override
    public void setDescripcion() {
            
        carro.setFabricante();
        carro.setModelo();
        
        this.descripcion="Hotwheels "+carro.getFabricante()+", modelo: " +carro.getModelo();
        
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
    
}
