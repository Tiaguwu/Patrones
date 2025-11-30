package Comportamiento.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        double costoBase = 100.0;

        // 1. Procesar Pedido Estandar
        ProcesadorPedido estandar = new PedidoEstandar();
        System.out.println("--- PROCESANDO PEDIDO ESTANDAR ---");
        // El cliente solo llama al metodo plantilla
        estandar.procesarPedido(costoBase);

        // 2. Procesar Pedido Internacional
        ProcesadorPedido internacional = new PedidoInternacional();
        System.out.println("\n--- PROCESANDO PEDIDO INTERNACIONAL ---");
        // El cliente solo llama al metodo plantilla
        internacional.procesarPedido(costoBase);
    }
}
