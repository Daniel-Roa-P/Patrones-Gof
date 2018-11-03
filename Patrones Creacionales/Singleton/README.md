# Singleton

Con este patrón nos es posible hacer uso de un mecanismo el cual nos permite limitar el número de instancias que puede realizar una clase, de manera que dicho objeto siempre será compartido por distintas partes del código al crearse referencias dicho objeto único.

__¿Cuando Usarlo?__

+ Se desea que tan solo se realice una instancia de una clase y al mismo tiempo que se debe acceder a esta desde un único punto conocido.
+ En el momento en que dicha instancia deba ser extendida por subclases, por lo que los clientes sean capaces de extender esa instancia sin la necesidad de alterar el código.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://upload.wikimedia.org/wikipedia/commons/d/dc/Singleton_pattern_uml.png)<br>

__Participantes__

+ __Singeton:__ define una única instancia de sí misma y una operación la cual será el único punto de acceso a dicha instancia.

__Consecuencias__

+ Se controla el acceso de la instancia pues la clase encapsula a la misma, teniendo control sobre esta.
+ Se da una mejora en las variables globales pues reduce el espacio de nombres de estas, pues solo existen instancias.
+ Da lugar al refinamiento de representaciones y operaciones pues es más flexible con estas.
+ El excesivo uso de este patrón trae con sigo un anti patrón conocido como singletonitis.