## Propósito:

**Adapter** es un patrón de diseño estructural que permite la colaboración entre objetos con interfaces incompatibles.

## Problema:

¿Cómo podemos hacer que dos interfaces incompatibles (una que ya tenemos y otra que necesitamos usar) trabajen juntas sin modificar su código fuente?

## Solución:

La solución del patrón Adapter es introducir una clase intermedia (el Adaptador) que traduce las llamadas de tu interfaz a la interfaz de la clase que no puedes o no quieres modificar.

La clase Adaptador se implementa de dos maneras principales:

1. Adaptador de Objeto (Composición): El adaptador contiene una instancia del objeto a adaptar y delega las llamadas traduciendo los nombres de los métodos. (Esta es la forma más común y flexible).

2. Adaptador de Clase (Herencia): El adaptador hereda tanto de la interfaz objetivo como de la clase a adaptar (solo posible en lenguajes que permiten herencia múltiple o cuando se adapta una interfaz).

## Aplicabilidad:

* Utiliza la clase adaptadora cuando quieras usar una clase existente, pero cuya interfaz no sea compatible con el resto del código.

* Utiliza el patrón cuando quieras reutilizar varias subclases existentes que carezcan de alguna funcionalidad común que no pueda añadirse a la superclase.

## Cómo implementarlo:

1. Asegúrate de que tienes al menos dos clases con interfaces incompatibles:

   * Una útil clase servicio que no puedes cambiar (a menudo de un tercero, heredada o con muchas dependencias existentes).
   * Una o varias clases cliente que se beneficiarían de contar con una clase de servicio.
   

2. Declara la interfaz con el cliente y describe el modo en que las clases cliente se comunican con la clase de servicio.


3. Crea la clase adaptadora y haz que siga la interfaz con el cliente. Deja todos los métodos vacíos por ahora.


4. Añade un campo a la clase adaptadora para almacenar una referencia al objeto de servicio. La práctica común es inicializar este campo a través del constructor, pero en ocasiones es adecuado pasarlo al adaptador cuando se invocan sus métodos.


5. Uno por uno, implementa todos los métodos de la interfaz con el cliente en la clase adaptadora. La clase adaptadora deberá delegar la mayor parte del trabajo real al objeto de servicio, gestionando tan solo la interfaz o la conversión de formato de los datos.


6. Las clases cliente deberán utilizar la clase adaptadora a través de la interfaz con el cliente. Esto te permitirá cambiar o extender las clases adaptadoras sin afectar al código cliente.

## Pros y contras:

✔️ **Principio de responsabilidad única**. Puedes separar la interfaz o el código de conversión de datos de la lógica de negocio primaria del programa.

✔️ **Principio de abierto/cerrado**. Puedes introducir nuevos tipos de adaptadores al programa sin descomponer el código cliente existente, siempre y cuando trabajen con los adaptadores a través de la interfaz con el cliente.

❌ La complejidad general del código aumenta, ya que debes introducir un grupo de nuevas interfaces y clases. En ocasiones resulta más sencillo cambiar la clase de servicio de modo que coincida con el resto de tu código.

## Relaciones con otros patrones:

* **Bridge** suele diseñarse por anticipado, lo que te permite desarrollar partes de una aplicación de forma independiente entre sí. Por otro lado, **Adapter** se utiliza habitualmente con una aplicación existente para hacer que unas clases que de otro modo serían incompatibles, trabajen juntas sin problemas.


* **Adapter** proporciona una interfaz completamente diferente para acceder a un objeto existente. Por otro lado, con el patrón **Decorator** la interfaz permanece igual o se amplía. Además, _Decorator_ admite la composición recursiva, que no es posible cuando se utiliza _Adapter_.


* Con **Adapter** se accede a un objeto existente a través de una interfaz diferente. Con **Proxy**, la interfaz sigue siendo la misma. Con **Decorator** se accede al objeto a través de una interfaz mejorada.


* **Facade** define una nueva interfaz para objetos existentes, mientras que **Adapter** intenta hacer que la interfaz existente sea utilizable. Normalmente _Adapter_ sólo envuelve un objeto, mientras que _Facade_ trabaja con todo un subsistema de objetos.


* **Bridge**, **State**, **Strategy** (y, hasta cierto punto, **Adapter**) tienen estructuras muy similares. De hecho, todos estos patrones se basan en la composición, que consiste en delegar trabajo a otros objetos. Sin embargo, todos ellos solucionan problemas diferentes. Un patrón no es simplemente una receta para estructurar tu código de una forma específica. También puede comunicar a otros desarrolladores el problema que resuelve.