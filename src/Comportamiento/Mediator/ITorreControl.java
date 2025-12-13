package Comportamiento.Mediator;

public interface ITorreControl {
    //Mediador
    void registrar(Avion avion);

    void notificar(Avion emisor, String mensaje);
}
