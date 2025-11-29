package AbstractFactory;

public class Aplicacion {
    public static void probarAplicacion(GUIFactory factory) {
        IBoton boton = factory.crearBoton();
        IVentana ventana = factory.crearVentana();

        System.out.println("-> Botón: " + boton.hacerClick());
        System.out.println("-> Ventana: " + ventana.mostrarContenido());
    }
    public static void main (String[] args){
        probarAplicacion(new TemaClaroFactory());
        probarAplicacion(new TemaOscuroFactory());
    }
}
