# Abstract Factory

Este patr�n desempe�a la funci�n de crear diversas familias de objetos, las cuales por medio de una jerarqu�a de herencia de objetos generando as� productos sin especificar sus clases concretas.


__�Cuando usarlo?__

+ Un sistema no deba depender de la instanciaci�n de sus objetos.
+ Sea necesario reforzar la dependencia mutua entre determinados objetos.
+ El sistema debe ser modificado con diversas familias de productos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://lh5.googleusercontent.com/C9plgsRJaiC2bF98ngyS1qew3FJLaSAQbJ4O8fKsTcKnzkHm1Fsf_5N3ewrpRQNx_G0EzZIxpDdpve9GQ7ZyeW5OR-Y9sunUF0hCoBI3JD8cMvIQcwA)<br>

__Participantes__

+ __AbstractFactory:__ define una interfaz cuyos m�todos cumplir�n la funci�n de crear los productos abstractos.
+ __ConcreteFactory:__ implementa aquellas operaciones que dar�n lugar a la instanciaci�n de los productos abstractos.
+ __AbstractProduct:__ declarar una interfaz de la cual se crearan productos espec�ficos.
+ __ConcreteProduct:__ una vez implementado el AbstractProduct se define el objetos del producto para una determinada ConcreteFactory.
+ __Client:__ hace uso de las interfaces de AbstractFactory y AbstractProduct al mismo tiempo que elige los productos concretos que desea.

__Consecuencias:__

+ A�sla las clases concretas.
+ Facilita el intercambio de familias de productos.
+ Dificulta la creaci�n de productos pues al hacer esto se ver� necesario modificar el AbstractFactory y por ende todo el sistema.
