package Comportamiento.Command;

public class Termostato {
    //Receptor
    private final String ubicacion;
    private int temperatura = 20;

    public Termostato(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public String subirTermostato(){
        temperatura++;
        return "Termostato de " + ubicacion + ": Temperatura subida a " + temperatura + "°C.";
    }

    public String bajarTermostato(){
        temperatura--;
        return "Termostato de " + ubicacion + ": Temperatura bajada a " + temperatura + "°C.";
    }
}
