
package adapter;

public class Ford extends Carro{

     @Override
    public void setFabricante() {
        this.fabricante="Ford";
    }

    @Override
    public void setModelo() {
        this.modelo="Mustang 2018";
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
    
}
