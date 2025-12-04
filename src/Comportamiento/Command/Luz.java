package Comportamiento.Command;

public class Luz {
    //Receptor
    private final String ubicacion;

    public Luz(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public String encender(){
        return "Luz de " + ubicacion + " encendida.";
    }

    public String apagar(){
        return "Luz de " + ubicacion + " apagada.";
    }
}
