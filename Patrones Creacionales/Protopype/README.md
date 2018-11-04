# Prototype

El patr�n prototype propone que, a partir de una instancia protot�pica, de modo que sea posible el crear nuevos objetos los cuales han de clonar a dicho prototipo y posterior a esto los dichos objetos ser�n modificados seg�n las necesidades del software.

__�Cuando usarlo?__

+ En el momento en que el que el sistema no deba establecer una dependencia con respecto a como se crean, componen y expresan los objetos.
+ Cuando la instanciaci�n de las clases se lleve a cabo durante la ejecuci�n del programa ya sea mediante ligadura din�mica.
+ Cuando se desea evitar seguir el modelo propuesto por el patr�n AbstracFactory dada su jerarqu�a de f�bricas y productos.
+ Si el sistema presenta objetos con datos de aparici�n frecuente y al mismo tiempo estos deben diferenciarse se puede optar por crear dichas objetos al clonar un prototipo de estos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Prototype_UML.svg/600px-Prototype_UML.svg.png)<br>

__Participantes__

+ __Prototype:__ declara una interface desde la cual un objeto es clonado.
+ __PrototypeConcrete:__ implementan al prototipo de modo que aqu� los nuevos objetos ser�n clonados.
+ __Client:__ donde los objetos se crean delegando a estos a que se clonen a partir del prototipo.

__Consecuencias__

+ Posee las mismas consecuencias que Builder y AbstractFactory con la particularidad de que este patr�n no expone los productos al cliente.
+ Una gran herramienta al momento de a�adir objetos durante la ejecuci�n del programa.
+ Especifica a nuevos objetos variando su estructura y valores.
