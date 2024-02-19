package org.example.E17.ClienteServicioWeb;

import org.example.E15.ControladorAcceso.ClienteServicioWeb.ClienteServicioWeb;
import org.example.E15.ControladorAcceso.ClienteServicioWeb.ServicioWeb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestClienteServicioWeb {

    @Test
    public void testObtenerInformacionUsuario() {
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);
        ClienteServicioWeb clienteServicioWeb = new ClienteServicioWeb(servicioWebMock);
        String id = "1";

        when(servicioWebMock.obtenerDatosUsuario(id)).thenReturn("Moco");

        String resultado = clienteServicioWeb.obtenerInformacionUsuario(id);
        verify(servicioWebMock).obtenerDatosUsuario(id);

        assertEquals("Moco", resultado);
    }
}
