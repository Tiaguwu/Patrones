package Comportamiento.Command;

public class ComandoEncenderLuz implements IComando{
    //Comando Concreto (encapsulamiento de acciones)
    private final Luz luz;

    public ComandoEncenderLuz(Luz luz){
        this.luz = luz;
    }

    @Override
    public String ejecutar() {
        return luz.encender();
    }
}
