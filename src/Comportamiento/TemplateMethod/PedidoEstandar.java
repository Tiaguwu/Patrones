package Comportamiento.TemplateMethod;

public class PedidoEstandar extends ProcesadorPedido{
    //Clase concreta(variacion)
    @Override
    protected double calcularCostoImpuesto() {
        return 0.10 * 100.0;
    }

    @Override
    protected double calcularCostoEnvio() {
        return 5.0;
    }

}
