package org.example.E3.Validador;

/**
 * Excepción personalizada para indicar que un texto no cumple con los criterios de validación.
 */
public class TextoInvalidoException extends Exception {
    public TextoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
