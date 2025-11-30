package Estructurales.Decorator;

public class CafeSimple implements IBebida{
    //Componente Concreto(Objeto base)
    @Override
    public double obtenerCosto() {
        return 2.0;
    }

    @Override
    public String obtenerDescripcion() {
        return "Cafe Simple";
    }
}
