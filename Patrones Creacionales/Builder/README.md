# Builder

Este patr�n nos ofrece la posibilidad de crear objetos m�s complejos a partir objetos m�s sencillos gracias al uso de una interfaz en com�n denominada AbstracBuilder.

__�Cuando Usarlo?__

+ Sea necesario hacer uso de un algoritmo el cual permita la creaci�n de objetos m�s complejos, dicho algoritmo debe ser independiente de las partes que construyen este nuevo objeto y de como este se crea.
+ Dicho proceso de construcci�n de lugar a diversas representaciones para el objeto construido.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Builder_UML_class_diagram.svg/500px-Builder_UML_class_diagram.svg.png)<br>

__Participantes__

+ __Builder:__ especifica una interfaz abstracta la cual nos permitir� crear el objeto complejo.
+ __ConcreteBuilder:__ implementa al Builder por lo que este se encarga de ensamblar y construir dicho producto complejo.
+ __Director:__ construye un objeto al implementar la interfaz Builder.
+ __Producto:__ es la representaci�n del objeto completo construido al incluir los diversos elementos de las clases que la componen al armar estos en un resultado final.

__Consecuencias__

+ Desacopla al usuario del constructor, permitiendo asi nuevas representaciones de objetos m�s complejos.
+ A�sla a los Usuarios de la estructura interna que compone al producto.
+ Da lugar a la construcci�n controlada de los objetos complejos.
