## Propósito:

**Proxy** es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador de posición para otro objeto. Un proxy controla el acceso al objeto original, permitiéndote hacer algo antes o después de que la solicitud llegue al objeto original.

## Problema:

¿Cómo podemos proporcionar un sustituto o marcador de posición (placeholder) para otro objeto (el sujeto real) con el fin de controlar el acceso, diferir su inicialización o añadirle comportamientos de gestión?

## Solución:

El patrón Proxy introduce un objeto **Sustituto** (el Proxy) que tiene la misma interfaz que el **Sujeto Real**. El Proxy intercepta las llamadas del cliente y añade una capa de lógica antes de delegar la ejecución al objeto real.

## Aplicabilidad:

* Inicialización diferida (proxy virtual). Es cuando tienes un objeto de servicio muy pesado que utiliza muchos recursos del sistema al estar siempre funcionando, aunque solo lo necesites de vez en cuando.


* Control de acceso (proxy de protección). Es cuando quieres que únicamente clientes específicos sean capaces de utilizar el objeto de servicio, por ejemplo, cuando tus objetos son partes fundamentales de un sistema operativo y los clientes son varias aplicaciones lanzadas (incluyendo maliciosas).


* Ejecución local de un servicio remoto (proxy remoto). Es cuando el objeto de servicio se ubica en un servidor remoto.


* Solicitudes de registro (proxy de registro). Es cuando quieres mantener un historial de solicitudes al objeto de servicio.


* Resultados de solicitudes en caché (proxy de caché). Es cuando necesitas guardar en caché resultados de solicitudes de clientes y gestionar el ciclo de vida de ese caché, especialmente si los resultados son muchos.


* Referencia inteligente. Es cuando debes ser capaz de desechar un objeto pesado una vez que no haya clientes que lo utilicen.

## Cómo implementarlo:

1. Si no hay una interfaz de servicio preexistente, crea una para que los objetos de proxy y de servicio sean intercambiables. No siempre resulta posible extraer la interfaz de la clase servicio, porque tienes que cambiar todos los clientes del servicio para utilizar esa interfaz. El plan B consiste en convertir el proxy en una subclase de la clase servicio, de forma que herede la interfaz del servicio.


2. Crea la clase proxy. Debe tener un campo para almacenar una referencia al servicio. Normalmente los proxies crean y gestionan el ciclo de vida completo de sus servicios. En raras ocasiones, el cliente pasa un servicio al proxy a través de un constructor.


3. Implementa los métodos del proxy según sus propósitos. En la mayoría de los casos, después de hacer cierta labor, el proxy debería delegar el trabajo a un objeto de servicio.


4. Considera introducir un método de creación que decida si el cliente obtiene un proxy o un servicio real. Puede tratarse de un simple método estático en la clase proxy o de todo un método de fábrica.


5. Considera implementar la inicialización diferida para el objeto de servicio.

## Pros y contras:

✔️ Puedes controlar el objeto de servicio sin que los clientes lo sepan.

✔️ Puedes gestionar el ciclo de vida del objeto de servicio cuando a los clientes no les importa.

✔️ El proxy funciona incluso si el objeto de servicio no está listo o no está disponible.

✔️ **Principio de abierto/cerrado**. Puedes introducir nuevos proxies sin cambiar el servicio o los clientes.

❌ El código puede complicarse ya que debes introducir gran cantidad de clases nuevas.

❌ La respuesta del servicio puede retrasarse.

## Relaciones con otros patrones:

* Con **Adapter** se accede a un objeto existente a través de una interfaz diferente. Con **Proxy**, la interfaz sigue siendo la misma. Con **Decorator** se accede al objeto a través de una interfaz mejorada.


* **Facade** es similar a **Proxy** en el sentido de que ambos pueden almacenar temporalmente una entidad compleja e inicializarla por su cuenta. Al contrario que _Facade_, _Proxy_ tiene la misma interfaz que su objeto de servicio, lo que hace que sean intercambiables


* **Decorator** y **Proxy** tienen estructuras similares, pero propósitos muy distintos. Ambos patrones se basan en el principio de composición, por el que un objeto debe delegar parte del trabajo a otro. La diferencia es que, normalmente, un Proxy gestiona el ciclo de vida de su objeto de servicio por su cuenta, mientras que la composición de los Decoradores siempre está controlada por el cliente