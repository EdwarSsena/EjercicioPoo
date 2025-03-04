
package ControlTemperatura;

import java.util.Random;

public class ControlTemperatura {

    // Método para simular la lectura del sensor de temperatura
    public void controlarTemperatura() {
        Random random = new Random();
        
        // Simulamos la lectura del sensor cada 5 segundos
        while (true) {
            // Simulamos la temperatura, un valor aleatorio entre 0 y 40 grados
            int temperatura = random.nextInt(41); // Genera números entre 0 y 40
            
            // Mostrar la temperatura actual
            System.out.println("Temperatura actual: " + temperatura + "°C");

            // Controlar el estado del sistema según la temperatura
            if (temperatura < 10) {
                System.out.println("Estado del sistema: Calefactor activado");
            } else if (temperatura >= 10 && temperatura <= 25) {
                System.out.println("Estado del sistema: Inactivo");
            } else {
                System.out.println("Estado del sistema: Ventilador activado");
            }
            
            // Esperar 5 segundos antes de realizar otra lectura
            try {
                Thread.sleep(5000); // 5000 milisegundos = 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
