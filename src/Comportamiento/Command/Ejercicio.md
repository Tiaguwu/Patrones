Implementaremos el patrón **Command** para un sistema de automatización del hogar, usando un control remoto universal.

Permitir que un único objeto Invocador (`ControlRemoto`) pueda ejecutar comandos en diferentes Receptores (`Luz`, `Termostato`) sin conocer la lógica de esos receptores.