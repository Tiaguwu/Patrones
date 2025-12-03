package Estructurales.Bridge;

public abstract class Mensaje {
    //La abstraccion
    protected IPlataforma plataforma;

    public Mensaje(IPlataforma plataforma){
        this.plataforma = plataforma;
    }

    public abstract String enviar(String cuerpoMensaje);

}
