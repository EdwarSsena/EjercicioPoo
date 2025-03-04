
package ControlAireAcondicionado;

import java.util.Random;

public class ControlAireAcondicionado {

    private boolean aireEncendido = false; // Estado del aire acondicionado

    // Método para simular la lectura de los sensores
    public void simularControlAire() {
        Random random = new Random();

        // Bucle infinito para simular el control del aire acondicionado
        while (true) {
            // Simulamos la lectura de la temperatura y la humedad
            double temperatura = 20 + (random.nextDouble() * 20);  // Temperatura entre 20 y 40°C
            double humedad = random.nextDouble() * 100; // Humedad entre 0 y 100%

            // Mostrar los valores de temperatura y humedad
            System.out.println("Temperatura: " + String.format("%.2f", temperatura) + "°C");
            System.out.println("Humedad: " + String.format("%.2f", humedad) + "%");

            // Control del aire acondicionado
            if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
                aireEncendido = true; // Encender el aire acondicionado
            } else {
                aireEncendido = false; // Apagar el aire acondicionado
            }

            // Mostrar el estado del aire acondicionado
            System.out.println("Aire acondicionado: " + (aireEncendido ? "Encendido" : "Apagado"));

            // Esperar 5 segundos antes de realizar otra simulación
            try {
                Thread.sleep(5000); // 5000 milisegundos = 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
