package Creacionales.AbstractFactory;

public class TemaClaroFactory implements GUIFactory {
    @Override
    public IBoton crearBoton() {
        return new BotonClaro();
    }

    @Override
    public IVentana crearVentana() {
        return new VentanaClara();
    }
}
