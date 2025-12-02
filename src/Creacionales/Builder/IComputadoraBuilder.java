package Creacionales.Builder;

public interface IComputadoraBuilder {
    //Constructor Abstracto
    void setCPU();
    void setRAM();
    void setGPU();
    void setAlmacenamiento();


    Computadora build();

    // FLUENT INTERFACE (para mi mejor)
    //IComputadoraBuilder setCPU(String cpu);
    //IComputadoraBuilder setRAM(String ram);
    //IComputadoraBuilder setGPU(String gpu);
    //IComputadoraBuilder setAlmacenamiento(String almacenamiento);
}
