## Propósito:

**Builder** es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.

## Problema:

¿Cómo podemos construir objetos complejos paso a paso y de manera inmutable, sin que el constructor de la clase tenga un número excesivo de parámetros (telescopic constructor) o sin que el cliente tenga que conocer el orden de construcción de todas las partes?

## Solución:

El patrón Builder extrae el código de construcción del objeto a clases separadas llamadas Constructores (Builders).

## Aplicabilidad:

* Utiliza el patrón Builder para evitar un “constructor telescópico”.


* Utiliza el patrón Builder cuando quieras que el código sea capaz de crear distintas representaciones de ciertos productos (por ejemplo, casas de piedra y madera).


* Utiliza el patrón Builder para construir árboles con el patrón Composite u otros objetos complejos.

## Cómo implementarlo:

1. Asegúrate de poder definir claramente los pasos comunes de construcción para todas las representaciones disponibles del producto. De lo contrario, no podrás proceder a implementar el patrón.


2. Declara estos pasos en la interfaz constructora base.


3. Crea una clase constructora concreta para cada una de las representaciones de producto e implementa sus pasos de construcción.

    No olvides implementar un método para extraer el resultado de la construcción. La razón por la que este método no se puede declarar dentro de la interfaz constructora es que varios constructores pueden construir productos sin una interfaz común. Por lo tanto, no sabemos cuál será el tipo de retorno para un método como éste. No obstante, si trabajas con productos de una única jerarquía, el método de extracción puede añadirse sin problemas a la interfaz base.


4. Piensa en crear una clase directora. Puede encapsular varias formas de construir un producto utilizando el mismo objeto constructor.


5. El código cliente crea tanto el objeto constructor como el director. Antes de que empiece la construcción, el cliente debe pasar un objeto constructor al director. Normalmente, el cliente hace esto sólo una vez, mediante los parámetros del constructor del director. El director utiliza el objeto constructor para el resto de la construcción. Existe una manera alternativa, en la que el objeto constructor se pasa directamente al método de construcción del director.


6. El resultado de la construcción tan solo se puede obtener directamente del director si todos los productos siguen la misma interfaz. De lo contrario, el cliente deberá extraer el resultado del constructor.

## Pros y contras:

✔️ Puedes construir objetos paso a paso, aplazar pasos de la construcción o ejecutar pasos de forma recursiva.

✔️ Puedes reutilizar el mismo código de construcción al construir varias representaciones de productos.

✔️ **Principio de responsabilidad única**. Puedes aislar un código de construcción complejo de la lógica de negocio del producto.

❌ La complejidad general del código aumenta, ya que el patrón exige la creación de varias clases nuevas.

## Relaciones con otros patrones:

* Muchos diseños empiezan utilizando el **Factory Method** (menos complicado y más personalizable mediante las subclases) y evolucionan hacia **Abstract Factory**, **Prototype**, o **Builder** (más flexibles, pero más complicados).


* **Builder** se enfoca en construir objetos complejos, paso a paso. **Abstract Factory** se especializa en crear familias de objetos relacionados. Abstract Factory devuelve el producto inmediatamente, mientras que Builder te permite ejecutar algunos pasos adicionales de construcción antes de extraer el producto.


* Puedes utilizar **Builder** al crear árboles **Composite** complejos porque puedes programar sus pasos de construcción para que funcionen de forma recursiva.


* Puedes combinar **Builder** con **Bridge**: la clase directora juega el papel de la abstracción, mientras que diferentes constructoras actúan como implementaciones.


* Los patrones **Abstract Factory**, **Builder** y **Prototype** pueden todos ellos implementarse como **Singletons**.