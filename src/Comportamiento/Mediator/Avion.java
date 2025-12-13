package Comportamiento.Mediator;

public class Avion {
    //El componente

    private final ITorreControl torre;
    private final String nombre;
    private int altitud;

    public Avion(ITorreControl torre, String nombre){
        this.torre = torre;
        this.nombre = nombre;
        this.altitud = 0;
    }

    public int getAltitud() {
        return altitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void cambiarAltitud(int nuevaAltitud){
        System.out.println("-> " + nombre + " solicita cambiar altitud de " + altitud + " a " + nuevaAltitud + ".");
        this.altitud = nuevaAltitud;
        torre.notificar(this, "Altitud actualizada a " + nuevaAltitud);
    }

    public void aterrizar(){
        System.out.println("-> " + nombre + " solicita aterrizar.");
        torre.notificar(this, "Solicitando pista y autorización para aterrizar.");
    }

    public void recibirMensaje(String mensaje){
        System.out.println("[RECEPTOR " + nombre + "]: Mensaje de la Torre: " + mensaje);
    }
}
