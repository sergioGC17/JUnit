package org.example.E8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.example.E8.ConversorTemperatura.ConversorTemperatura.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversorTemperatura {
    @ParameterizedTest
    @ValueSource(doubles = 0)
    public void testCelsius() {
        assertEquals(32.0, celsiusAFahrenheit(0.0));
    }

    @ParameterizedTest
    @ValueSource(doubles = 0)
    public void testFahrenheit() {
        assertEquals(0.0, fahrenheitACelsius(32.0));
    }
}

