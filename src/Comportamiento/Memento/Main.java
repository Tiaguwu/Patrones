package Comportamiento.Memento;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        // ESTADO INICIAL
        editor.agregarTexto("Patron Memento: ");
        historial.guardar(editor.guardar());

        System.out.println("\n----------------------------------------");

        // CAMBIO INTERMEDIO
        editor.agregarTexto("Guarda el estado");
        historial.guardar(editor.guardar());

        System.out.println("\n----------------------------------------");

        //CAMBIO ACTUAL (sin guardar)
        editor.agregarTexto("y permite el UNDO.");
        editor.mostrarEstado();

        System.out.println("\n--- INICIANDO DESHACER (UNDO) ---");

        //RESTAURAR A ESTADO B
        IMemento mementoB = historial.deshacer();
        if (mementoB != null){
            editor.deshacer(mementoB);
        }

        System.out.println("\n----------------------------------------");

        // 5. RESTAURAR A ESTADO A (UNDO 2)
        IMemento mementoA = historial.deshacer();
        if (mementoA != null) {
            editor.deshacer(mementoA);
        }
    }
}
