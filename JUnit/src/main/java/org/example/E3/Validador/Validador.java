package org.example.E3.Validador;

public class Validador {
    /**
     * Valida si el texto proporcionado es nulo o está vacío.
     *
     * @param texto El texto a validar.
     * @throws TextoInvalidoException Si el texto es nulo o vacío.
     */
    public static void validarTexto(String texto) throws TextoInvalidoException {
        if (texto == null || texto.isEmpty()) {
            throw new TextoInvalidoException("El texto no puede ser nulo ni vacío");
        }
        // Lógica adicional de validación si es necesaria
    }
}

