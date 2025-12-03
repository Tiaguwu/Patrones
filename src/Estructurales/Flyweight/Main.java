package Estructurales.Flyweight;

public class Main {
    public static void main(String[] args) {
        FabricaTerreno fabrica = new FabricaTerreno();

        System.out.println("--- SIMULACIÓN DE MUNDO DE JUEGO (10K OBJETOS) ---");

        // 1. Creación de dos Árboles tipo "Roble" en diferentes posiciones
        IElementoTerreno robleCompartido = fabrica.obtenerElemento("Roble");
        ElementoInstanciado arbol1 = new ElementoInstanciado(10, 20, robleCompartido);
        ElementoInstanciado arbol2 = new ElementoInstanciado(15, 25, fabrica.obtenerElemento("Roble"));

        // 2. Creación de un Árbol tipo "Pino" (debe crear un nuevo Flyweight)
        IElementoTerreno pinoCompartido = fabrica.obtenerElemento("Pino");
        ElementoInstanciado arbol3 = new ElementoInstanciado(5, 5, pinoCompartido);

        // 3. Creación de otro "Roble" (debe reutilizar la instancia de robleCompartido)
        ElementoInstanciado arbol4 = new ElementoInstanciado(30, 40, fabrica.obtenerElemento("Roble"));

        System.out.println("\n--- RENDERIZADO ---");
        arbol1.renderizar();
        arbol2.renderizar();
        arbol3.renderizar();
        arbol4.renderizar();

        System.out.println("\n--- VERIFICACIÓN DE EFICIENCIA ---");
        // Verifica si arbol1 y arbol2 están compartiendo la misma instancia (debe ser TRUE)
        System.out.println("¿Arbol 1 y Arbol 2 comparten el mismo objeto Flyweight? " +
                (arbol1.getElemento().getHashCodeIntrinseco() == arbol2.getElemento().getHashCodeIntrinseco()));

        // Verifica si arbol 2 y arbol 3 tienen objetos distintos (debe ser FALSE)
        System.out.println("¿Arbol 2 y Arbol 3 comparten el mismo objeto Flyweight? " +
                (arbol2.getElemento().getHashCodeIntrinseco() == arbol3.getElemento().getHashCodeIntrinseco()));

    }
}
