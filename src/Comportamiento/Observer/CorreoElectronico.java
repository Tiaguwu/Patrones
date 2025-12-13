package Comportamiento.Observer;

public class CorreoElectronico implements IObservador{

    private final String direccion;

    public CorreoElectronico(String direccion){
        this.direccion = direccion;
    }

    @Override
    public void actualizar(String noticia) {
        System.out.println("-> [Email a " + direccion + "]: Se ha enviado un correo con el titular: " + noticia);
    }
}
