package Estructurales.Facade;

public class SistemaCineEnCasa {
    //La fachada
    private final Proyector proyector;
    private final ReproductorDVD reproductorDVD;
    private final Amplificador amplificador;

    public SistemaCineEnCasa(){
        this.proyector = new Proyector();
        this.amplificador = new Amplificador();
        this.reproductorDVD = new ReproductorDVD();
    }

    public void verPelicula(String pelicula, int volumen){
        System.out.println("\n--- INICIANDO SESIÓN DE CINE EN CASA ---");
        amplificador.encender();
        proyector.encender();
        proyector.configurarModoCine();
        amplificador.ajustarVolumen(volumen);
        reproductorDVD.encender();
        reproductorDVD.reproducirPelicula(pelicula);
    }

    public void apagarTodo() {
        System.out.println("\n--- APAGANDO EL SISTEMA ---");

        // La Fachada orquesta el apagado
        reproductorDVD.apagar();
        proyector.apagar();
        amplificador.apagar();

        System.out.println("Sistema apagado exitosamente.");
    }
}