## Propósito:

**Mediator** es un patrón de diseño de comportamiento que te permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.

## Problema:

¿Cómo podemos gestionar y reducir las dependencias complejas (muchas a muchas) y la comunicación directa entre un conjunto de objetos interrelacionados, promoviendo un bajo acoplamiento?

## Solución:

El patrón Mediator introduce una única clase (el Mediador) que centraliza la comunicación entre los objetos Colegas. Los Colegas ya no se conocen directamente; en su lugar, se comunican con el Mediador, y este se encarga de retransmitir y coordinar la acción a los Colegas apropiados.

## Aplicabilidad:

* Utiliza el patrón Mediator cuando resulte difícil cambiar algunas de las clases porque están fuertemente acopladas a un puñado de otras clases.


* Utiliza el patrón cuando no puedas reutilizar un componente en un programa diferente porque sea demasiado dependiente de otros componentes.


* Utiliza el patrón Mediator cuando te encuentres creando cientos de subclases de componente sólo para reutilizar un comportamiento básico en varios contextos.

## Cómo implementarlo:

1. Identifica un grupo de clases fuertemente acopladas que se beneficiarían de ser más independientes (p. ej., para un mantenimiento más sencillo o una reutilización más simple de esas clases).


2. Declara la interfaz mediadora y describe el protocolo de comunicación deseado entre mediadores y otros varios componentes. En la mayoría de los casos, un único método para recibir notificaciones de los componentes es suficiente.

    Esta interfaz es fundamental cuando quieras reutilizar las clases del componente en distintos contextos. Siempre y cuando el componente trabaje con su mediador a través de la interfaz genérica, podrás vincular el componente con una implementación diferente del mediador.


3. Implementa la clase concreta mediadora. Esta clase se beneficiará de almacenar referencias a todos los componentes que gestiona.


4. Puedes ir más lejos y hacer la interfaz mediadora responsable de la creación y destrucción de objetos del componente. Tras esto, la mediadora puede parecerse a una **fábrica** o una **fachada**.


5. Los componentes deben almacenar una referencia al objeto mediador. La conexión se establece normalmente en el constructor del componente, donde un objeto mediador se pasa como argumento.


6. Cambia el código de los componentes de forma que invoquen el método de notificación del mediador en lugar de los métodos de otros componentes. Extrae el código que implique llamar a otros componentes dentro de la clase mediadora. Ejecuta este código cuando el mediador reciba notificaciones de ese componente.

## Pros y contras:

✔️ **Principio de responsabilidad única**. Puedes extraer las comunicaciones entre varios componentes dentro de un único sitio, haciéndolo más fácil de comprender y mantener.

✔️ **Principio de abierto/cerrado**. Puedes introducir nuevos mediadores sin tener que cambiar los propios componentes.

✔️ Puedes reducir el acoplamiento entre varios componentes de un programa.

✔️ Puedes reutilizar componentes individuales con mayor facilidad.

❌ Con el tiempo, un mediador puede evolucionar a un objeto todopoderoso.
