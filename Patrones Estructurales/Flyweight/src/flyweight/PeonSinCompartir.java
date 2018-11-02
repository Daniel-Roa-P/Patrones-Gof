/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author danbr
 */
public class PeonSinCompartir implements FichaAjedrez{

    private final PeonConcreto peon= FactoriaAjedrez.getPeon();
    int x,y,i;
    
    PeonSinCompartir(int x,int y,int i){
    
        peon.operacion();
        this.x=x;
        this.y=y;
        this.i=i;
    }
    
    @Override
    public void operacion() {
        
        System.out.println(i+" ubicado en la casilla: x="+x+", y="+y);
        
    }
    
}
