## Propósito:

**Bridge** es un patrón de diseño estructural que te permite dividir una clase grande, o un grupo de clases estrechamente relacionadas, en dos jerarquías separadas (abstracción e implementación) que pueden desarrollarse independientemente la una de la otra.

## Problema:

¿Cómo podemos evitar un acoplamiento permanente entre una abstracción (la interfaz de alto nivel que el cliente usa) y su implementación (la lógica de bajo nivel), permitiendo que ambas varíen y evolucionen de forma independiente?

## Solución:

El patrón Bridge divide la clase monolítica en dos jerarquías separadas (Abstracción e Implementación) y establece un puente (la composición) entre ellas.

## Aplicabilidad:

* Utiliza el patrón Bridge cuando quieras dividir y organizar una clase monolítica que tenga muchas variantes de una sola funcionalidad (por ejemplo, si la clase puede trabajar con diversos servidores de bases de datos).


* Utiliza el patrón cuando necesites extender una clase en varias dimensiones ortogonales (independientes).


* Utiliza el patrón Bridge cuando necesites poder cambiar implementaciones durante el tiempo de ejecución.

## Cómo implementarlo:

1. Identifica las dimensiones ortogonales de tus clases. Estos conceptos independientes pueden ser: abstracción/plataforma, dominio/infraestructura, front end/back end, o interfaz/implementación.


2. Comprueba qué operaciones necesita el cliente y defínelas en la clase base de abstracción.


3. Determina las operaciones disponibles en todas las plataformas. Declara aquellas que necesite la abstracción en la interfaz general de implementación.


4. Crea clases concretas de implementación para todas las plataformas de tu dominio, pero asegúrate de que todas sigan la interfaz de implementación.


5. Dentro de la clase de abstracción añade un campo de referencia para el tipo de implementación. La abstracción delega la mayor parte del trabajo al objeto de la implementación referenciado en ese campo.


6. Si tienes muchas variantes de lógica de alto nivel, crea abstracciones refinadas para cada variante extendiendo la clase base de abstracción.


7. El código cliente debe pasar un objeto de implementación al constructor de la abstracción para asociar el uno con el otro. Después, el cliente puede ignorar la implementación y trabajar solo con el objeto de la abstracción

## Pros y contras:

✔️ Puedes crear clases y aplicaciones independientes de plataforma.

✔️ El código cliente funciona con abstracciones de alto nivel. No está expuesto a los detalles de la plataforma.

✔️ **Principio de abierto/cerrado**. Puedes introducir nuevas abstracciones e implementaciones independientes entre sí.

✔️ **Principio de responsabilidad única**. Puedes centrarte en la lógica de alto nivel en la abstracción y en detalles de la plataforma en la implementación.

❌ Puede ser que el código se complique si aplicas el patrón a una clase muy cohesionada.

## Relaciones con otros patrones:

* **Bridge** suele diseñarse por anticipado, lo que te permite desarrollar partes de una aplicación de forma independiente entre sí. Por otro lado, **Adapter** se utiliza habitualmente con una aplicación existente para hacer que unas clases que de otro modo serían incompatibles, trabajen juntas sin problemas.


* **Bridge**, **State**, **Strategy** (y, hasta cierto punto, **Adapter**) tienen estructuras muy similares. De hecho, todos estos patrones se basan en la composición, que consiste en delegar trabajo a otros objetos. Sin embargo, todos ellos solucionan problemas diferentes. Un patrón no es simplemente una receta para estructurar tu código de una forma específica. También puede comunicar a otros desarrolladores el problema que resuelve.


* Puedes utilizar **Abstract Factory** junto a **Bridge**. Este emparejamiento resulta útil cuando algunas abstracciones definidas por Bridge sólo pueden funcionar con implementaciones específicas. En este caso, Abstract Factory puede encapsular estas relaciones y esconder la complejidad al código cliente.


* Puedes combinar **Builder** con **Bridge**: la clase directora juega el papel de la abstracción, mientras que diferentes constructoras actúan como implementaciones.