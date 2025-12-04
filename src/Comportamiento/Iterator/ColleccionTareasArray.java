package Comportamiento.Iterator;

public class ColleccionTareasArray implements ITareaAgregado{
    //Agregado concreto A
    private Tarea[] listaTareas;
    private int indice = 0;

    public ColleccionTareasArray(){
        listaTareas = new Tarea[5];
        agregarTarea("Revisar Codigo", "Tarea 1");
        agregarTarea("Escribir Pruebas Unitarias", "Tarea 2");
        agregarTarea("Desplegar a Staging", "Tarea 3");
    }

    public void agregarTarea(String nombre, String desc){
        if (indice< listaTareas.length){
            listaTareas[indice] = new Tarea(nombre,desc);
            indice++;
        }
    }

    @Override
    public ITareaIterador crearIterador() {
        // Devuelve el iterador específico para esta colección
        return new IteradorTareasArray(listaTareas);
    }
}
