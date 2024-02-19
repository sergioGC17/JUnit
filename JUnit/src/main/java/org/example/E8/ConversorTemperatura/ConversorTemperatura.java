package org.example.E8.ConversorTemperatura;

public class ConversorTemperatura {

    /**
     * Convierte una temperatura de Celsius a Fahrenheit.
     * @param celsius Temperatura en grados Celsius.
     * @return Temperatura convertida a Fahrenheit.
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte una temperatura de Fahrenheit a Celsius.
     * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Temperatura convertida a Celsius.
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}