
package SistemaSeguridad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        // Preguntar al usuario si desea ejecutar el programa
        System.out.print("¿Deseas ejecutar el sistema de seguridad? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        // Si el usuario responde "si", continuar con la ejecución
        if (respuesta.equals("si")) {
            // Preguntar si es de noche (true o false)
            System.out.print("¿Es de noche? (true/false): ");
            boolean esDeNoche = scanner.nextBoolean();
            scanner.nextLine();  // Limpiar el buffer

            // Crear una instancia del sistema de seguridad
            SistemaSeguridad sistema = new SistemaSeguridad(esDeNoche);

            boolean ejecutarPrograma = true;
            while (ejecutarPrograma) {
                // Menú de opciones
                System.out.println("\nMenú:");
                System.out.println("1. Simular sensores de movimiento");
                System.out.println("2. Activar alarma manualmente");
                System.out.println("3. Desactivar alarma manualmente");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        // Simular la detección de los sensores
                        sistema.simularSensores();
                        break;
                    case 2:
                        // Activar la alarma manualmente
                        sistema.activarAlarma();
                        break;
                    case 3:
                        // Desactivar la alarma manualmente
                        sistema.desactivarAlarma();
                        break;
                    case 4:
                        // Salir del programa
                        ejecutarPrograma = false;
                        System.out.println("¡Gracias por usar el sistema de seguridad!");
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                        break;
                }
            }
        } else {
            // Si el usuario no quiere ejecutar el programa, se termina
            System.out.println("¡Hasta la próxima!");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
