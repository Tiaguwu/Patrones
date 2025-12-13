package Comportamiento.Visitor;

public class Operario implements IEmpleado{
    //Elemento concreto

    private final double salarioBase;
    private final int horasExtras;
    private final String nombre;

    public Operario(String nombre, double salarioBase, int horasExtras){
        this.horasExtras = horasExtras;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    @Override
    public String aceptar(IVisitor visitor) {
        return visitor.visitar(this);
    }

    public double getSalarioBase() { return salarioBase; }
    public int getHorasExtras() { return horasExtras; }
    public String getNombre() { return nombre; }
}
