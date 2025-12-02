package Creacionales.Prototype;

public interface IDocumento extends Cloneable{
    //El prototipo
    IDocumento clone() throws CloneNotSupportedException;
    String mostrarInfo();
}
