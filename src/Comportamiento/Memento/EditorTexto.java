package Comportamiento.Memento;

public class EditorTexto {
    //El originador

    private String contenido = "";

    public void agregarTexto(String texto){
        this.contenido += texto;
        System.out.println("EDITOR: Texto agregado. Nuevo estado: '" + this.contenido + "'");
    }

    //1. CREAR MEMENTO (GUARDAR ESTADO)
    public IMemento guardar(){
        System.out.println("EDITOR: Creando Memento y guardando estado...");
        return new MementoEditor(this.contenido);
    }

    //2. RESTAURAR MEMENTO (DESHACER)
    public void deshacer(IMemento memento){
        if (!(memento instanceof MementoEditor)){
            throw new IllegalArgumentException("Memento inválido para este editor.");
        }

        MementoEditor mementoConcreto = (MementoEditor) memento;
        this.contenido = mementoConcreto.getContenido();
        System.out.println("EDITOR: Estado restaurado desde el Memento del " + memento.getFechaGuardado());
        this.mostrarEstado();
    }

    public void mostrarEstado() {
        System.out.println("ESTADO ACTUAL: >>> " + this.contenido + " <<<");
    }
}
