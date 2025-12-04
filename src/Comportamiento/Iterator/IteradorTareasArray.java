package Comportamiento.Iterator;

public class IteradorTareasArray implements ITareaIterador{
    //Iterador Concreto A
    private Tarea[] lista;
    private int posicion = 0;

    public IteradorTareasArray(Tarea[] lista) {
        this.lista = lista;
    }

    @Override
    public boolean haySiguiente() {
        // Lógica de navegación específica para un Array
        return posicion < lista.length && lista[posicion] != null;
    }

    @Override
    public Tarea siguiente() {
        Tarea tarea = lista[posicion];
        posicion++;
        return tarea;
    }
}
