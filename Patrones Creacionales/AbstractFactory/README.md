# Abstract Factory

Este patrón desempeña la función de crear diversas familias de objetos, las cuales por medio de una jerarquía de herencia de objetos generando así productos sin especificar sus clases concretas.


__¿Cuando usarlo?__

+ Un sistema no deba depender de la instanciación de sus objetos.
+ Sea necesario reforzar la dependencia mutua entre determinados objetos.
+ El sistema debe ser modificado con diversas familias de productos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://lh5.googleusercontent.com/C9plgsRJaiC2bF98ngyS1qew3FJLaSAQbJ4O8fKsTcKnzkHm1Fsf_5N3ewrpRQNx_G0EzZIxpDdpve9GQ7ZyeW5OR-Y9sunUF0hCoBI3JD8cMvIQcwA)<br>

__Participantes__

+ __AbstractFactory:__ define una interfaz cuyos métodos cumplirán la función de crear los productos abstractos.
+ __ConcreteFactory:__ implementa aquellas operaciones que darán lugar a la instanciación de los productos abstractos.
+ __AbstractProduct:__ declarar una interfaz de la cual se crearan productos específicos.
+ __ConcreteProduct:__ una vez implementado el AbstractProduct se define el objetos del producto para una determinada ConcreteFactory.
+ __Client:__ hace uso de las interfaces de AbstractFactory y AbstractProduct al mismo tiempo que elige los productos concretos que desea.

__Consecuencias:__

+ Aísla las clases concretas.
+ Facilita el intercambio de familias de productos.
+ Dificulta la creación de productos pues al hacer esto se verá necesario modificar el AbstractFactory y por ende todo el sistema.
