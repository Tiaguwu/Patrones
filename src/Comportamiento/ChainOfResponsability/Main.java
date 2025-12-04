package Comportamiento.ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Aprobador gerente = new Gerente();
        Aprobador director = new Director();
        Aprobador vp = new Vicepresidente();

        gerente.setSiguienteAprobador(director);
        director.setSiguienteAprobador(vp);

        System.out.println("Solicitud 1 ($950): " + gerente.solicitarAprobacion(950));   // Debe manejar Gerente
        System.out.println("Solicitud 2 ($3500): " + gerente.solicitarAprobacion(3500)); // Debe pasar a Director
        System.out.println("Solicitud 3 ($25000): " + gerente.solicitarAprobacion(25000)); // Debe fallar al final
    }
}
