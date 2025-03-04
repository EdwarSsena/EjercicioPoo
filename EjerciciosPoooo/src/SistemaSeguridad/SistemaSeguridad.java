
package SistemaSeguridad;

import java.util.Random;

public class SistemaSeguridad {

    private boolean alarmaActivada = false;
    private boolean esDeNoche;

    // Constructor para inicializar si es de noche o no
    public SistemaSeguridad(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    // Método para simular la detección de movimiento en los sensores
    public void simularSensores() {
        Random random = new Random();
        
        // Simulamos tres sensores de movimiento, donde un valor de 1 significa detección de movimiento
        int sensor1 = random.nextInt(2); // 0 o 1 (no detecta o detecta movimiento)
        int sensor2 = random.nextInt(2);
        int sensor3 = random.nextInt(2);

        // Mostramos los valores de los sensores
        System.out.println("Sensor 1: " + (sensor1 == 1 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 2: " + (sensor2 == 1 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 3: " + (sensor3 == 1 ? "Movimiento detectado" : "Sin movimiento"));

        // Verificar si al menos dos sensores detectaron movimiento
        int movimientoDetectado = sensor1 + sensor2 + sensor3; // Cuenta cuántos sensores detectaron movimiento

        // Si es de noche y al menos dos sensores detectaron movimiento, se activa la alarma
        if (esDeNoche && movimientoDetectado >= 2) {
            alarmaActivada = true;
        } else {
            alarmaActivada = false;
        }

        // Mostrar el estado de la alarma
        System.out.println("Alarma: " + (alarmaActivada ? "Activada" : "Desactivada"));
    }

    // Método para activar la alarma manualmente
    public void activarAlarma() {
        alarmaActivada = true;
        System.out.println("Alarma activada manualmente.");
    }

    // Método para desactivar la alarma manualmente
    public void desactivarAlarma() {
        alarmaActivada = false;
        System.out.println("Alarma desactivada manualmente.");
    }

    // Método para mostrar el estado de la alarma
    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }
}
