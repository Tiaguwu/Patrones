## Propósito:

**Flyweight** es un patrón de diseño estructural que te permite mantener más objetos dentro de la cantidad disponible de RAM compartiendo las partes comunes del estado entre varios objetos en lugar de mantener toda la información en cada objeto.

## Problema:

¿Cómo podemos soportar la creación de una enorme cantidad de objetos a pequeña escala, cuando muchos de esos objetos comparten la mayoría de sus datos (su estado intrínseco), para evitar el consumo excesivo de memoria?

## Solución:

El patrón Flyweight resuelve esto **separando el estado compartido (intrínseco) del estado único (extrínseco)**.

## Aplicabilidad:

* Utiliza el patrón Flyweight únicamente cuando tu programa deba soportar una enorme cantidad de objetos que apenas quepan en la RAM disponible.

## Cómo implementarlo:

1. Divide los campos de una clase que se convertirá en flyweight en dos partes:

   * el estado intrínseco: los campos que contienen información invariable duplicada a través de varios objetos
   * el estado extrínseco: los campos que contienen información contextual única de cada objeto
   

2. Deja los campos que representan el estado intrínseco en la clase, pero asegúrate de que sean inmutables. Deben llevar sus valores iniciales únicamente dentro del constructor.


3. Repasa los métodos que utilizan campos del estado extrínseco. Para cada campo utilizado en el método, introduce un nuevo parámetro y utilízalo en lugar del campo.


4. Opcionalmente, crea una clase fábrica para gestionar el grupo de objetos flyweight, buscando uno existente antes de crear uno nuevo. Una vez que la fábrica esté en su sitio, los clientes sólo deberán solicitar objetos flyweight a través de ella. Deberán describir el flyweight deseado pasando su estado intrínseco a la fábrica.


5. El cliente deberá almacenar o calcular valores del estado extrínseco (contexto) para poder invocar métodos de objetos flyweight. Por comodidad, el estado extrínseco puede moverse a una clase contexto separada junto con el campo referenciador del flyweight.

## Pros y contras:

✔️ Puedes ahorrar mucha RAM, siempre que tu programa tenga toneladas de objetos similares.

❌ Puede que estés cambiando RAM por ciclos CPU cuando deba calcularse de nuevo parte de la información de contexto cada vez que alguien invoque un método flyweight.

❌ El código se complica mucho. Los nuevos miembros del equipo siempre estarán preguntándose por qué el estado de una entidad se separó de tal manera.

## Relaciones con otros patrones:

* Puedes implementar nodos de hoja compartidos del árbol **Composite** como **Flyweights** para ahorrar memoria RAM.


* **Flyweight** muestra cómo crear muchos pequeños objetos, mientras que **Facade** muestra cómo crear un único objeto que represente un subsistema completo.


* **Flyweight** podría asemejarse a **Singleton** si de algún modo pudieras reducir todos los estados compartidos de los objetos a un único objeto flyweight. Pero existen dos diferencias fundamentales entre estos patrones:

  1. Solo debe haber una instancia Singleton, mientras que una clase Flyweight puede tener varias instancias con distintos estados intrínsecos.
  2. El objeto Singleton puede ser mutable. Los objetos flyweight son inmutables.
