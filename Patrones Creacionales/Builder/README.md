# Builder

Este patrón nos ofrece la posibilidad de crear objetos más complejos a partir objetos más sencillos gracias al uso de una interfaz en común denominada AbstracBuilder.

__¿Cuando Usarlo?__

+ Sea necesario hacer uso de un algoritmo el cual permita la creación de objetos más complejos, dicho algoritmo debe ser independiente de las partes que construyen este nuevo objeto y de como este se crea.
+ Dicho proceso de construcción de lugar a diversas representaciones para el objeto construido.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Builder_UML_class_diagram.svg/500px-Builder_UML_class_diagram.svg.png)<br>

__Participantes__

+ __Builder:__ especifica una interfaz abstracta la cual nos permitirá crear el objeto complejo.
+ __ConcreteBuilder:__ implementa al Builder por lo que este se encarga de ensamblar y construir dicho producto complejo.
+ __Director:__ construye un objeto al implementar la interfaz Builder.
+ __Producto:__ es la representación del objeto completo construido al incluir los diversos elementos de las clases que la componen al armar estos en un resultado final.

__Consecuencias__

+ Desacopla al usuario del constructor, permitiendo asi nuevas representaciones de objetos más complejos.
+ Aísla a los Usuarios de la estructura interna que compone al producto.
+ Da lugar a la construcción controlada de los objetos complejos.
