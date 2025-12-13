## Propósito:

**Visitor** es un patrón de diseño de comportamiento que te permite separar algoritmos de los objetos sobre los que operan.

## Problema:

¿Cómo podemos añadir nuevas operaciones (algoritmos) a una jerarquía de clases existente (la estructura de objetos) sin modificar esas clases, manteniendo el Principio Abierto/Cerrado?

## Solución:

El patrón Visitor introduce una clase separada (el Visitante) que contiene todas las operaciones que se desean aplicar a la estructura de objetos.

## Aplicabilidad:

* Utiliza el patrón Visitor cuando necesites realizar una operación sobre todos los elementos de una compleja estructura de objetos (por ejemplo, un árbol de objetos).


* Utiliza el patrón Visitor para limpiar la lógica de negocio de comportamientos auxiliares.


* Utiliza el patrón cuando un comportamiento solo tenga sentido en algunas clases de una jerarquía de clases, pero no en otras.

## Cómo implementarlo:

1. Declara la interfaz visitante con un grupo de métodos “visitantes”, uno por cada clase de elemento concreto existente en el programa.


2. Declara la interfaz de elemento. Si estás trabajando con una jerarquía de clases de elemento existente, añade el método abstracto de “aceptación” a la clase base de la jerarquía. Este método debe aceptar un objeto visitante como argumento.


3. Implementa los métodos de aceptación en todas las clases de elemento concreto. Estos métodos simplemente deben redirigir la llamada a un método visitante en el objeto visitante entrante que coincida con la clase del elemento actual.


4. Las clases de elemento sólo deben funcionar con visitantes a través de la interfaz visitante. Los visitantes, sin embargo, deben conocer todas las clases de elemento concreto, referenciadas como tipos de parámetro de los métodos de visita.


5. Por cada comportamiento que no pueda implementarse dentro de la jerarquía de elementos, crea una nueva clase concreta visitante e implementa todos los métodos visitantes.

    Puede que te encuentres una situación en la que el visitante necesite acceso a algunos miembros privados de la clase elemento. En este caso, puedes hacer estos campos o métodos públicos, violando la encapsulación del elemento, o anidar la clase visitante en la clase elemento. Esto último sólo es posible si tienes la suerte de trabajar con un lenguaje de programación que soporte clases anidadas.


6. El cliente debe crear objetos visitantes y pasarlos dentro de elementos a través de métodos de “aceptación”.

## Pros y contras:

✔️ **Principio de abierto/cerrado**. Puedes introducir un nuevo comportamiento que puede funcionar con objetos de clases diferentes sin cambiar esas clases.

✔️ **Principio de responsabilidad única**. Puedes tomar varias versiones del mismo comportamiento y ponerlas en la misma clase.

✔️ Un objeto visitante puede acumular cierta información útil mientras trabaja con varios objetos. Esto puede resultar útil cuando quieras atravesar una compleja estructura de objetos, como un árbol de objetos, y aplicar el visitante a cada objeto de esa estructura.

❌ Debes actualizar todos los visitantes cada vez que una clase se añada o elimine de la jerarquía de elementos.

❌ Los visitantes pueden carecer del acceso necesario a los campos y métodos privados de los elementos con los que se supone que deben trabajar.

## Relaciones con otros patrones:

* Puedes tratar a **Visitor** como una versión potente del patrón **Command**. Sus objetos pueden ejecutar operaciones sobre varios objetos de distintas clases.


* Puedes utilizar el patrón **Visitor** para ejecutar una operación sobre un árbol **Composite** entero.


* Puedes utilizar **Visitor** junto con **Iterator** para recorrer una estructura de datos compleja y ejecutar alguna operación sobre sus elementos, incluso aunque todos tengan clases distintas.