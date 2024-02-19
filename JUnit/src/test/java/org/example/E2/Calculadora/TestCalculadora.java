package org.example.E2.Calculadora;

import org.testng.annotations.Test;

import static org.example.E2.Calculadora.Calculadora.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculadora {
    @Test
    public void testSumar() {
        assertEquals(4, sumar(2, 2));
    }

    @Test
    public void testRestar() {
        assertEquals(0, restar(2, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(4, multiplicar(2, 2));
    }

    @Test
    public void testDividir() {
        assertEquals(2, dividir(4, 2));
    }

}
