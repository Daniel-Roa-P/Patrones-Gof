
package decorator;

public class PcGamer extends DecoratorPc{
    
    public PcGamer(Computador c) {
        super(c);
    }
    
    @Override
    public void agregar() {
        
        super.agregar();
        System.out.println("Gamer: Procesador Intel Core i7, Memoria Ram 16GB, Tarjeta grafica Nvidia RTX 2080");
        
    }
    
}
