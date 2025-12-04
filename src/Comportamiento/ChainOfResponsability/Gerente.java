package Comportamiento.ChainOfResponsability;

public class Gerente extends Aprobador{
    @Override
    protected int getLimiteAprobacion() {
        return 1000;
    }

    @Override
    protected String getCargo() {
        return "Gerente";
    }


}
