package Comportamiento.Visitor;

public class AuditoriaVisitor implements IVisitor{
    //Visitante concreto


    @Override
    public String visitar(Manager manager) {
        if (manager.getBono() > 500){
            return String.format("[AUDITORIA] Manager %s: Requiere revisión de bono ($%.2f).",
                    manager.getNombre(), manager.getBono());
        }
        return String.format("[AUDITORIA] Manager %s: OK. Bono $%.2f.",
                manager.getNombre(), manager.getBono());
    }

    @Override
    public String visitar(Operario operario) {
        if (operario.getHorasExtras() > 10){
            return String.format("[AUDITORIA] Operario %s: ALERTA: %d horas extras en el periodo.",
                    operario.getNombre(), operario.getHorasExtras());
        }
        return String.format("[AUDITORIA] Operario %s: OK. %d horas extras.",
                operario.getNombre(), operario.getHorasExtras());
    }
}
