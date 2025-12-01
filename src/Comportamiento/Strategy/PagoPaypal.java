package Comportamiento.Strategy;

public class PagoPaypal implements IEstrategiaPago{
    @Override
    public String procesadorPago(double monto) {
        return "Pago con PayPal de $" + monto + "  verificado. Envío de recibo al email.";
    }
}
