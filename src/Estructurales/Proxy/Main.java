package Estructurales.Proxy;

public class Main {
    public static void main(String[] args) {

        // El cliente trabaja con la interfaz IServicioUsuarios
        IServicioUsuario adminProxy;
        IServicioUsuario clienteProxy;

        System.out.println("-----------------------------------------------------");
        System.out.println("--- PRUEBA 1: USUARIO CON ROL DE ADMINISTRADOR (ADMIN) ---");
        System.out.println("-----------------------------------------------------");

        // El administrador DEBE poder eliminar (Acceso permitido)
        adminProxy = new ProxyUsuario("ADMIN");
        System.out.println(adminProxy.obtenerUsuario(5));
        System.out.println(adminProxy.eliminarUsuario(5));

        System.out.println("\n-----------------------------------------------------");
        System.out.println("--- PRUEBA 2: USUARIO NORMAL (CLIENTE) ---");
        System.out.println("-----------------------------------------------------");

        // El usuario normal NO DEBE poder eliminar (Acceso denegado)
        clienteProxy = new ProxyUsuario("CLIENTE");
        System.out.println(clienteProxy.obtenerUsuario(10));
        System.out.println(clienteProxy.eliminarUsuario(10));
    }
}
