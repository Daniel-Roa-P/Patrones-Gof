
package decorator;

public class PcDiseño extends DecoratorPc{
    
    public PcDiseño(Computador c) {
        super(c);
    }
    
    @Override
    public void agregar() {
        
        super.agregar();
        System.out.print("Diseño: Procesador Intel Core i3, Memoria Ram 4GB, Pantalla Tactil");
        
    }
    
}
