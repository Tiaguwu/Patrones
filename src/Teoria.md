### I. Introducción: ¿Qué es un Patrón de Diseño?

En el desarrollo de software, un Patrón de Diseño es una solución probada, elegante y reutilizable a un problema recurrente en un contexto específico. No son bibliotecas o fragmentos de código, sino guías abstractas que ayudan a estructurar y organizar el código.

**Importancia de los Patrones**

El uso de patrones mejora significativamente la calidad del software, ya que:

* **Estandarizan** la forma en que se resuelven problemas comunes, haciendo el código más legible.

* Incrementan la **reutilización** y la **flexibilidad** del sistema.

* Facilitan la **mantenibilidad** al reducir el acoplamiento y aumentar la cohesión.

### II. Nivel Conceptual: Los Patrones GRASP

**GRASP** (General Responsibility Assignment Software Patterns) son un conjunto de **nueve principios** de diseño que sirven como un kit de herramientas mentales para ayudar a los desarrolladores a tomar decisiones sobre **cómo asignar responsabilidades** a las clases y objetos.

Son el punto de partida del diseño orientado a objetos, guiándonos hacia sistemas con **Bajo Acoplamiento** y **Alta Cohesión**.

**Principios Fundamentales**

1. **Experto en la Información** (Information Expert)

   * **Concepto**: La responsabilidad de llevar a cabo una acción o almacenar un dato debe recaer en la clase que posee la **mayor parte de la información** necesaria para esa tarea.
   * **Beneficio**: Promueve la encapsulación, pues el comportamiento está cerca de los datos que manipula.

2. **Creador** (Creator)

   * **Concepto**: Asigna la responsabilidad de crear un objeto `A` a la clase `B` si `B` contiene, agrega, o utiliza estrechamente a `A`.
   * **Beneficio**: Mantiene el acoplamiento bajo al asignar la creación a un objeto que ya está naturalmente relacionado con el objeto creado.


3. **Bajo Acoplamiento** (Low Coupling)

   * **Concepto**: Se trata de una **métrica de evaluación**. El objetivo es minimizar las dependencias y la interconexión entre las clases. Un cambio en una clase debería tener un impacto mínimo o nulo en las demás.
   * **Beneficio**: Incrementa la reusabilidad, la mantenibilidad y la resistencia al cambio.


4. **Alta Cohesión** (High Cohesion)

   * **Concepto**: El primer objeto más allá de la interfaz de usuario que recibe y coordina la solicitud de una operación del sistema (por ejemplo, gestionar un evento de clic o una petición HTTP).
   * **Beneficio**: Las clases son más fáciles de entender, mantener y probar unitariamente.


5. **Controlador** (Controller)

   * **Concepto**: El primer objeto más allá de la interfaz de usuario que recibe y coordina la solicitud de una operación del sistema (por ejemplo, gestionar un evento de clic o una petición HTTP).
   * **Beneficio**: Separa la lógica de negocio de la interfaz de usuario y permite la reutilización de la lógica para diferentes canales de entrada.

### III. Nivel Concreto: Los Patrones de Diseño (GoF)

Los **Patrones de Diseño del GoF** (Gang of Four), formalizados por Erich Gamma, Richard Helm, Ralph Johnson y John Vlissides, son 23 soluciones específicas y probadas para problemas de diseño de software. Estos patrones se implementan directamente en el código para lograr estructuras flexibles.

Se clasifican en tres categorías según su enfoque:

1. **Patrones Creacionales**: Se enfocan en cómo se crean los objetos, encapsulando el proceso de instanciación para que el sistema sea independiente de cómo se crean, componen y representan sus objetos.


2. **Patrones Estructurales**: Se ocupan de la forma en que las clases y los objetos se componen para formar estructuras más grandes y flexibles.


3. **Patrones de Comportamiento**: Se centran en la comunicación, los algoritmos y la asignación de responsabilidades entre los objetos.

### IV. Relación y Diferencias Clave

La distinción más importante radica en que los GRASP son **principios de diseño** mientras que los GoF son **soluciones implementables**.

**El Flujo de Trabajo del Diseño**

Los GRASP y los GoF operan en diferentes momentos del proceso de diseño:

1. **Fase de Análisis/Diseño Conceptual**: El desarrollador aplica los GRASP (como Experto y Creador) para decidir qué objetos necesita y cómo deben distribuirse las responsabilidades.


2. **Fase de Implementación/Diseño Estructural**: Cuando el desarrollador identifica un problema estructural complejo (por ejemplo, cómo manejar múltiples variaciones de un algoritmo), recurre a un patrón GoF (Strategy, Factory) para resolverlo.

**Tabla Comparativa**

| Característica | Patrones GRASP | Patrones de Diseño (GoF) |
|:-:|:-:|:-:|
| **Nivel de Abstracción** | **Alto** (Principios conceptuales). | **Medio/Bajo** (Estructuras concretas). |
| **Propósito Principal** | Guiar la **Asignación de Responsabilidades** para una buena calidad DOO. | Proporcionar **Estructuras de Solución** reutilizables para problemas conocidos. |
| **Naturaleza** | **Heurística** (Guía de pensamiento). | **Recetario** (Plano de implementación). |
| **Relación con GoF** | Son los cimientos. Un patrón GoF a menudo es el **resultado** de aplicar uno o más principios GRASP. | Son soluciones de alto nivel. Usan los principios GRASP para su estructura interna (ej. bajo acoplamiento). |

### V. Guía rápida mental

Para identificar un patrón, siempre debes mirar qué es lo que varía o qué es lo que genera **conflicto** en el diseño.

Preguntas clave para los patrones GoF más importantes:

#### Patrones Creacionales (¿Cómo creo los objetos?)
* ¿La creación requiere muchos pasos o configuraciones opcionales? $\rightarrow$ **Builder**.


* ¿Necesito una única instancia global de algo $\rightarrow$ **Singleton**.


* ¿Debo crear familias de objetos que deben trabajar juntos sin decir sus nombres de clase? $\rightarrow$ **Abstract Factory**.


* ¿Quiero que mis subclases decidan qué objeto instanciar? $\rightarrow$ **Factory Method**.


* ¿Necesito crear objetos nuevos copiando o clonando una instancia existente en lugar de crear una desde cero? $\rightarrow$ **Prototype**.

#### Patrones Estructurales (¿Cómo organizo mis clases?)

* ¿Tengo dos interfaces que no encajan pero necesito que trabajen juntas? $\rightarrow$ **Adapter**.


* ¿Quiero agregar funciones a un objeto en tiempo de ejecución sin usar herencia? $\rightarrow$ **Decorator**.


* ¿Tengo un sistema muy complejo y quiero darle al usuario una cara simple para usarlo? $\rightarrow$ **Facade**.


* ¿Necesito separar una abstracción de su implementación para que ambas puedan variar de forma independiente? $\rightarrow$ **Bridge**.


* ¿Tengo muchísimos objetos similares que consumen mucha memoria y quiero compartir la parte común entre ellos? $\rightarrow$ **Flyweight**.


* ¿Necesito un sustituto o intermediario para controlar el acceso a otro objeto (por seguridad, carga perezosa o control remoto)? $\rightarrow$ **Proxy**.

    
* ¿Quiero tratar a objetos individuales y a grupos de objetos de la misma manera? $\rightarrow$ **Composite**.

#### Patrones Comportamentales (¿Cómo se comunican?)

* ¿Tengo una acción que puede realizarse con diferentes algoritmos intercambiables? $\rightarrow$ **Strategy**.


* ¿El comportamiento del objeto cambia radicalmente según su estado interno? $\rightarrow$ **State**.


* ¿Cuando un objeto cambia, otros deben enterarse automáticamente? $\rightarrow$ **Observer**.


* ¿Quiero definir los pasos de un algoritmo pero dejar que las subclases implementen algunos pasos? $\rightarrow$ **Template Method**.


* ¿Quiero pasar una solicitud por una cadena de objetos hasta que uno la maneje? $\rightarrow$ **Chain of Responsibility**.


* ¿Necesito "deshacer" acciones o guardar el historial de un objeto? $\rightarrow$ **Memento**.


* ¿Quiero encapsular una petición como un objeto, permitiendo parametrizar clientes, hacer colas de peticiones o soportar operaciones de deshacer? $\rightarrow$ **Command**.


* ¿Necesito recorrer una colección de objetos (como la lista de materias de una carrera) sin exponer cómo están guardados internamente? $\rightarrow$ **Iterator**.


* ¿Tengo muchos objetos que se comunican entre sí de forma caótica y quiero centralizar esa interacción en un solo lugar? $\rightarrow$ **Mediator**.


* ¿Necesito definir una nueva operación sobre una estructura de objetos (como el Plan de Estudios) sin cambiar las clases de esos objetos? $\rightarrow$ **Visitor**.

### VI. Conclusión

Dominar ambos conjuntos de patrones es esencial para la excelencia en el desarrollo orientado a objetos. 
Los **patrones GRASP** aseguran que los fundamentos de cada clase sean sólidos (alta cohesión, bajo acoplamiento), mientras que los **patrones GoF** proporcionan la **arquitectura flexible** necesaria para manejar sistemas complejos y evolucionar con el tiempo. 

Juntos, forman el lenguaje universal del diseño de software.