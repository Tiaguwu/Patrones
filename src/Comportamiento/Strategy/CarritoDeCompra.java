package Comportamiento.Strategy;

public class CarritoDeCompra {
    //Contexto
    private IEstrategiaPago metodoDePago;
    private double montoTotal;

    public CarritoDeCompra(double montoTotal){
        this.montoTotal= montoTotal;
        this.metodoDePago = null;
    }

    public void setMetodoDePago(IEstrategiaPago nuevaEstrategia) {
        this.metodoDePago = nuevaEstrategia;
    }

    public String realizarPago(){
        if (metodoDePago == null){
            return "ERROR: Por favor, seleccione un metodo de pago.";
        }
        return metodoDePago.procesadorPago(this.montoTotal);
    }

}
