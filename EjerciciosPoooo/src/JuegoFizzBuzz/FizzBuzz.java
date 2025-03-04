
package JuegoFizzBuzz;


public class FizzBuzz {
    

//public class FizzBuzz {
    public void ejecutarJuego() {
        // Recorre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verifica si el número es divisible por 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            // Si solo es divisible por 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            // Si solo es divisible por 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            // Si no es divisible ni por 3 ni por 5, se imprime el número
            else {
                System.out.println(i);
            }
        }
    }
}
