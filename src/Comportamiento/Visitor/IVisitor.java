package Comportamiento.Visitor;

public interface IVisitor {
    //Visitor
    String visitar(Manager manager);

    String visitar(Operario operario);
}
