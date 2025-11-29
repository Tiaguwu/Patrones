package Creacionales.Singleton;

public class Main {
    public static void main (String[] args){
        System.out.println("Inicio de la aplicación. Probando el patrón Singleton.\n");

        System.out.println("-> Llamada 1 a getInstance()");
        ConfiguracionSistema config1 = ConfiguracionSistema.getInstance();
        System.out.println("Estado Config 1: " + config1.mostrarConfiguracion());

        System.out.println("\n--- Modificando la versión a 2.0.0 ---");
        config1.setVersion("2.0.0");

        System.out.println("\n-> Llamada 2 a getInstance()");
        ConfiguracionSistema config2 = ConfiguracionSistema.getInstance();
        System.out.println("Estado Config 2: " + config2.mostrarConfiguracion());
    }
}
