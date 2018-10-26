
package facade;

public class Fachada {

    double n1,n2;
    
    Fachada(double n1, double n2){
    
        this.n1=n1;
        this.n2=n2;
        
    }
    
    public double llamaSuma(){ 
        Suma s=new Suma();
        return s.proceso(n1, n2);
    }
    
    public double llamaResta(){
        Resta r=new Resta();
        return r.proceso(n1, n2);
    }
    public double llamaMul(){
        Multiplicacion m=new Multiplicacion();
        return m.proceso(n1, n2);
    } 
    
    public double llamaDiv(){
        Division d=new Division();
        return d.proceso(n1, n2);
    }
}
