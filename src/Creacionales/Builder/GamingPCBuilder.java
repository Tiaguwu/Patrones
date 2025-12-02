package Creacionales.Builder;

public class GamingPCBuilder implements IComputadoraBuilder{
    //Constructor Concreto
    private String cpu;
    private String ram;
    private String gpu;
    private String almacenamiento;

    @Override
    public void setCPU() {
        this.cpu = "Intel i9 de Última Generación";
    }

    @Override
    public void setRAM() {
        this.ram = "32GB DDR5";
    }

    @Override
    public void setGPU() {
        this.gpu = "Nvidia RTX 4080";
    }

    @Override
    public void setAlmacenamiento() {
        this.almacenamiento = "2TB NVMe SSD";
    }

    @Override
    public Computadora build() {
        return Computadora.create(cpu, ram, gpu, almacenamiento);
    }

    //public IComputadoraBuilder setCPU(String cpu) {
        //this.cpu = cpu; // Se usa el valor pasado
        //return this; // ¡CLAVE para el encadenamiento!
    //}

    //@Override
    //public IComputadoraBuilder setRAM(String ram) {
        //this.ram = ram;
        //return this;
    //}

    //@Override
    //public IComputadoraBuilder setGPU(String gpu) {
        //this.gpu = gpu;
        //return this;
    //}

    //@Override
    //public IComputadoraBuilder setAlmacenamiento(String almacenamiento) {
        //this.almacenamiento = almacenamiento;
        //return this;
    //}
}
