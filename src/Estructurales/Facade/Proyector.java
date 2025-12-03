package Estructurales.Facade;

public class Proyector {
    //Subsistema Complejo
    public void encender(){
        System.out.println("Proyector: encendido");
    }

    public void configurarModoCine(){
        System.out.println("Proyector: Configurado en modo cine.");
    }

    public void apagar() {
        System.out.println("Proyector: Apagado.");
    }
}
