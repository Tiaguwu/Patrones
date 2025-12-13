package Comportamiento.Observer;

public interface ISujetoNoticias {
    //El sujeto(observable)

    void adjuntar(IObservador observador);
    void desajuntar(IObservador observador);

    void notificar();
}
