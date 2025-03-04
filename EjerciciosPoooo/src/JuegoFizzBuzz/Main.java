
package JuegoFizzBuzz;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al juego FizzBuzz ");
        System.out.println("Deseas juagar? (si/no ");
        
        String respuesta = scanner.nextLine().trim().toLowerCase();
        
        if(respuesta.equals("si")){
        
        // Crear una instancia de FizzBuzz
        FizzBuzz juego = new FizzBuzz();
        
        // Llamar al método para ejecutar el juego
        juego.ejecutarJuego();
        }else{
            System.out.println("Hasta la proxima ");
        }
    }
}


