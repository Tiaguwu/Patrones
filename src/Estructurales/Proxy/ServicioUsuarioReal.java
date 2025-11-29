package Estructurales.Proxy;

public class ServicioUsuarioReal implements IServicioUsuario {
    //El sujeto real (Real Subject)

    public ServicioUsuarioReal(){
        System.out.println("ServicioUsuarioReal: Inicializando conexión a la BD de usuarios...");
    }

    @Override
    public String obtenerUsuario(int id) {
        return "Consultando usuario ID " + id + " en la base de datos...";
    }

    @Override
    public String eliminarUsuario(int id) {
        return "!!! USUARIO ID " + id + " ELIMINADO de la base de datos. !!!";
    }
}
