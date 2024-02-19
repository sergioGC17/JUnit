package org.example.E14.CalculadoraFinanciera;

import org.example.E14.CalculadoraFinanciera.CalculadoraFinanciera;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculadoraFinanciera {
    CalculadoraFinanciera calculadora = new CalculadoraFinanciera();

    @Test
    void testCalcularInteresCompuesto() {
        double resultado = calculadora.calcularInteresCompuesto(10000, 1, 2, 3);
        assertEquals(113906.25, resultado);
    }

    @Test
    void testCalcularVPN() {
        double[] flujosCaja = {100, 200, 300};
        double resultado = calculadora.calcularVPN(1, flujosCaja);
        assertEquals(275.0, resultado);
    }
}
