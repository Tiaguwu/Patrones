package Estructurales.Bridge;

public class Main {
    public static void main(String[] args) {
        // --- 1. Definir Implementaciones de bajo nivel ---
        IPlataforma android = new PlataformaAndroid();
        IPlataforma ios = new PlataformaiOS();

        // --- 2. Abstracción Refinada (Alerta) con Implementación Android ---
        // Se conecta la Abstracción con el Implementor en tiempo de ejecución
        Mensaje alertaAndroid = new NotificacionAlerta(android);
        System.out.println("Caso 1: " + alertaAndroid.enviar("¡Oferta de 50% disponible!"));

        // --- 3. Abstracción Refinada (Error) con Implementación iOS ---
        Mensaje erroriOS = new NotificacionError(ios);
        System.out.println("Caso 2: " + erroriOS.enviar("Error de conexión con el servidor."));

        // --- 4. Abstracción Refinada (Error) con Implementación Android (intercambiabilidad) ---
        Mensaje errorAndroid = new NotificacionError(android);
        System.out.println("Caso 3: " + errorAndroid.enviar("Error crítico de batería."));
    }
}
