package org.example.E6.CalculadoraAvanzada;

public class CalculadoraAvanzada {

    /**
     * Calcula la raíz cuadrada de un número.
     * @param numero El número para calcular la raíz cuadrada.
     * @return La raíz cuadrada del número.
     */
    public static double raizCuadrada(double numero) {
        // Implementación pendiente o en revisión
        return Math.sqrt(numero);
    }

    /**
     * Calcula el logaritmo natural de un número.
     * @param numero El número para calcular el logaritmo.
     * @return El logaritmo natural del número.
     */
    public static double logaritmoNatural(double numero) {
        // Implementación pendiente o en revisión
        return Math.log(numero);
    }

    /**
     * Calcula el factorial de un número.
     * @param numero El número para calcular el factorial.
     * @return El factorial del número.
     */
    public static long factorial(int numero) {
        // Implementación correcta requerida
        if (numero < 0) {
            throw new IllegalArgumentException("Número debe ser mayor o igual a 0.");
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}