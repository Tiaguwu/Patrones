package Comportamiento.Iterator;

public class Main {
    // Metodo Cliente: SÓLO conoce la interfaz ITareaIterador (Desacoplamiento)
    public static void imprimirTareas(ITareaIterador iterador) {
        System.out.println("--- INICIANDO RECORRIDO DE TAREAS ---");
        while (iterador.haySiguiente()) {
            Tarea t = iterador.siguiente();
            System.out.println("  Tarea: " + t.getNombre() + " (" + t.getDescripcion() + ")");
        }
        System.out.println("--- RECORRIDO FINALIZADO ---\n");
    }

    public static void main(String[] args) {

        // Inicialización de las colecciones
        ITareaAgregado listaArray = new ColleccionTareasArray();
        ITareaAgregado listaMap = new ColeccionTareasMap();

        // --- 1. PROCESANDO ARRAY ---
        System.out.println("== PROCESANDO COLECCIÓN ARRAY (Estructura: Array[]) ==");
        // El cliente usa la función genérica con el iterador del Array
        imprimirTareas(listaArray.crearIterador());

        // --- 2. PROCESANDO MAP ---
        System.out.println("== PROCESANDO COLECCIÓN MAP (Estructura: HashMap) ==");
        // El cliente usa la misma función genérica con el iterador del Map
        imprimirTareas(listaMap.crearIterador());
    }
}
