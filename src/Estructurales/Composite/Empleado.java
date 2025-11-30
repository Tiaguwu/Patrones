package Estructurales.Composite;

public class Empleado implements IUnidadOrganizacional{
    //La hoja(Leaf)
    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo){
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }

    @Override
    public String mostrarReporte() {
        return "  - Cargo: " + this.cargo + " | Nombre: " + this.nombre + " (Trabajador Individual)";
    }
}
