
package cinema;


public class Silla {
    private int numero;
    private boolean disponible;
    
    public Silla(int numero){
        this.numero = numero;
        this.disponible = true;
    }
    public boolean isDisponible(){
        return disponible;
    }
    public void reservar(){
        this.disponible = false;
    }
    public int getNumero(){
        return numero;
    }
    
}
