package org.example.E13.GestorDeTareas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


public class TestGestorDeTareas {
    private GestorDeTareas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDeTareas();
    }

    @Nested
    class TestAgregarTareas {
        @Test
        void testAgregarTarea1() {
            gestor.agregarTarea("1", "Tarea 1");
        }

        @Test
        void testAgregarTarea2() {
            gestor.agregarTarea("2", "Tarea 2");
        }
    }

    @Nested
    class TestEliminarTareas {

        @Test
        void testEliminarTarea1() {
            gestor.agregarTarea("1", "Tarea 1");
            assertTrue(gestor.eliminarTarea("1"));
        }

        @Test
        void testEliminarTarea2() {
            assertFalse(gestor.eliminarTarea("2"));
        }
    }

    @Nested
    class TestBuscarTarea {
        @Test
        void testBuscarTarea1() {
            gestor.agregarTarea("1", "Tarea 1");
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Tarea 1", descripcion.get());
        }

        @Test
        void testBuscarTarea2() {
            Optional<String> descripcion = gestor.buscarTareaPorId("2");
            assertFalse(descripcion.isPresent());
        }
    }
}
