package Comportamiento.Iterator;

import java.util.Iterator;
import java.util.Map;

public class IteradorTareasMap implements ITareaIterador{
    //Iterador Concreto B
    private Iterator<Tarea> iteradorMap;

    public IteradorTareasMap(Map<String, Tarea> mapa) {
        // Obtenemos un iterador de la colección de valores del Map
        this.iteradorMap = mapa.values().iterator();
    }

    @Override
    public boolean haySiguiente() {
        // Delegamos la lógica de navegación al Iterator nativo
        return iteradorMap.hasNext();
    }

    @Override
    public Tarea siguiente() {
        // Delegamos la lógica de obtención al Iterator nativo
        return iteradorMap.next();
    }
}
