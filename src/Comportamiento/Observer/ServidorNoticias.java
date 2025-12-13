package Comportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class ServidorNoticias implements ISujetoNoticias{
    //Sujeto concreto

    private final List<IObservador> observadores = new ArrayList<>();

    private String ultimaNoticia;

    @Override
    public void adjuntar(IObservador observador) {
        observadores.add(observador);
        System.out.println("[Servidor]: Nuevo suscriptor adjunto.");
    }

    @Override
    public void desajuntar(IObservador observador) {
        observadores.remove(observador);
        System.out.println("[Servidor]: Suscriptor desadjunto.");
    }

    public void publicarNoticia(String noticia){
        System.out.println("\n*** SERVIDOR: Publicando nueva noticia: '" + noticia + "' ***");
        this.ultimaNoticia = noticia;

        notificar();
    }

    @Override
    public void notificar() {
        for (IObservador observador : observadores){
            observador.actualizar(this.ultimaNoticia);
        }
    }
}
