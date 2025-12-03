Implementaremos el patrón **Flyweight** para gestionar la creación eficiente de miles de elementos de terreno en un videojuego (rocas, árboles, arbustos).

Crear un sistema donde la información visual y física de un tipo de terreno (`Textura`, `Malla 3D`) se almacene una sola vez (Flyweight), mientras que la posición y el estado del objeto en el mundo del juego se manejen externamente.