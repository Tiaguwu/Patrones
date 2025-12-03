package Estructurales.Flyweight;

public class ElementoInstanciado {
    // El Contexto/Cliente: Representa una instancia específica en el mundo

    // Estado Extrínseco (Único por instancia)
    private final int x;
    private final int y;

    // Referencia al Flyweight (Objeto Compartido)
    private final IElementoTerreno elemento;

    public IElementoTerreno getElemento() {
        return elemento;
    }

    public ElementoInstanciado(int x, int y, IElementoTerreno elemento){
        this.elemento = elemento;
        this.x = x;
        this.y = y;
    }

    public void renderizar() {
        // Delega la operación, pasando el estado extrínseco
        String info = elemento.dibujar(x, y);
        System.out.println(info + " | HashCode (Flyweight Compartido): " + elemento.getHashCodeIntrinseco());
    }


}
