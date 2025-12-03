package Estructurales.Facade;

public class ReproductorDVD {
    public void encender(){
        System.out.println("Reproductor DVD: Encendido");
    }

    public void reproducirPelicula(String pelicula){
        System.out.println("ReproductorDVD: Reproduciendo " + pelicula);
    }

    public void apagar() {
        System.out.println("Reproductor DVD: Apagado.");
    }
}
