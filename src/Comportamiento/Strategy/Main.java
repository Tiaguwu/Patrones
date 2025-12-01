package Comportamiento.Strategy;

public class Main {
    public static void main(String[] args) {
        double monto = 250.75;
        CarritoDeCompra carrito = new CarritoDeCompra(monto);

        System.out.println("--- PRIMERA VUELTA: PAGO CON PAYPAL ---");
    // Cliente elige Estrategia A
        carrito.setMetodoDePago(new PagoPaypal());
        System.out.println(carrito.realizarPago());

        System.out.println("\n--- SEGUNDA VUELTA: PAGO CON TARJETA ---");
    // Cliente cambia la Estrategia en tiempo de ejecución
        carrito.setMetodoDePago(new PagoTarjetaCredito());
        System.out.println(carrito.realizarPago());

        System.out.println("\n--- TERCERA VUELTA: PAGO CON BITCOIN ---");
    // Cliente cambia a Estrategia C
        carrito.setMetodoDePago(new PagoBitcoin());
        System.out.println(carrito.realizarPago());
    }
}
