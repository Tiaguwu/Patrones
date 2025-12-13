Implementaremos el patrón **Memento** para crear un editor de texto simple que permita guardar y deshacer estados.

Crear un `EditorTexto` (Originador) y una clase `Historial` (Cuidador) que pueda guardar las versiones del editor, permitiendo la funcionalidad de Deshacer (`undo`), sin que la clase `Historial` acceda directamente a los atributos privados del `EditorTexto`.