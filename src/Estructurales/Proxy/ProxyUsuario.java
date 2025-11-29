package Estructurales.Proxy;

public class ProxyUsuario implements IServicioUsuario {
    //Proxy
    private ServicioUsuarioReal servicio;
    private String rolUsuario;

    public ProxyUsuario(String rolUsuario){
        this.servicio = new ServicioUsuarioReal();
        this.rolUsuario = rolUsuario;
        System.out.println("ProxyUsuarios: Creado para usuario con rol: " + rolUsuario);
    }

    @Override
    public String obtenerUsuario(int id) {
        System.out.print("[PROXY] Verificando acceso... OK. ");
        return servicio.obtenerUsuario(id);
    }

    @Override
    public String eliminarUsuario(int id) {
        System.out.print("[PROXY] Verificando permisos para ELIMINAR... ");

        if (this.rolUsuario.equalsIgnoreCase("ADMIN")){
            System.out.println("PERMISO CONCEDIDO.");
            return servicio.eliminarUsuario(id);
        } else {
            System.out.println("PERMISO DENEGADO.");
            return "ERROR: Acceso denegado. Se requiere rol de Administrador para eliminar.";
        }
    }
}
