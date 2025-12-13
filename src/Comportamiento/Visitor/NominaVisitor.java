package Comportamiento.Visitor;

public class NominaVisitor implements IVisitor{
    //Visitante concreto


    @Override
    public String visitar(Manager manager) {
        double sueldoFinal = manager.getSalarioBase() + manager.getBono();
        return String.format("[NOMINA] Manager %s: Base $%.2f + Bono $%.2f = Total $%.2f",
                manager.getNombre(), manager.getSalarioBase(), manager.getBono(), sueldoFinal);
    }

    @Override
    public String visitar(Operario operario) {
        double pagoExtra = operario.getHorasExtras() * 50.0;
        double sueldoFinal = operario.getSalarioBase() + pagoExtra;

        return String.format("[NOMINA] Operario %s: Base $%.2f + %d H.Extras ($%.2f) = Total $%.2f",
                operario.getNombre(), operario.getSalarioBase(), operario.getHorasExtras(), pagoExtra, sueldoFinal);
    }
}
