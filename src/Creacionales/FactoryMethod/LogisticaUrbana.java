package Creacionales.FactoryMethod;

public class LogisticaUrbana extends Logistica {
    @Override
    protected IVehiculo crearVehiculo() {
        return new Coche();
    }
}
