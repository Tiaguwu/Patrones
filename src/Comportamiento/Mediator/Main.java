package Comportamiento.Mediator;

public class Main {
    public static void main(String[] args) {

        // 1. Crear el Mediador
        ITorreControl torre = new ControlTorre();

        // 2. Crear los Componentes (Aviones) y registrarlos
        Avion a1 = new Avion(torre, "Vuelo 101");
        Avion a2 = new Avion(torre, "Vuelo 202");
        Avion a3 = new Avion(torre, "Vuelo 303");

        torre.registrar(a1);
        torre.registrar(a2);
        torre.registrar(a3);

        System.out.println("\n==============================================");

        // --- PRUEBA 1: Vuelo 101 notifica un cambio (Baja Altitud) ---
        // La solicitud pasa a la Torre, que notifica a A2 y A3.
        a1.cambiarAltitud(9000);

        System.out.println("\n==============================================");

        // --- PRUEBA 2: Vuelo 202 notifica un cambio (Alta Altitud) ---
        // La Torre aplica una regla de negocio y notifica a A1 y A3.
        a2.cambiarAltitud(35000);

        System.out.println("\n==============================================");

        // --- PRUEBA 3: Vuelo 303 solicita aterrizar ---
        a3.aterrizar();
    }
}
