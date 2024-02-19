package org.example.E7.ProcesadorTareas;

public class ProcesadorTareas {

    /**
     * Ejecuta una tarea que simula una operación de larga duración.
     * @param tiempoEspera Tiempo en milisegundos que la tarea deberá dormir, simulando una ejecución larga.
     * @throws InterruptedException Si el hilo es interrumpido mientras duerme.
     */
    public static void ejecutarTareaLarga(int tiempoEspera) throws InterruptedException {
        // Simulación de una tarea de larga duración
        Thread.sleep(tiempoEspera);
    }
}
