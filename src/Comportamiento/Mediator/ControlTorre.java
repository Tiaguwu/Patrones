package Comportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTorre implements ITorreControl{
    //Mediador concreto

    private final List<Avion> aviones = new ArrayList<>();

    @Override
    public void registrar(Avion avion) {
        aviones.add(avion);
        System.out.println("Torre: Avion " + avion.getNombre() + " registrada.");
    }

    @Override
    public void notificar(Avion emisor, String mensaje) {
        System.out.println("\n[TORRE CONTROL]: Recibido de " + emisor.getNombre() + ": " + mensaje);

        for (Avion receptor : aviones){
            if (receptor != emisor){
                String mensajeCompleto = "Aviso: " + emisor.getNombre() + " reporta " + mensaje;
                if (emisor.getAltitud() > 10000){
                    mensajeCompleto = "ALTA ALTITUD! " + mensajeCompleto;
                }
                receptor.recibirMensaje(mensajeCompleto);
            }
        }
    }
}
