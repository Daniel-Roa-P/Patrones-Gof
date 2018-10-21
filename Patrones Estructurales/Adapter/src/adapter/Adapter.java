
package adapter;


public class Adapter {

    public static void proceso(){
        
        Juguete juguete = new PistolaNerf();
        juguete.setDescripcion();
        System.out.println("Su jugete es: "+juguete.getDescripcion());

        juguete = new HotWheels(new Ford());
        juguete.setDescripcion();
        System.out.println("Su jugete es: "+juguete.getDescripcion());

        juguete = new HotWheels(new Chevrolet());
        juguete.setDescripcion();
        System.out.println("Su jugete es: "+juguete.getDescripcion());
        
    }
    
    public static void main(String[] args) {
        
       proceso();
        
    }
    
}
