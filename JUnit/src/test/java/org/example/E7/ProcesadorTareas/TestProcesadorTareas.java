package org.example.E7.ProcesadorTareas;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.example.E7.ProcesadorTareas.ProcesadorTareas.ejecutarTareaLarga;
import static org.junit.jupiter.api.Assertions.*;

public class TestProcesadorTareas {
    @Test
    public void testEjecutarTarea() {
        assertTimeout(ofMillis(10), () -> {ejecutarTareaLarga(90);} );
    }
}
