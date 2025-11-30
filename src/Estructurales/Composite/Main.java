package Estructurales.Composite;

public class Main {
    public static void main(String[] args){
// Hojas
        IUnidadOrganizacional dev1 = new Empleado("Alice", "Desarrollador Senior");
        IUnidadOrganizacional dev2 = new Empleado("Bob", "Desarrollador Junior");

// Compuesto (Rama 1)
        Departamento desarrollo = new Departamento("Departamento de Desarrollo");
        desarrollo.agregarUnidad(dev1);
        desarrollo.agregarUnidad(dev2);

// Hojas
        IUnidadOrganizacional fin1 = new Empleado("Charlie", "Contador");

// Compuesto (Rama 2)
        Departamento financiero = new Departamento("Departamento Financiero");
        financiero.agregarUnidad(fin1);

// Raíz (Compuesto de Compuestos)
        Departamento principal = new Departamento("Oficina Principal");
        principal.agregarUnidad(desarrollo);
        principal.agregarUnidad(financiero);
        IUnidadOrganizacional gerente = new Empleado("Diana", "Gerente General");
        principal.agregarUnidad(gerente);

        System.out.println(principal.mostrarReporte());
    }
}
