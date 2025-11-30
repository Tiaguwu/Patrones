## Propósito:

**Composite** es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos individuales.

## Problema:

¿Cómo podemos tratar un grupo de objetos de la misma manera que trataríamos a un objeto individual, permitiendo que la composición de objetos forme estructuras jerárquicas tipo "árbol" (parte-todo)?

## Solución:

El patrón Composite proporciona una solución mediante la unificación de interfaces y la recursividad de la composición.

## Aplicabilidad:

* Utiliza el patrón Composite cuando tengas que implementar una estructura de objetos con forma de árbol.


* Utiliza el patrón cuando quieras que el código cliente trate elementos simples y complejos de la misma forma.

## Cómo implementarlo:

1. Asegúrate de que el modelo central de tu aplicación pueda representarse como una estructura de árbol. Intenta dividirlo en elementos simples y contenedores. Recuerda que los contenedores deben ser capaces de contener tanto elementos simples como otros contenedores.


2. Declara la interfaz componente con una lista de métodos que tengan sentido para componentes simples y complejos.


3. Crea una clase hoja para representar elementos simples. Un programa puede tener varias clases hoja diferentes.


4. Crea una clase contenedora para representar elementos complejos. Incluye un campo matriz en esta clase para almacenar referencias a subelementos. La matriz debe poder almacenar hojas y contenedores, así que asegúrate de declararla con el tipo de la interfaz componente.

    Al implementar los métodos de la interfaz componente, recuerda que un contenedor debe delegar la mayor parte del trabajo a los subelementos.


5. Por último, define los métodos para añadir y eliminar elementos hijos dentro del contenedor.

    Ten en cuenta que estas operaciones se pueden declarar en la interfaz componente. Esto violaría el Principio de segregación de la interfaz porque los métodos de la clase hoja estarían vacíos. No obstante, el cliente podrá tratar a todos los elementos de la misma manera, incluso al componer el árbol.

## Pros y contras:

✔️ Puedes trabajar con estructuras de árbol complejas con mayor comodidad: utiliza el polimorfismo y la recursión en tu favor.

✔️ **Principio de abierto/cerrado**. Puedes introducir nuevos tipos de elemento en la aplicación sin descomponer el código existente, que ahora funciona con el árbol de objetos.

❌ Puede resultar difícil proporcionar una interfaz común para clases cuya funcionalidad difiere demasiado. En algunos casos, tendrás que generalizar en exceso la interfaz componente, provocando que sea más difícil de comprender.

## Relaciones con otros patrones:

* Puedes utilizar **Builder** al crear árboles **Composite** complejos porque puedes programar sus pasos de construcción para que funcionen de forma recursiva.


* **Chain of Responsibility** se utiliza a menudo junto a **Composite**. En este caso, cuando un componente hoja recibe una solicitud, puede pasarla a lo largo de la cadena de todos los componentes padre hasta la raíz del árbol de objetos.


* Puedes utilizar **Iteradores** para recorrer árboles **Composite**.


* Puedes utilizar el patrón **Visitor** para ejecutar una operación sobre un árbol **Composite** entero.


* Puedes implementar nodos de hoja compartidos del árbol **Composite** como **Flyweights** para ahorrar memoria RAM.


* **Composite** y **Decorator** tienen diagramas de estructura similares ya que ambos se basan en la composición recursiva para organizar un número indefinido de objetos.

    Un Decorator es como un Composite pero sólo tiene un componente hijo. Hay otra diferencia importante: Decorator añade responsabilidades adicionales al objeto envuelto, mientras que Composite se limita a “recapitular” los resultados de sus hijos.

    No obstante, los patrones también pueden colaborar: puedes utilizar el Decorator para extender el comportamiento de un objeto específico del árbol Composite.


* Los diseños que hacen un uso amplio de **Composite** y **Decorator** a menudo pueden beneficiarse del uso del **Prototype**. Aplicar el patrón te permite clonar estructuras complejas en lugar de reconstruirlas desde cero.