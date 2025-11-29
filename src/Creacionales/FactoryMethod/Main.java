package Creacionales.FactoryMethod;

public class Main {
    public static void main (String[] args){
        Logistica logisticaCarretera = new LogisticaCarretera();
        logisticaCarretera.planificarEntrega("Ruta 3");

        Logistica logisticaUrbana = new LogisticaUrbana();
        logisticaUrbana.planificarEntrega("San Martin 123");
    }
}
