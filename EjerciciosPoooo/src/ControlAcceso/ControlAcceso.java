
package ControlAcceso;

import java.util.Random;
import java.util.Calendar;

public class ControlAcceso {

    // Método para simular el acceso a la tienda
    public void simularAcceso() {
        Random random = new Random();

        while (true) {
            // Simulamos si el cliente tiene membresía y si es empleado
            boolean tieneMembresia = random.nextBoolean(); // Aleatorio: true o false
            boolean esEmpleado = random.nextBoolean(); // Aleatorio: true o false

            // Simulamos la hora actual
            Calendar calendar = Calendar.getInstance();
            int hora = calendar.get(Calendar.HOUR_OF_DAY); // Hora actual en formato 24 horas

            // Determinar si está dentro del horario de atención
            boolean estaDentroDelHorario = (hora >= 9 && hora <= 18); // Horario de atención de 9:00 a 18:00

            // Mostrar información simulada
            System.out.println("Hora actual: " + hora + ":00");
            System.out.println("Cliente tiene membresía: " + (tieneMembresia ? "Sí" : "No"));
            System.out.println("Cliente es empleado: " + (esEmpleado ? "Sí" : "No"));
            System.out.println("Dentro del horario de atención: " + (estaDentroDelHorario ? "Sí" : "No"));

            // Validar el acceso
            if ((tieneMembresia && estaDentroDelHorario) || esEmpleado) {
                System.out.println("¡Acceso permitido!");
            } else {
                System.out.println("¡Acceso denegado!");
            }

            // Esperar 5 segundos antes de realizar otra simulación
            try {
                Thread.sleep(5000); // 5000 milisegundos = 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
