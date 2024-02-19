package org.example.E15.ControladorAcceso.ClienteServicioWeb;

public class ClienteServicioWeb {

    private final ServicioWeb servicioWeb;

    public ClienteServicioWeb(ServicioWeb servicioWeb) {
        this.servicioWeb = servicioWeb;
    }

    /**
     * Obtiene información de usuario desde un servicio web.
     *
     * @param userId Identificador del usuario.
     * @return Información del usuario como una cadena de texto.
     */
    public String obtenerInformacionUsuario(String userId) {
        return servicioWeb.obtenerDatosUsuario(userId);
    }
}

