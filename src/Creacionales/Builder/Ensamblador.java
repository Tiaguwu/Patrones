package Creacionales.Builder;

public class Ensamblador {
    public void ensamblarPCGaming(IComputadoraBuilder builder) {
        System.out.println("\n--- Ensamblando PC Gaming ---");
        builder.setCPU();
        builder.setRAM();
        builder.setGPU();
        builder.setAlmacenamiento();
    }


    public void ensamblarPCOficina(IComputadoraBuilder builder) {
        System.out.println("\n--- Ensamblando PC Oficina ---");
        builder.setCPU();
        builder.setRAM();
        builder.setGPU();
        builder.setAlmacenamiento();
    }
}
