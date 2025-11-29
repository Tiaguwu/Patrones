package AbstractFactory;

public class TemaOscuroFactory implements GUIFactory{
    //Fabrica Concreta

    @Override
    public IBoton crearBoton() {
        return new BotonOscuro();
    }

    @Override
    public IVentana crearVentana() {
        return new VentanaOscura();
    }
}
