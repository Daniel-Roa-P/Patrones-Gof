
package bridge;



public class Bridge {
    
    public static void operacion(){

        Tecnologia tec = new Electronicos(new Televisor(),"55 pulgadas UHD","4K");
        tec.operacion();
        tec = new Electronicos(new Celular(),"Galaxy Note 9","12 ");
        tec.operacion();
        
    }
    
    public static void main(String[] args) {

        operacion();
        
    }
    
}
