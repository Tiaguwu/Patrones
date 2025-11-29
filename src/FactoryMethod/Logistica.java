package FactoryMethod;

public abstract class Logistica {
    //Factory method
    protected abstract IVehiculo crearVehiculo();

    public void planificarEntrega(String ruta){
        IVehiculo vehiculo = crearVehiculo();

        System.out.print("Vehiculo asignado para la ruta " + ruta + ": ");
        System.out.println(vehiculo.obtenerTipo());
        System.out.println("Entrega planificada exitosamente.");
    }
}
