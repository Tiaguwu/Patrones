package Creacionales.Builder;

public class Main {
    public static void main(String[] args) {
        Ensamblador ensamblador = new Ensamblador();

        // --- Construcción 1: PC Gaming ---
        IComputadoraBuilder gamingBuilder = new GamingPCBuilder();

        // 1. El Director guía al Builder
        ensamblador.ensamblarPCGaming(gamingBuilder);

        // 2. El cliente pide el producto final
        Computadora gamingPC = gamingBuilder.build();
        gamingPC.mostrarEspecificaciones();


        // --- Construcción 2: PC Oficina ---
        IComputadoraBuilder oficinaBuilder = new PCBasicaBuilder();

        // 1. El Director guía a otro Builder
        ensamblador.ensamblarPCOficina(oficinaBuilder);

        // 2. El cliente pide el producto final
        Computadora oficinaPC = oficinaBuilder.build();
        oficinaPC.mostrarEspecificaciones();

        //Computadora gamingPC = new GamingPCBuilder()
                // Se puede construir la PC en una sola línea de forma muy legible
                //.setCPU("Intel i9-14900K")
                //.setRAM("64GB DDR5")
                //.setGPU("Nvidia RTX 4090")
                //.setAlmacenamiento("4TB NVMe SSD")
                //.build();

        //Computadora basicaPC = new GamingPCBuilder()
                //.setCPU("Intel i5")
                //.setRAM("16GB DDR4")
                // Notar que omitimos setGPU() — la Builder manejará el valor null (o un valor por defecto)
                //.setAlmacionamiento("512GB SSD")
                //.build();
    }
}
