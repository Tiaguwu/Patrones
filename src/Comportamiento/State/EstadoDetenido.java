package Comportamiento.State;

public class EstadoDetenido implements IReproductorEstado{
    //Estado concreto

    @Override
    public String presionarPlay(ReproductorContexto reproductor) {
        //Detenido --> Reproduciendo
        reproductor.setEstadoActual(ReproductorContexto.ESTADO_REPRODUCIENDO);
        return "Iniciando nueva cancion.";
    }

    @Override
    public String presionarPausa(ReproductorContexto reproductor) {
        return "No se puede pasar si esta detenido.";
    }

    @Override
    public String presionarStop(ReproductorContexto reproductor) {
        return "Ya esta detenido.";
    }
}
