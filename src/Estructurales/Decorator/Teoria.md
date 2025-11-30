## Propósito:

**Decorator** es un patrón de diseño estructural que te permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.

## Problema:

¿Cómo podemos añadir nuevas responsabilidades o funcionalidades a un objeto individual de forma dinámica y flexible, sin modificar su clase original y sin crear una explosión de subclases para cada combinación de características?

## Solución:

El patrón Decorator proporciona una solución envolviendo (decorando) el objeto original con un objeto Decorador que tiene la misma interfaz que el objeto envuelto. 

## Aplicabilidad:

* Utiliza el patrón Decorator cuando necesites asignar funcionalidades adicionales a objetos durante el tiempo de ejecución sin descomponer el código que utiliza esos objetos.


* Utiliza el patrón cuando resulte extraño o no sea posible extender el comportamiento de un objeto utilizando la herencia.

## Cómo implementarlo:

1. Asegúrate de que tu dominio de negocio puede representarse como un componente primario con varias capas opcionales encima.


2. Decide qué métodos son comunes al componente primario y las capas opcionales. Crea una interfaz de componente y declara esos métodos en ella.


3. Crea una clase concreta de componente y define en ella el comportamiento base.


4. Crea una clase base decoradora. Debe tener un campo para almacenar una referencia a un objeto envuelto. El campo debe declararse con el tipo de interfaz de componente para permitir la vinculación a componentes concretos, así como a decoradores. La clase decoradora base debe delegar todas las operaciones al objeto envuelto.


5. Asegúrate de que todas las clases implementan la interfaz de componente.


6. Crea decoradores concretos extendiéndolos a partir de la decoradora base. Un decorador concreto debe ejecutar su comportamiento antes o después de la llamada al método padre (que siempre delega al objeto envuelto).


7. El código cliente debe ser responsable de crear decoradores y componerlos del modo que el cliente necesite.

## Pros y contras:

✔️ Puedes extender el comportamiento de un objeto sin crear una nueva subclase.

✔️ Puedes añadir o eliminar responsabilidades de un objeto durante el tiempo de ejecución

✔️ Puedes combinar varios comportamientos envolviendo un objeto con varios decoradores.

✔️ **Principio de responsabilidad única**. Puedes dividir una clase monolítica que implementa muchas variantes posibles de comportamiento, en varias clases más pequeñas.

❌ Resulta difícil eliminar un wrapper específico de la pila de wrappers.

❌ Es difícil implementar un decorador de tal forma que su comportamiento no dependa del orden en la pila de decoradores.

❌ El código de configuración inicial de las capas pueden tener un aspecto desagradable.

## Relaciones con otros patrones:

* **Adapter** proporciona una interfaz completamente diferente para acceder a un objeto existente. Por otro lado, con el patrón **Decorator** la interfaz permanece igual o se amplía. Además, _Decorator_ admite la composición recursiva, que no es posible cuando se utiliza _Adapter_.


* Con **Adapter** se accede a un objeto existente a través de una interfaz diferente. Con **Proxy**, la interfaz sigue siendo la misma. Con **Decorator** se accede al objeto a través de una interfaz mejorada.


* **Chain of Responsibility** y **Decorator** tienen estructuras de clase muy similares. Ambos patrones se basan en la composición recursiva para pasar la ejecución a través de una serie de objetos. Sin embargo, existen varias diferencias fundamentales:

    Los manejadores de CoR pueden ejecutar operaciones arbitrarias con independencia entre sí. También pueden dejar de pasar la solicitud en cualquier momento. Por otro lado, varios decoradores pueden extender el comportamiento del objeto manteniendo su consistencia con la interfaz base. Además, los decoradores no pueden romper el flujo de la solicitud.


* **Composite** y **Decorator** tienen diagramas de estructura similares ya que ambos se basan en la composición recursiva para organizar un número indefinido de objetos.

    Un Decorator es como un Composite pero sólo tiene un componente hijo. Hay otra diferencia importante: Decorator añade responsabilidades adicionales al objeto envuelto, mientras que Composite se limita a “recapitular” los resultados de sus hijos.

    No obstante, los patrones también pueden colaborar: puedes utilizar el Decorator para extender el comportamiento de un objeto específico del árbol Composite.


* Los diseños que hacen un uso amplio de **Composite** y **Decorator** a menudo pueden beneficiarse del uso del **Prototype**. Aplicar el patrón te permite clonar estructuras complejas en lugar de reconstruirlas desde cero.


* **Decorator** te permite cambiar la piel de un objeto, mientras que **Strategy** te permite cambiar sus entrañas.


* **Decorator** y **Proxy** tienen estructuras similares, pero propósitos muy distintos. Ambos patrones se basan en el principio de composición, por el que un objeto debe delegar parte del trabajo a otro. La diferencia es que, normalmente, un Proxy gestiona el ciclo de vida de su objeto de servicio por su cuenta, mientras que la composición de los Decoradores siempre está controlada por el cliente.