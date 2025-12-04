package Comportamiento.ChainOfResponsability;

public class Director extends Aprobador{

    @Override
    protected int getLimiteAprobacion() {
        return 5000;
    }

    @Override
    protected String getCargo() {
        return "Director";
    }
}
