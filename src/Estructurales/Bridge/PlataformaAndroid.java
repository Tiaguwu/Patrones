package Estructurales.Bridge;

public class PlataformaAndroid implements IPlataforma{
    //Implementacion Concreta
    @Override
    public String enviarMensaje(String mensaje) {
        return "Enviando mensaje a Android: " + mensaje;
    }
}
