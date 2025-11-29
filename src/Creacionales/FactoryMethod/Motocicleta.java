package Creacionales.FactoryMethod;

public class Motocicleta implements IVehiculo {
    //Producto concreto
    @Override
    public String obtenerTipo() {
        return "Vehiculo: Motocicleta de reparto";
    }
}
