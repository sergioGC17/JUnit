package org.example.E3.Validador;

import org.testng.annotations.Test;

import static org.example.E3.Validador.Validador.validarTexto;

public class TestValidador {
    @Test
    public static void testValidadorTexto() throws TextoInvalidoException {
        validarTexto("texto");
    }

    @Test
    public static void testValidadorNull() throws TextoInvalidoException {
        validarTexto(null);
    }

    @Test
    public static void testValidadorVacio() throws TextoInvalidoException {
        validarTexto("");
    }
}