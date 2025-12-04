package Comportamiento.ChainOfResponsability;

public abstract class Aprobador {

    // El enlace al siguiente en la cadena
    private Aprobador siguienteAprobador;

    protected abstract int getLimiteAprobacion();

    protected abstract String getCargo();

    // Constructor vacío
    public Aprobador() {}

    // Metodo para construir la cadena
    public void setSiguienteAprobador(Aprobador siguiente) {
        this.siguienteAprobador = siguiente;
    }

    /**
     * METODO PLANTILLA: Contiene la lógica inmutable de la cadena.
     */
    public String solicitarAprobacion(int monto) {

        // 1. Lógica de Manejo Propia: ¿Puedo aprobar esta solicitud?
        if (monto <= getLimiteAprobacion()) {
            return String.format("Aprobación concedida por %s (Límite: $%d). Solicitud: $%d",
                    getCargo(), getLimiteAprobacion(), monto);
        }

        // 2. Lógica de Delegación: Si no puedo, paso al siguiente
        else if (siguienteAprobador != null) {
            System.out.printf("%s no puede aprobar $%d (Límite: $%d). Pasando al siguiente...\n",
                    getCargo(), monto, getLimiteAprobacion());

            // Llamada recursiva al siguiente eslabón
            return siguienteAprobador.solicitarAprobacion(monto);
        }

        // 3. Fin de la Cadena: Si no hay nadie más
        else {
            return String.format("RECHAZADO. Ningún aprobador tiene el límite suficiente para aprobar $%d.", monto);
        }
    }
}
