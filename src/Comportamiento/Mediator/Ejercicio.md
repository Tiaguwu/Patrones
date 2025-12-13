Implementaremos el patrón **Mediator** para un sistema simple de control de tráfico aéreo. El Mediador (`ControlTorre`) coordinará la comunicación entre múltiples aeronaves (`Avion`).

Evitar que las aeronaves se comuniquen directamente entre sí. Si un avión cambia su altitud, solo el `ControlTorre` debe saberlo y notificar a los demás si hay riesgo de colisión (simulado).