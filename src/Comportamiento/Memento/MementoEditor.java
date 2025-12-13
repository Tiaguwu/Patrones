package Comportamiento.Memento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MementoEditor implements IMemento{
    //Memento

    private final String contenido;
    private final LocalDateTime fecha;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public MementoEditor(String contenido){
        this.contenido = contenido;
        this.fecha = LocalDateTime.now();
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String getFechaGuardado() {
        return fecha.format(FORMATTER);
    }

    @Override
    public String getNombreEstado() {
        return contenido.substring(0, Math.min(contenido.length(), 20)) + "...";
    }
}
