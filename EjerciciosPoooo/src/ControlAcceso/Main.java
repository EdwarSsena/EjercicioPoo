
package ControlAcceso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al programa ");
        // Preguntar al usuario si desea ejecutar el programa
        System.out.print("¿Deseas ejecutar el sistema de control de acceso a la tienda? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        // Si el usuario responde "si", continuar con la ejecución
        if (respuesta.equals("si")) {
            // Crear una instancia del sistema de control de acceso
            ControlAcceso controlAcceso = new ControlAcceso();

            // Iniciar la simulación del control de acceso
            controlAcceso.simularAcceso();
        } else {
            // Si el usuario no quiere ejecutar el sistema, se termina
            System.out.println("¡Hasta la próxima!");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
