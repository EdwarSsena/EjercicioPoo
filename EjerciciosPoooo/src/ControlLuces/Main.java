
package ControlLuces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        // Preguntar al usuario si desea ejecutar el sistema
        System.out.print("¿Deseas ejecutar el control de luces automático? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        // Si el usuario responde "si", continuar con la ejecución
        if (respuesta.equals("si")) {
            // Preguntar si es de noche (true o false)
            System.out.print("¿Es de noche? (true/false): ");
            boolean esDeNoche = scanner.nextBoolean();
            scanner.nextLine();  // Limpiar el buffer

            // Crear una instancia del sistema de control de luces
            ControlLuces controlLuces = new ControlLuces(esDeNoche);

            // Iniciar el control de luces en un bucle
            controlLuces.simularControlDeLuces();
        } else {
            // Si el usuario no quiere ejecutar el sistema, se termina
            System.out.println("¡Hasta la próxima!");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
