package Estructurales.Bridge;

public class PlataformaiOS implements IPlataforma{
    //Implementacion Concreta
    @Override
    public String enviarMensaje(String mensaje) {
        return "Enviando mensaje a iOS" + mensaje;
    }
}
