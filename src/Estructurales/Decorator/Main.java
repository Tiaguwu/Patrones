package Estructurales.Decorator;

public class Main {
    public static void main (String[] args){
        // 1. Objeto base
        IBebida miCafe = new CafeSimple();
        System.out.println(miCafe.obtenerCosto());
        System.out.println(miCafe.obtenerDescripcion());
// 2. Decorar: añadir Leche
        miCafe = new LecheDecorador(miCafe);
        System.out.println(miCafe.obtenerCosto());
        System.out.println(miCafe.obtenerDescripcion());
// 3. Decorar: añadir Azúcar
        miCafe = new AzucarDecorator(miCafe);
        System.out.println(miCafe.obtenerCosto());
        System.out.println(miCafe.obtenerDescripcion());
// 4. Decorar: añadir más Leche (doble)
        miCafe = new LecheDecorador(miCafe);
        System.out.println(miCafe.obtenerCosto());
        System.out.println(miCafe.obtenerDescripcion());
    }
}
