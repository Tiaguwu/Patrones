package Comportamiento.State;

public class Main {
    public static void main(String[] args) {
        ReproductorContexto reproductor = new ReproductorContexto(); // Inicia en EstadoDetenido

        System.out.println("Estado inicial: " + reproductor.getEstadoActual().getClass().getSimpleName());

        // 1. Detenido -> Reproduciendo
        System.out.println("Acción: Play -> " + reproductor.presionarPlay());

        // 2. Reproduciendo -> Pausado
        System.out.println("Acción: Pausa -> " + reproductor.presionarPausa());

        // 3. Pausado -> Reproduciendo
        System.out.println("Acción: Play -> " + reproductor.presionarPlay());

        // 4. Reproduciendo -> Detenido
        System.out.println("Acción: Stop -> " + reproductor.presionarStop());

        // 5. Detenido -> Intento de Pausa (Comportamiento diferente)
        System.out.println("Acción: Pausa -> " + reproductor.presionarPausa());
    }
}
