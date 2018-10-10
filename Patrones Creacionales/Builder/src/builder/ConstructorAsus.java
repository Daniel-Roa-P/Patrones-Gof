/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author danbr
 */
public class ConstructorAsus extends Constructor{

    @Override
    public void construirComputador() {
        
        computador=new Computador();
               
        }

    @Override
    public void construirRam() {
        
        computador.setRam("8 gigas");
        
    }

    @Override
    public void construirProcesador() {
        computador.setProcesador("AMD Dual Core A9");
    }

    @Override
    public void construirDiscoDuro() {
        
        computador.setDiscoDuro("1 Tera");
        
    }

    @Override
    public void construirReferencia() {
    
        computador.setReferencia("ASUS X505BP");   
        
    }
        
}
