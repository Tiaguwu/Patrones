package Comportamiento.Visitor;

public class Manager implements IEmpleado{
    //Elemento concreto

    private final double salarioBase;
    private final double bono;
    private final String nombre;

    public Manager(String nombre, double salarioBase, double bono){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public String aceptar(IVisitor visitor) {
        return visitor.visitar(this);
    }

    public double getSalarioBase() { return salarioBase; }
    public double getBono() { return bono; }
    public String getNombre() { return nombre; }
}
