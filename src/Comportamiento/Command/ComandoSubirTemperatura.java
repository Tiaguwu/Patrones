package Comportamiento.Command;

public class ComandoSubirTemperatura implements IComando{
    private final Termostato termostato;

    public ComandoSubirTemperatura(Termostato termostato) {
        this.termostato = termostato;
    }

    @Override
    public String ejecutar() {
        return termostato.subirTermostato();
    }
}
