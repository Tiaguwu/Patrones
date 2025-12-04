package Comportamiento.Command;

public class ControlRemoto {
    //El invocador
    private IComando comandoSlot;

    public void setComando(IComando comando) {
        this.comandoSlot = comando;
    }

    public String presionarBoton() {
        if (comandoSlot == null) {
            return "ERROR: Botón no programado.";
        }
        return comandoSlot.ejecutar();
    }
}
