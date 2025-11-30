package Estructurales.Decorator;

public class LecheDecorador extends AditivoDecorador{
    //Decorador concreto

    public LecheDecorador(IBebida bebida) {
        super(bebida);
    }
    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() + 0.5;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + ", con Leche";
    }
}
