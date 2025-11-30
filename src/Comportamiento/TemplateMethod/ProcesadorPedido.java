package Comportamiento.TemplateMethod;

public abstract class ProcesadorPedido {
    //Clase abstracta(el algoritmo)

    protected abstract double calcularCostoImpuesto();

    protected abstract double calcularCostoEnvio();

    protected void verificarStock(){
        System.out.println("  1. Verificando stock para todos los ítems... OK.");
    }

    protected void notificarCliente() {
        System.out.println("  5. Notificando al cliente que el pedido está listo para enviar.");
    }

    protected double aplicarDescuenta(){
        return 0.0;
    }

    public final void procesarPedido(double costoBase){

        verificarStock();

        double impuesto = calcularCostoImpuesto();
        double envio = calcularCostoEnvio();

        double descuento = aplicarDescuenta();

        double costoTotal = costoBase + impuesto + envio - descuento;

        System.out.printf("  2. Impuestos calculados: $%.2f%n", impuesto);
        System.out.printf("  3. Costo de envío calculado: $%.2f%n", envio);
        System.out.printf("  4. Descuento aplicado (Hook): $%.2f%n", descuento);

        System.out.println("-------------------------------------------");
        System.out.printf("Costo Base del Producto: $%.2f%n", costoBase);
        System.out.printf("Costo TOTAL del Pedido: $%.2f%n", costoTotal);
        System.out.println("-------------------------------------------");

        notificarCliente();
    }
}
