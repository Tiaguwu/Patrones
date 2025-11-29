package FactoryMethod;

public class Coche implements IVehiculo{
    //Producto concreto
    @Override
    public String obtenerTipo() {
        return "Vehiculo: Coche de pasajeros";
    }
}
