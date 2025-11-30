package Comportamiento.State;

public class EstadoReproduciendo implements IReproductorEstado {
    //Estado concreto
    @Override
    public String presionarPlay(ReproductorContexto reproductor) {
        return "Ya se esta reproduciendo.";
    }

    @Override
    public String presionarPausa(ReproductorContexto reproductor) {
        //Reproduciendo --> Pausado
        reproductor.setEstadoActual(ReproductorContexto.ESTADO_PAUSADO);
        return "Musica en pausa.";
    }

    @Override
    public String presionarStop(ReproductorContexto reproductor) {
        //Reproduciendo --> Detenido
        reproductor.setEstadoActual(ReproductorContexto.ESTADO_DETENIDO);
        return "Musica detenida.";
    }
}
