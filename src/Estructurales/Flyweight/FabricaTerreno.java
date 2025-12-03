package Estructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaTerreno {
    //Gestion de reutilizacion
    private final Map<String, IElementoTerreno> cache = new HashMap<>();

    public IElementoTerreno obtenerElemento(String tipo) {
        // 1. Verificar si el Flyweight ya existe en el caché
        if (cache.containsKey(tipo)) {
            System.out.println("[FABRICA] Reutilizando elemento existente: " + tipo);
            return cache.get(tipo);
        }

        // 2. Si no existe, crearlo, cachearlo y devolverlo
        IElementoTerreno elemento;

        switch (tipo.toLowerCase()) {
            case "roble":
                elemento = new Arbol("Malla_Roble_L4", "Roble");
                break;
            case "pino":
                elemento = new Arbol("Malla_Pino_L2", "Pino");
                break;
            case "arbusto":
                elemento = new Arbol("Malla_Arbusto_M1", "Arbusto");
                break;
            default:
                throw new IllegalArgumentException("Tipo de elemento de terreno desconocido.");
        }

        cache.put(tipo, elemento);
        return elemento;
    }
}
