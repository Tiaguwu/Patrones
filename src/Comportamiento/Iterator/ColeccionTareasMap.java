package Comportamiento.Iterator;

import java.util.HashMap;
import java.util.Map;

public class ColeccionTareasMap implements ITareaAgregado{
    private Map<String, Tarea> mapaTareas;

    public ColeccionTareasMap() {
        mapaTareas = new HashMap<>();
        agregarTarea("DB_SCHEMA", "Crear esquema de BD");
        agregarTarea("MIGRACION", "Migración de datos antiguos");
        agregarTarea("DEPLOY_PROD", "Despliegue final a Producción");
    }

    public void agregarTarea(String clave, String nombre) {
        mapaTareas.put(clave, new Tarea(nombre, "Descripción para " + clave));
    }

    @Override
    public ITareaIterador crearIterador() {
        // Devuelve el iterador específico para esta colección
        return new IteradorTareasMap(mapaTareas);
    }

}
