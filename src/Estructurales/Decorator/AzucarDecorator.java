package Estructurales.Decorator;

public class AzucarDecorator extends AditivoDecorador{

    public AzucarDecorator(IBebida bebida) {
        super(bebida);
    }

    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() + 0.25;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + ", con Azúcar";
    }
}
