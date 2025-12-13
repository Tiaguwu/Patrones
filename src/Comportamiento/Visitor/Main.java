package Comportamiento.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Crear la estructura (Elementos)
        List<IEmpleado> empleados = new ArrayList<>();
        empleados.add(new Manager("Ana García", 4500.00, 1200.00));
        empleados.add(new Operario("Beto Rivas", 2500.00, 8));
        empleados.add(new Manager("Carlos Díaz", 6000.00, 500.00));
        empleados.add(new Operario("Diana Cruz", 2800.00, 15));

        // 2. Crear los Visitantes (Las Operaciones)
        IVisitor nomina = new NominaVisitor();
        IVisitor auditoria = new AuditoriaVisitor();

        // 3. APLICAR OPERACIÓN 1: NÓMINA
        System.out.println("==================================================");
        System.out.println("               CÁLCULO DE NÓMINA (VISITOR 1)");
        System.out.println("==================================================");
        for (IEmpleado emp : empleados) {
            // El elemento emp (Manager u Operario) llama al Visitante
            System.out.println(emp.aceptar(nomina));
        }

        // 4. APLICAR OPERACIÓN 2: AUDITORÍA (Sin modificar clases de empleado)
        System.out.println("\n==================================================");
        System.out.println("               GENERACIÓN DE AUDITORÍA (VISITOR 2)");
        System.out.println("==================================================");
        for (IEmpleado emp : empleados) {
            // El mismo elemento emp llama al nuevo Visitante
            System.out.println(emp.aceptar(auditoria));
        }
    }
}
