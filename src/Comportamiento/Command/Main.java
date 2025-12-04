package Comportamiento.Command;

public class Main {
    public static void main(String[] args) {
        // 1. Crear Receptores
        Luz luzSala = new Luz("Sala");
        Termostato termoCocina = new Termostato("Cocina");

        // 2. Crear Comandos
        IComando encenderSala = new ComandoEncenderLuz(luzSala);
        IComando subirTemp = new ComandoSubirTemperatura(termoCocina);

        // 3. Crear Invocador
        ControlRemoto control = new ControlRemoto();

        // 4. Programar y Ejecutar (Botón hace: Encender Luz)
        control.setComando(encenderSala);
        System.out.println("Boton 1 Programado: " + control.presionarBoton());

        // 5. Reprogramar y Ejecutar (Mismo Botón hace: Subir Temperatura)
        control.setComando(subirTemp);
        System.out.println("Boton 1 Reprogramado: " + control.presionarBoton());
    }
}
