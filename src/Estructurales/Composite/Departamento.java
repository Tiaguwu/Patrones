package Estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements IUnidadOrganizacional{
    private String nombre;
    private List<IUnidadOrganizacional> miembros;

    public Departamento(String nombre){
        this.nombre = nombre;
        miembros = new ArrayList<>();
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }

    public void agregarUnidad(IUnidadOrganizacional unidadOrganizacional){
        miembros.add(unidadOrganizacional);
        System.out.println("-> Añadida unidad: " + unidadOrganizacional.obtenerNombre() + " a " + this.nombre);
    }

    public void removerUnidad(IUnidadOrganizacional unidadOrganizacional){
        miembros.remove(unidadOrganizacional);
        System.out.println("-> Removida unidad: " + unidadOrganizacional.obtenerNombre() + " de " + this.nombre);
    }

    @Override
    public String mostrarReporte() {
        StringBuilder reporte = new StringBuilder();

        reporte.append("\n============================================\n");
        reporte.append("| DEPARTAMENTO: ").append(this.nombre).append(" |\n");
        reporte.append("============================================\n");

        for (IUnidadOrganizacional unidadOrganizacional : miembros){
            reporte.append(unidadOrganizacional.mostrarReporte());
        }
        return reporte.toString();
    }
}
