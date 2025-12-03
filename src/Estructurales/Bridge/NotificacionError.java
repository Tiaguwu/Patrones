package Estructurales.Bridge;

public class NotificacionError extends Mensaje{

    public NotificacionError(IPlataforma plataforma){
        super(plataforma);
    }

    @Override
    public String enviar(String cuerpoMensaje) {
        String mensajeCompleto = "[ERROR] " + cuerpoMensaje;
        return mensajeCompleto;
    }
}
