Implementaremos el patrón **Chain of Responsibility** para un sistema de aprobación de solicitudes de compra, donde el nivel de aprobación requerido depende del monto de la solicitud.

Crear una cadena de aprobadores (Gerente, Director, Vicepresidente) que aprueben solicitudes de compra basadas en el monto de la solicitud, sin que el solicitante sepa qué nivel de gestión lo aprobará.