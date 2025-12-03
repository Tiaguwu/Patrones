package Estructurales.Facade;

public class Main {
    public static void main(String[] args) {
        // El cliente solo interactúa con la Fachada
        SistemaCineEnCasa cine = new SistemaCineEnCasa();

        // 1. Proceso de encendido y reproducción (una sola llamada)
        System.out.println("--- CLIENTE: SOLICITA VER PELÍCULA ---");
        cine.verPelicula("Star Wars: Episodio V", 15);

        // 2. Proceso de apagado (una sola llamada)
        System.out.println("\n--- CLIENTE: SOLICITA APAGADO ---");
        cine.apagarTodo();
    }
}
