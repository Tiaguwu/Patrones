## Propósito:

**Chain of Responsibility** es un patrón de diseño de comportamiento que te permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena.

## Problema:

¿Cómo podemos enviar una solicitud a uno o más objetos de una cadena sin acoplar el emisor a ninguno de los receptores específicos, permitiendo que varios objetos tengan la oportunidad de manejar la solicitud?

## Solución:

El patrón CoR pasa la solicitud a lo largo de una cadena de objetos. Cada objeto en la cadena decide si procesa la solicitud o si la pasa al siguiente objeto.

## Aplicabilidad:

* Utiliza el patrón Chain of Responsibility cuando tu programa deba procesar distintos tipos de solicitudes de varias maneras, pero los tipos exactos de solicitudes y sus secuencias no se conozcan de antemano.


* Utiliza el patrón cuando sea fundamental ejecutar varios manejadores en un orden específico.


* Utiliza el patrón Chain of Responsibility cuando el grupo de manejadores y su orden deban cambiar durante el tiempo de ejecución.

## Cómo implementarlo:

1. Declara la interfaz manejadora y describe la firma de un método para manejar solicitudes.

    Decide cómo pasará el cliente la información de la solicitud dentro del método. La forma más flexible consiste en convertir la solicitud en un objeto y pasarlo al método de gestión como argumento.


2. Para eliminar código boilerplate duplicado en manejadores concretos, puede merecer la pena crear una clase manejadora abstracta base, derivada de la interfaz manejadora.

    Esta clase debe tener un campo para almacenar una referencia al siguiente manejador de la cadena. Considera hacer la clase inmutable. No obstante, si planeas modificar las cadenas durante el tiempo de ejecución, deberás definir un modificador (setter) para alterar el valor del campo de referencia.

    También puedes implementar el comportamiento por defecto conveniente para el método de control, que consiste en reenviar la solicitud al siguiente objeto, a no ser que no quede ninguno. Los manejadores concretos podrán utilizar este comportamiento invocando al método padre.


3. Una a una, crea subclases manejadoras concretas e implementa los métodos de control. Cada manejador debe tomar dos decisiones cuando recibe una solicitud:

   * Si procesa la solicitud.
   * Si pasa la solicitud al siguiente eslabón de la cadena.
   
   
4. El cliente puede ensamblar cadenas por su cuenta o recibir cadenas prefabricadas de otros objetos. En el último caso, debes implementar algunas clases fábrica para crear cadenas de acuerdo con los ajustes de configuración o de entorno.


5. El cliente puede activar cualquier manejador de la cadena, no solo el primero. La solicitud se pasará a lo largo de la cadena hasta que algún manejador se rehúse a pasarlo o hasta que llegue al final de la cadena.


6. Debido a la naturaleza dinámica de la cadena, el cliente debe estar listo para gestionar los siguientes escenarios:

   * La cadena puede consistir en un único vínculo.
   * Algunas solicitudes pueden no llegar al final de la cadena.
   * Otras pueden llegar hasta el final de la cadena sin ser gestionadas.

## Pros y contras:

✔️ Puedes controlar el orden de control de solicitudes.

✔️ **Principio de responsabilidad única**. Puedes desacoplar las clases que invoquen operaciones de las que realicen operaciones.

✔️ **Principio de abierto/cerrado**. Puedes introducir nuevos manejadores en la aplicación sin descomponer el código cliente existente.

❌ Algunas solicitudes pueden acabar sin ser gestionadas.

## Relaciones con otros patrones:

* **Chain of Responsibility**, **Command**, **Mediator** y **Observer** abordan distintas formas de conectar emisores y receptores de solicitudes:

    * Chain of Responsibility pasa una solicitud secuencialmente a lo largo de una cadena dinámica de receptores potenciales hasta que uno de ellos la gestiona.
    * Command establece conexiones unidireccionales entre emisores y receptores. 
    * Mediator elimina las conexiones directas entre emisores y receptores, forzándolos a comunicarse indirectamente a través de un objeto mediador.
    * Observer permite a los receptores suscribirse o darse de baja dinámicamente a la recepción de solicitudes.
 

* **Chain of Responsibility** se utiliza a menudo junto a **Composite**. En este caso, cuando un componente hoja recibe una solicitud, puede pasarla a lo largo de la cadena de todos los componentes padre hasta la raíz del árbol de objetos.


* Los manejadores del **Chain of Responsibility** se pueden implementar como **Comandos**. En este caso, puedes ejecutar muchas operaciones diferentes sobre el mismo objeto de contexto, representado por una solicitud.

    Sin embargo, hay otra solución en la que la propia solicitud es un objeto Comando. En este caso, puedes ejecutar la misma operación en una serie de contextos diferentes vinculados en una cadena.


* **Chain of Responsibility** y **Decorator** tienen estructuras de clase muy similares. Ambos patrones se basan en la composición recursiva para pasar la ejecución a través de una serie de objetos. Sin embargo, existen varias diferencias fundamentales:

    Los manejadores de CoR pueden ejecutar operaciones arbitrarias con independencia entre sí. También pueden dejar de pasar la solicitud en cualquier momento. Por otro lado, varios decoradores pueden extender el comportamiento del objeto manteniendo su consistencia con la interfaz base. Además, los decoradores no pueden romper el flujo de la solicitud.

