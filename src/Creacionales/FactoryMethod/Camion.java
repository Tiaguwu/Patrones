package Creacionales.FactoryMethod;

public class Camion implements IVehiculo {
    //Producto concreto
    @Override
    public String obtenerTipo() {
        return "Vehiculo: Camion de carga pesada";
    }
}
