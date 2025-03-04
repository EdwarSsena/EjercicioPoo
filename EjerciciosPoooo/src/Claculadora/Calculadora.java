
package Claculadora;

import java.util.Scanner;

public class Calculadora {
    
    // Método para realizar el cálculo basado en la operación
    public void realizarOperacion(double num1, double num2, String operacion) {
        double resultado;
        
        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case "resta":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case "multiplicación":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case "división":
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre 0.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
                
            default:
                System.out.println("Operación no válida.");
                break;
        }
    }
    
    // Método para continuar o salir
    public boolean continuarCalculando() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Quieres realizar otro cálculo? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        
        return respuesta.equals("si");
    }
}
