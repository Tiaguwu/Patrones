package AbstractFactory;

public interface GUIFactory {
    //Fabrica abstracta
    IBoton crearBoton();
    IVentana crearVentana();
}
