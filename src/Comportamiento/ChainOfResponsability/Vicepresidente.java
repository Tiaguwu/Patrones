package Comportamiento.ChainOfResponsability;

public class Vicepresidente extends Aprobador{
    @Override
    protected int getLimiteAprobacion() {
        return 20000;
    }

    @Override
    protected String getCargo() {
        return "Vicepresidente";
    }
}
