package Creacionales.Builder;

public class PCBasicaBuilder implements IComputadoraBuilder{
    //Constructor Concreto
    private String cpu;
    private String ram;
    private String gpu;
    private String almacenamiento;

    @Override
    public void setCPU() {
        this.cpu = "Intel i3 Básico";
    }

    @Override
    public void setRAM() {
        this.ram = "8GB DDR4";
    }

    @Override
    public void setGPU() {
        this.gpu = "Gráficos Integrados";
    }

    @Override
    public void setAlmacenamiento() {
        this.almacenamiento = "512GB SSD";
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
