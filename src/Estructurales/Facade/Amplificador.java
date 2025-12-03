package Estructurales.Facade;

public class Amplificador {
    public void encender(){
        System.out.println("Amplificador: Encendido.");
    }

    public void ajustarVolumen(int nivel){
        System.out.println("Amplificador: Volumen ajustado a " + nivel);
    }

    public void apagar() {
        System.out.println("Amplificador: Apagado.");
    }
}
