## Propósito:

**Command** es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud. Esta transformación te permite parametrizar los métodos con diferentes solicitudes, retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden realizar.

## Problema:

¿Cómo podemos encapsular una solicitud de operación (incluyendo el objeto a operar y los parámetros de la operación) como un objeto, para desacoplar el emisor de la solicitud del receptor que la realiza?

## Solución:

El patrón Command introduce una interfaz común (`IComando`) que encapsula la acción y su receptor.

## Aplicabilidad:

* Utiliza el patrón Command cuando quieras parametrizar objetos con operaciones.


* Utiliza el patrón Command cuando quieras poner operaciones en cola, programar su ejecución, o ejecutarlas de forma remota.


* Utiliza el patrón Command cuando quieras implementar operaciones reversibles.

## Cómo implementarlo:

1. Declara la interfaz de comando con un único método de ejecución.


2. Empieza extrayendo solicitudes y poniéndolas dentro de clases concretas de comando que implementen la interfaz de comando. Cada clase debe contar con un grupo de campos para almacenar los argumentos de las solicitudes junto con referencias al objeto receptor. Todos estos valores deben inicializarse a través del constructor del comando.


3. Identifica clases que actúen como emisoras. Añade los campos para almacenar comandos dentro de estas clases. Las emisoras deberán comunicarse con sus comandos tan solo a través de la interfaz de comando. Normalmente las emisoras no crean objetos de comando por su cuenta, sino que los obtienen del código cliente.


4. Cambia las emisoras de forma que ejecuten el comando en lugar de enviar directamente una solicitud al receptor.


5. El cliente debe inicializar objetos en el siguiente orden:

   * Crear receptores.
   * Crear comandos y asociarlos con receptores si es necesario.
   * Crear emisores y asociarlos con comandos específicos.

## Pros y contras:

✔️ **Principio de responsabilidad única**. Puedes desacoplar las clases que invocan operaciones de las que realizan esas operaciones.

✔️ **Principio de abierto/cerrado**. Puedes introducir nuevos comandos en la aplicación sin descomponer el código cliente existente.

✔️ Puedes implementar deshacer/rehacer.

✔️ Puedes implementar la ejecución diferida de operaciones.

✔️ Puedes ensamblar un grupo de comandos simples para crear uno complejo.

❌ El código puede complicarse, ya que estás introduciendo una nueva capa entre emisores y receptores.

## Relaciones con otros patrones:

* **Chain of Responsibility**, **Command**, **Mediator** y **Observer** abordan distintas formas de conectar emisores y receptores de solicitudes:

  * Chain of Responsibility pasa una solicitud secuencialmente a lo largo de una cadena dinámica de receptores potenciales hasta que uno de ellos la gestiona.
  * Command establece conexiones unidireccionales entre emisores y receptores.
  * Mediator elimina las conexiones directas entre emisores y receptores, forzándolos a comunicarse indirectamente a través de un objeto mediador.
  * Observer permite a los receptores suscribirse o darse de baja dinámicamente a la recepción de solicitudes.


* Los manejadores del **Chain of Responsibility** se pueden implementar como **Comandos**. En este caso, puedes ejecutar muchas operaciones diferentes sobre el mismo objeto de contexto, representado por una solicitud.

    Sin embargo, hay otra solución en la que la propia solicitud es un objeto Comando. En este caso, puedes ejecutar la misma operación en una serie de contextos diferentes vinculados en una cadena.


* Puedes utilizar **Command** y **Memento** juntos cuando implementes “deshacer”. En este caso, los comandos son responsables de realizar varias operaciones sobre un objeto destino, mientras que los mementos guardan el estado de ese objeto justo antes de que se ejecute el comando.


* **Command** y **Strategy** pueden resultar similares porque puedes usar ambos para parametrizar un objeto con cierta acción. No obstante, tienen propósitos muy diferentes.

  * Puedes utilizar Command para convertir cualquier operación en un objeto. Los parámetros de la operación se convierten en campos de ese objeto. La conversión te permite aplazar la ejecución de la operación, ponerla en cola, almacenar el historial de comandos, enviar comandos a servicios remotos, etc.
  * Por su parte, Strategy normalmente describe distintas formas de hacer lo mismo, permitiéndote intercambiar estos algoritmos dentro de una única clase contexto.


* **Prototype** puede ayudar a cuando necesitas guardar copias de **Comandos** en un historial.


* Puedes tratar a **Visitor** como una versión potente del patrón Command. Sus objetos pueden ejecutar operaciones sobre varios objetos de distintas clases.