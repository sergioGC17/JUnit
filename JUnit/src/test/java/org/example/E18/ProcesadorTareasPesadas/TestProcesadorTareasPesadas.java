package org.example.E18.ProcesadorTareasPesadas;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TestProcesadorTareasPesadas {
    @Test
    public void testTiempoDeOperacion() {
        ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();
        Duration tiempo = Duration.ofSeconds(3);

        Instant inicio = Instant.now();
        assertTimeout(tiempo, () -> procesador.realizarOperacionIntensiva());
        Instant fin = Instant.now();

        Duration duracion = Duration.between(inicio, fin);
        System.out.println("Tiempo tomado para la ejecución de " +duracion.toMillis() + " milisegundos");
    }
}
