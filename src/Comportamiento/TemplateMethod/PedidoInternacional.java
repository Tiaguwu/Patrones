package Comportamiento.TemplateMethod;

public class PedidoInternacional extends ProcesadorPedido{

    @Override
    protected double calcularCostoImpuesto() {
        return 0.25 * 100.0;
    }

    @Override
    protected double calcularCostoEnvio() {
        return 20.0;
    }

    @Override
    protected double aplicarDescuenta() {
        return 0.15 * 100;
    }
}
