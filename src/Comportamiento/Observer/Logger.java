package Comportamiento.Observer;

public class Logger implements IObservador{
    @Override
    public void actualizar(String noticia) {
        System.out.println("-> [Logger del Sistema]: Registrando evento de noticia: " + noticia);
    }
}
