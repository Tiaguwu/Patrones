package Estructurales.Decorator;

public abstract class AditivoDecorador implements IBebida{
    //Decorador Abstracto
    private IBebida bebida;

    public AditivoDecorador (IBebida bebida){
        this.bebida = bebida;
    }

    @Override
    public double obtenerCosto(){
        return bebida.obtenerCosto();
    }

    @Override
    public String obtenerDescripcion(){
        return bebida.obtenerDescripcion();
    }
}
