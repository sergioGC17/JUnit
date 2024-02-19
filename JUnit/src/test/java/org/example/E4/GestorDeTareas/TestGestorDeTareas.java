package org.example.E4.GestorDeTareas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGestorDeTareas {

    private GestorDeTareas gestor;

    @BeforeEach
    public void inicializarTareas() {
        gestor = new GestorDeTareas();
        gestor.agregarTarea("Taera 1");
        gestor.agregarTarea("Taera 2");
        gestor.agregarTarea("Taera 3");
        gestor.agregarTarea("Taera 4");
    }

    @AfterEach
    public void limpiarTareas() {
        gestor.limpiarTareas();
    }

    @Test
    public void testAgregarTareas() {
        gestor.agregarTarea("Taera 5");
        assertEquals(5, gestor.obtenerTareas().size());
    }

    @Test
    public void testEliminarTareas() {
        gestor.eliminarTarea("Taera 4");
        assertEquals(3, gestor.obtenerTareas().size());
    }

    @Test
    public void testLimpiarTareas() {
        gestor.limpiarTareas();
        assertTrue(gestor.obtenerTareas().isEmpty());
    }
}
