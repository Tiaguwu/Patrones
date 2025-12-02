package Creacionales.Prototype;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Crear el Original (Prototipo)
            System.out.println("--- 1. CREANDO EL ORIGINAL (PROTOTIPO) ---");
            Reporte original = new Reporte("Informe de Ventas 2025 (Original)", new MetaDatos("2025-01-01"));
            System.out.println("Original Creado: " + original.mostrarInfo());

            // 2. Clonar el objeto
            System.out.println("\n--- 2. CLONANDO EL OBJETO ---");
            Reporte clon = (Reporte) original.clone();

            // 3. Modificar el clon:
            clon.setTitulo("Informe Modificado por Usuario B");

            // Modificar la referencia interna del clon (Copia Profunda)
            clon.getMetaDatos().setFechaCreacion("2025-12-31 (MODIFICADO)");

            // 4. Modificar el Original para verificar si el clon lo cambió (no debería)
            original.setTitulo("Informe de Ventas 2025 (FINALIZADO)");

            System.out.println("\n--- 3. RESULTADOS DE LA COPIA ---");
            System.out.println("Original Final: " + original.mostrarInfo());
            System.out.println("Clon Final:     " + clon.mostrarInfo());

            System.out.println("\n--- VERIFICACIÓN DE REFERENCIAS ---");
            // El resultado debe ser false, indicando que son objetos distintos.
            System.out.println("¿Original == Clon? " + (original == clon));

            // Si la copia fue PROFUNDA, los Metadatos también deben ser distintos:
            System.out.println("¿Metadatos son los mismos? " + (original.getMetaDatos() == clon.getMetaDatos()));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
