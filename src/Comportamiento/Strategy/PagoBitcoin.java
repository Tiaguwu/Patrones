package Comportamiento.Strategy;

public class PagoBitcoin implements IEstrategiaPago{
    @Override
    public String procesadorPago(double monto) {
        return "Pago con Bitcoin de $" + monto + " iniciado. Esperando 3 confirmaciones de red.";
    }
}
