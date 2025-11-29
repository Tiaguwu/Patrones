package Adapter;

public class Main {
    public static void main (String[] args){
        System.out.println("--- PRUEBA DEL PATRÓN ADAPTADOR DE OBJETO ---");


        DispositivoAntiguo dispositivoViejo = new DispositivoAntiguo();
        System.out.println("El dispositivo viejo existe pero no es compatible directamente.");

        IEnchufable adaptador = new AdaptadorElectrico(dispositivoViejo);

        System.out.println("\n--- Cliente usando la interfaz IEnchufable ---");
        String resultado = adaptador.conectar();

        System.out.println("Resultado de la conexión: \n" + resultado);
    }
}
