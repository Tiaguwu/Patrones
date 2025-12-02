package Creacionales.Prototype;

public class MetaDatos implements Cloneable{
    //Recurso pesado(para la copia profunda)
    // Implementa Cloneable para poder ser copiado profundamente
    private String fechaCreacion;
    public MetaDatos(String fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

     @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
