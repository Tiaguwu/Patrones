package Comportamiento.Observer;

public class Main {
    public static void main(String[] args) {
        // 1. Crear Sujeto (Observable)
        ServidorNoticias servidor = new ServidorNoticias();

        // 2. Crear Observadores
        IObservador appA = new AppMovil("UsuarioA");
        IObservador emailB = new CorreoElectronico("admin@ejemplo.com");
        IObservador loggerC = new Logger();

        // 3. Suscripción
        servidor.adjuntar(appA);
        servidor.adjuntar(emailB);
        servidor.adjuntar(loggerC);

        // 4. Cambio de Estado y Notificación (Automática)
        servidor.publicarNoticia("¡Java 25 lanzado oficialmente!");

        // 5. Desuscribir uno y probar de nuevo
        System.out.println("\n--- DESUSCRIBIENDO EMAIL ---");
        servidor.desajuntar(emailB);

        servidor.publicarNoticia("Reporte de seguridad actualizado.");
    }
}
