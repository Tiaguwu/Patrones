package Creacionales.FactoryMethod;

public class LogisticaCarretera extends Logistica {
    //Creador concreto
    @Override
    protected IVehiculo crearVehiculo() {
        return new Camion();
    }
}
