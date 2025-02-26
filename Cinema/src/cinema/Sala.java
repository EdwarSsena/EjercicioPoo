
package cinema;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numeroSala;
    private Pelicula pelicula;
    private List<Silla> sillas;
    
    //Constructor sala
    public Sala(int numero, Pelicula pelicula, int cantidadSillas){
        this.numeroSala = numero;
        this.pelicula = pelicula;
       this.sillas = new ArrayList<>();
        
//Bucle crea las sillas en la sala
    for (int i = 1 ; i <= cantidadSillas; i++){
       sillas.add(new Silla(i));
    }
    
}//Metodo de la reserva silla
    public boolean reservaSilla(int numeroSilla){
        for (Silla silla : sillas){
            if (silla.getNumero()== numeroSilla && silla.isDisponible()){
                silla.reservar();
                return true;
            }
        }
        return false;
    }
    //Getter y Setter
    public int getNumeroSala(){
        return numeroSala;
    }
    
        public Pelicula getPelicula(){
            return pelicula;
        }
    public List<Silla> getSillas(){
        return sillas;
    }
/*
    boolean reservarSilla(int sillaAReservar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  */ 
    }

