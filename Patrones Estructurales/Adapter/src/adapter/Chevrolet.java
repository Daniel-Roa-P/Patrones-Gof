
package adapter;

public class Chevrolet extends Carro{

    @Override
    public void setFabricante() {
        this.fabricante="Chevrolet";
    }

    @Override
    public void setModelo() {
        this.modelo="Camaro 2018";
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
