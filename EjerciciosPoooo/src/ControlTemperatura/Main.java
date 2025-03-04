
package ControlTemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        // Preguntar al usuario si desea ejecutar el programa
        System.out.print("¿Quieres ejecutar el control de temperatura en el invernadero? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        
        // Si el usuario responde "si", ejecutar el control de temperatura
        if (respuesta.equals("si")) {
            ControlTemperatura control = new ControlTemperatura();
            
            // Iniciar el control de temperatura
            control.controlarTemperatura();
        } else {
            // Si el usuario responde "no", salir del programa
            System.out.println("¡Hasta la próxima!");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
