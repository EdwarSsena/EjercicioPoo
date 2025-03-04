
package Claculadora;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Bienvenido al programa calculadora simple ");
        System.out.println("Desea ejecutar el progrma? (si/no)");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        
        if(respuesta.equals("si")){
                
        boolean seguirCalculando = true;
        
        while (seguirCalculando) {
            // Pedir los números al usuario
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();
            
            // Pedir la operación que desea realizar
            System.out.print("Introduce la operación (suma, resta, multiplicación, división): ");
            scanner.nextLine(); // Limpiar el buffer de la nueva línea
            String operacion = scanner.nextLine().toLowerCase();
            
            // Realizar la operación
            calculadora.realizarOperacion(num1, num2, operacion);
            
            // Preguntar si quiere continuar
            seguirCalculando = calculadora.continuarCalculando();
        }
        
        System.out.println("¡Gracias por usar la calculadora!");
        
        // Cerrar el scanner
        scanner.close();
    }
}
}