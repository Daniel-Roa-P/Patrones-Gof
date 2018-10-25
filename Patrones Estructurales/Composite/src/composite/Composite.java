
package composite;

public class Composite {

    public static void operacion(){
        
        ProductoSimple mac= new ProductoSimple("PC","mac book air",1300);
        ProductoSimple hp= new ProductoSimple("PC","HP all in one",1000);
        
        ProductoSimple ferrari= new ProductoSimple("Choce Depotivo","Ferrari F12",1500000);
        ProductoSimple lamborghini= new ProductoSimple("Choce Depotivo","Lamborghini Gallardo",1300000);
        
        ProductoSimple ps4= new ProductoSimple("Consola VideoJuegos","PS4",400);
        ProductoSimple xbox= new ProductoSimple("Consola VideoJuegos","XBOX one",450);
        ProductoSimple Switch= new ProductoSimple("Consola VideoJuegos","Ninitendo Shitch",300);

        ProductoSimple casaSimple= new ProductoSimple("Casa","casa con garage",750000);
        ProductoSimple casaPiscina= new ProductoSimple("Casa","casa con garage y piscina",500000);
    
        Paquete p=new Paquete();
        
        p.addPart(mac);
        p.addPart(ps4);
        p.agrupar();
        
        System.out.println("Paquete 1");
        System.out.println("Productos: "+p.getProducto());
        System.out.println("Marcas: "+p.getMarca());
        System.out.println("Precio: "+p.getPrecio()+" $");
        System.out.println("");
        
        p=new Paquete();
        p.addPart(casaSimple);
        p.addPart(hp);
        p.addPart(ferrari);
        p.agrupar();
        
        System.out.println("Paquete 2");
        System.out.println("Productos: "+p.getProducto());
        System.out.println("Marcas: "+p.getMarca());
        System.out.println("Precio: "+p.getPrecio()+" $");
        System.out.println("");
        
        p=new Paquete();
        p.addPart(casaPiscina);
        p.addPart(hp);
        p.addPart(lamborghini);
        p.addPart(Switch);
        p.addPart(xbox);
        p.agrupar();
        
        System.out.println("Paquete 3");
        System.out.println("Productos: "+p.getProducto());
        System.out.println("Marcas: "+p.getMarca());
        System.out.println("Precio: "+p.getPrecio()+" $");
    }
    
    public static void main(String[] args) {

        operacion();
        
    }
    
}
