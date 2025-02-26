
package cinema;

import java.util.Scanner; 

public class Cinema {

    
    public static void main(String[] args) {
        // Crear pelicula
        Pelicula pelicula = new Pelicula ("Interestellar ", "Chistopher ", 10 );
        
        //Crear sala con la pelicula y 50 sillas
        Sala sala = new Sala (1, pelicula, 50);
        
        // Crear Cliente
        Cliente cliente = new Cliente ("Maria Lopez ","maria.lopez@examples.com");
        
        //Cliente reserva una silla
        int sillaAReservar = 25;
        
        boolean reservaExitosa = sala.reservarSilla (sillaAReservar);
        
        if(reservaExitosa){
            System.out.println("La silla "+sillaAReservar+ " a sido reservada exitosamente por "+ cliente.getNombre());
        }else{
            System.out.println("los siento, la silla "+ sillaAReservar+ " no esta disponible. ");
        }
    }
    
}
