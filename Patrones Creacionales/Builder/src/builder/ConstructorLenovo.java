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
public class ConstructorLenovo extends Constructor {

    @Override
    public void construirComputador() {
        computador=new Computador();
    }

    @Override
    public void construirRam() {
        
        computador.setRam("4 gigas");
        
    }

    @Override
    public void construirProcesador() {
        computador.setProcesador("Intel core i3");
    }

    @Override
    public void construirDiscoDuro() {
        
        computador.setDiscoDuro("500 Gigas");
        
    }

    @Override
    public void construirReferencia() {
    
        computador.setReferencia("Lenovo YOGA  520");   
        
    }
    
}
