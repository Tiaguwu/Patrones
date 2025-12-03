Implementaremos el patrón Facade para simplificar la inicialización y el uso de un complejo sistema de cine en casa.

Crear una clase **Fachada** (`SistemaCineEnCasa`) que proporcione métodos simples (`verPelicula()`, `apagarTodo()`) para orquestar la interacción de tres componentes complejos (`Proyector`, `Amplificador`, `ReproductorDVD`).