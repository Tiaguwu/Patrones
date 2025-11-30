Implementaremos el patrón **Template Method** para un sistema de comercio electrónico que procesa pedidos que pueden provenir de diferentes canales (ej., un pedido estándar y un pedido internacional, cada uno con impuestos y envío diferentes).

Definir el flujo inmutable del procesamiento de un pedido, permitiendo que las subclases personalicen únicamente los costos de impuestos y envío.