package Estructurales.Flyweight;


public class Arbol implements IElementoTerreno {
    //Concrete Flyweight
    private final String malla3D;
    private final String textura;

    public Arbol(String malla3D, String textura){
        this.malla3D = malla3D;
        this.textura = textura;
        System.out.println("\n[FABRICA] Creando NUEVO Flyweight Arbol. Tipo: " + this.textura);
    }

    @Override
    public String dibujar(int x, int y) {
        // Combina el estado Intrínseco con el estado Extrínseco (x, y)
        return String.format("Dibujando Arbol (%s) en posición (%d, %d). Malla usada: %s.",
                this.textura, x, y, this.malla3D);
    }

    @Override
    public int getHashCodeIntrinseco() {
        return this.hashCode();
    }
}
