package org.example.E16.GeneradorNumeros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestGeneradorNumeros {
    GeneradorNumeros generadorNumeros;

    @BeforeEach
    public void setUp() {
        generadorNumeros = new GeneradorNumeros();
    }
    @Test
    public void testAdmin() {
        int numero = generadorNumeros.generarNumeroAleatorioEnRango(0, 10);
        if(numero % 2 == 0){
            assertTrue(generadorNumeros.esPar(numero));
        }else{
            assertFalse(generadorNumeros.esPar(numero));
        }
    }


}
