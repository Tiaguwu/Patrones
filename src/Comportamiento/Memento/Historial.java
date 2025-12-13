package Comportamiento.Memento;

import java.util.Stack;

public class Historial {
    //El cuidador

    private final Stack<IMemento> historial = new Stack<>();

    public void guardar(IMemento memento){
        historial.push(memento);
        System.out.println("HISTORIAL: Memento '" + memento.getNombreEstado() +
                "' guardado. Total: " + historial.size());
    }

    public IMemento deshacer(){
        if (!historial.isEmpty()){
            IMemento memento = historial.pop();
            System.out.println("HISTORIAL: Recuperando Memento del " + memento.getFechaGuardado());
            return memento;
        }
        System.out.println("HISTORIAL: No hay estados previos para deshacer.");
        return null;
    }
}
