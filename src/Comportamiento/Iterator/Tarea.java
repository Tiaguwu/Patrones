package Comportamiento.Iterator;

public class Tarea {
    //El producto
    private String nombre;
    private String descripcion;

    public Tarea(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
