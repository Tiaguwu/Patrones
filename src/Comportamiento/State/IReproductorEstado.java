package Comportamiento.State;

public interface IReproductorEstado {
    //El estado
    String presionarPlay(ReproductorContexto reproductor);
    String presionarPausa(ReproductorContexto reproductor);
    String presionarStop(ReproductorContexto reproductor);
}
