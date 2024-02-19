package org.example.E5.GestorDeConexion;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGestorDeConexion {
    @BeforeAll
    public static void abrirConexion() {
        GestorDeConexion.abrirConexion();
    }

    @AfterAll
    public static void cerrarConexion() {
        GestorDeConexion.cerrarConexion();
    }

    @Test
    public void testConexion() {
        assertTrue(true);
    }
}
