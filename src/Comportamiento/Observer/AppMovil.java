package Comportamiento.Observer;

public class AppMovil implements IObservador{
    //Observador concreto

    private final String usuario;

    public AppMovil(String usuario){
        this.usuario = usuario;
    }

    @Override
    public void actualizar(String noticia) {
        System.out.println("-> [App Móvil de " + usuario + "]: ¡NOTIFICACIÓN PUSH! Nueva noticia: " + noticia);
    }
}
