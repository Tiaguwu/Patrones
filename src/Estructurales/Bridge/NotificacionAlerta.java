package Estructurales.Bridge;

public class NotificacionAlerta extends Mensaje{

    public NotificacionAlerta(IPlataforma plataforma){
        super(plataforma);
    }

    @Override
    public String enviar(String cuerpoMensaje) {
        String mensajeCompleto = "[ALERTA] " + cuerpoMensaje;
        return mensajeCompleto;
    }
}
