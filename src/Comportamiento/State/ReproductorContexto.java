package Comportamiento.State;

public class ReproductorContexto {
    //El contexto
    private IReproductorEstado estadoActual;
    public static final IReproductorEstado ESTADO_REPRODUCIENDO = new EstadoReproduciendo();
    public static final IReproductorEstado ESTADO_PAUSADO = new EstadoPausado();
    public static final IReproductorEstado ESTADO_DETENIDO = new EstadoDetenido();


    public ReproductorContexto(){
        this.estadoActual = ESTADO_DETENIDO;
    }
    public void setEstadoActual(IReproductorEstado nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public IReproductorEstado getEstadoActual() {
        return estadoActual;
    }

    public String presionarPlay(){
        return estadoActual.presionarPlay(this);
    }

    public String presionarPausa(){
        return estadoActual.presionarPausa(this);
    }

    public String presionarStop(){
        return estadoActual.presionarStop(this);
    }


}
