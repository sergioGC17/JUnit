package org.example.E6.CalculadoraAvanzada;

import org.junit.jupiter.api.Test;

import static org.example.E6.CalculadoraAvanzada.CalculadoraAvanzada.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculadoraAvanzada {
    @Test
    void testRaizCuadrada() {
        assertEquals(3.0, raizCuadrada(9.0));
    }

    @Test
    void testLogaritmoNatural() {
        assertEquals(0.6931471805599453, logaritmoNatural(2));
    }

    @Test
    void testFactorial() {
        assertEquals(120, factorial(5));
    }
}
