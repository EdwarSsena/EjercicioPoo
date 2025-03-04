
package ControlLuces;

import java.util.Random;

public class ControlLuces {
    
    private boolean lucesEncendidas = false; // Estado de las luces
    private boolean esDeNoche; // Condición para saber si es de noche o no
    
    // Constructor para inicializar el sistema con la condición de si es de noche o no
    public ControlLuces(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    // Método para simular el sistema de control de luces
    public void simularControlDeLuces() {
        Random random = new Random();
        
        while (true) {
            // Simular si hay movimiento en la habitación
            boolean hayMovimiento = random.nextBoolean(); // True o False
            
            // Mostrar el estado actual
            System.out.println("Es de noche: " + esDeNoche);
            System.out.println("Movimiento en la habitación: " + (hayMovimiento ? "Sí" : "No"));
            
            // Lógica para encender o apagar las luces
            if (esDeNoche && hayMovimiento) {
                lucesEncendidas = true; // Encender luces si es de noche y hay movimiento
            } else {
                lucesEncendidas = false; // Apagar luces si es de día o no hay movimiento
            }
            
            // Mostrar el estado de las luces
            System.out.println("Estado de las luces: " + (lucesEncendidas ? "Encendidas" : "Apagadas"));
            
            // Esperar 10 segundos antes de realizar otra simulación
            try {
                Thread.sleep(10000); // 10000 milisegundos = 10 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Método para cambiar la condición de si es de noche o no
    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }
}
