package Creacionales.Builder;

public class Computadora {
    //Clase complejta
    private String cpu;
    private String ram;
    private String gpu;
    private String almacenamiento;

    private Computadora(String cpu, String ram, String gpu, String almacenamiento){
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public static Computadora create(String cpu, String ram, String gpu, String almacenamiento){
        return new Computadora(cpu, ram, gpu, almacenamiento);
    }

    public void mostrarEspecificaciones(){
        System.out.println("--- Espeficifaciones de la Computadora ---");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("GPU: " + gpu);
        System.out.println("ALMACENAMIENTO: " + almacenamiento);
        System.out.println("------------------------------------------");
    }
}
