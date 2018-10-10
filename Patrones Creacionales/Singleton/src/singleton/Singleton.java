package singleton;

public class Singleton {
    
    private final String marca;
    private  static Singleton carro;
    
    private Singleton(String marca){
    
        this.marca=marca;
        System.out.println("Marca registrada: "+marca);
    }
    
    public static Singleton getObjeto(String marca){
        
        if(carro==null){
            
            carro=new Singleton(marca);
            
        } else {
            
            System.out.println("la marca "+marca+" no pudo ser registrada pues esta ya esta ocupada");
            
        }
        return carro;
        
    }
    
    public String getMarca(){
        return marca;
    }
    
}
