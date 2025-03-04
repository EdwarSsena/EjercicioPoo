
package ControlAireAcondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa ");
        // Preguntar al usuario si desea ejecutar el sistema
        System.out.print("¿Deseas ejecutar el control de aire acondicionado? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        // Si el usuario responde "si", continuar con la ejecución
        if (respuesta.equals("si")) {
            // Crear una instancia del sistema de control de aire acondicionado
            ControlAireAcondicionado controlAire = new ControlAireAcondicionado();

            // Iniciar la simulación del control de aire acondicionado
            controlAire.simularControlAire();
        } else {
            // Si el usuario no quiere ejecutar el sistema, se termina
            System.out.println("¡Hasta la próxima!");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
