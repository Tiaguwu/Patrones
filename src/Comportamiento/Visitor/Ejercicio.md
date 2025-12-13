Implementaremos el patrón Visitor para un sistema de Recursos Humanos donde la estructura de empleados (`Manager`, `Operario`) permanece fija, pero las operaciones de nómina y auditoría cambian constantemente.

Calcular la nómina (`NominaVisitor`) y generar un informe de auditoría (`AuditoriaVisitor`) para diferentes tipos de empleados, sin modificar la estructura de clases de los empleados.