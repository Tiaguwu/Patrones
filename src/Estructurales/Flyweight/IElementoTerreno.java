package Estructurales.Flyweight;

public interface IElementoTerreno {
    //El flyweight (El estado compartido)

    // Operación que recibe el estado extrínseco (posición)
    String dibujar(int x, int y);

    // Metodo de prueba para obtener el HashCode y verificar la compartición
    int getHashCodeIntrinseco();
}
