# Prototype

El patrón prototype propone que, a partir de una instancia prototípica, de modo que sea posible el crear nuevos objetos los cuales han de clonar a dicho prototipo y posterior a esto los dichos objetos serán modificados según las necesidades del software.

__¿Cuando usarlo?__

+ En el momento en que el que el sistema no deba establecer una dependencia con respecto a como se crean, componen y expresan los objetos.
+ Cuando la instanciación de las clases se lleve a cabo durante la ejecución del programa ya sea mediante ligadura dinámica.
+ Cuando se desea evitar seguir el modelo propuesto por el patrón AbstracFactory dada su jerarquía de fábricas y productos.
+ Si el sistema presenta objetos con datos de aparición frecuente y al mismo tiempo estos deben diferenciarse se puede optar por crear dichas objetos al clonar un prototipo de estos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Prototype_UML.svg/600px-Prototype_UML.svg.png)<br>

__Participantes__

+ __Prototype:__ declara una interface desde la cual un objeto es clonado.
+ __PrototypeConcrete:__ implementan al prototipo de modo que aquí los nuevos objetos serán clonados.
+ __Client:__ donde los objetos se crean delegando a estos a que se clonen a partir del prototipo.

__Consecuencias__

+ Posee las mismas consecuencias que Builder y AbstractFactory con la particularidad de que este patrón no expone los productos al cliente.
+ Una gran herramienta al momento de añadir objetos durante la ejecución del programa.
+ Especifica a nuevos objetos variando su estructura y valores.
