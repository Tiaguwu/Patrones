package Comportamiento.State;

public class EstadoPausado implements IReproductorEstado{

    @Override
    public String presionarPlay(ReproductorContexto reproductor) {
        reproductor.setEstadoActual(ReproductorContexto.ESTADO_REPRODUCIENDO);
        return "Reanudando reproduccion.";
    }

    @Override
    public String presionarPausa(ReproductorContexto reproductor) {
        return "Ya esta pausado.";
    }

    @Override
    public String presionarStop(ReproductorContexto reproductor) {
        reproductor.setEstadoActual(ReproductorContexto.ESTADO_DETENIDO);
        return "Musica detenida y restablecida.";
    }
}
