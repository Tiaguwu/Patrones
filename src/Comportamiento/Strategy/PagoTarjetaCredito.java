package Comportamiento.Strategy;

public class PagoTarjetaCredito implements IEstrategiaPago{
    @Override
    public String procesadorPago(double monto) {
        return "Pago con Tarjeta de Crédito de $" + monto + "  procesado con éxito. Comisión del 2% aplicada.";
    }
}
