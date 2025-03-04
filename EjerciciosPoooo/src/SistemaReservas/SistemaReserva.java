
package SistemaReservas;

import java.util.Scanner;

public class SistemaReserva {
    
    public static void main(String[] args) {
        // sistema de reserva
        
      
        int capacidad = 10;
        int asientosDisponibles = capacidad;
        
        // Crear un arreglo para simular los asientos (0 para libre, 1 para reservado)
        int[] asientos = new int[capacidad];
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Bucle principal para realizar las reservas hasta que se llene la sala
        while (asientosDisponibles > 0) {
            System.out.println("Bienvenido al sistema de reservas");
            System.out.println("Actualmente hay " + asientosDisponibles + " asientos disponibles.");
            System.out.print("Ingrese el número de asiento que desea reservar (1 a " + capacidad + "): ");
            
            int asiento = scanner.nextInt() - 1; // Restamos 1 para ajustarlo a un índice de arreglo (0 basado)
            
            // Validar si el número de asiento ingresado es válido
            if (asiento < 0 || asiento >= capacidad) {
                System.out.println("Número de asiento inválido. Intente de nuevo.");
            } else if (asientos[asiento] == 1) {
                // Si el asiento ya está reservado
                System.out.println("El asiento " + (asiento + 1) + " ya está reservado. Intente con otro asiento.");
            } else {
                // Realizar la reserva
                asientos[asiento] = 1;
                asientosDisponibles--;
                System.out.println("¡Reserva exitosa! Ha reservado el asiento número " + (asiento + 1));
            }
            
            // Verificar si ya no hay asientos disponibles
            if (asientosDisponibles == 0) {
                System.out.println("La sala está completa. No hay más asientos disponibles.");
                break;
            }
        }
        
        // Cerrar el scanner al final
        scanner.close();
    }
}

       

       
