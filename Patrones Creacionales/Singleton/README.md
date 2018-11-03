# Singleton

Con este patr�n nos es posible hacer uso de un mecanismo el cual nos permite limitar el n�mero de instancias que puede realizar una clase, de manera que dicho objeto siempre ser� compartido por distintas partes del c�digo al crearse referencias dicho objeto �nico.

__�Cuando Usarlo?__

+ Se desea que tan solo se realice una instancia de una clase y al mismo tiempo que se debe acceder a esta desde un �nico punto conocido.
+ En el momento en que dicha instancia deba ser extendida por subclases, por lo que los clientes sean capaces de extender esa instancia sin la necesidad de alterar el c�digo.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://upload.wikimedia.org/wikipedia/commons/d/dc/Singleton_pattern_uml.png)<br>

__Participantes__

+ __Singeton:__ define una �nica instancia de s� misma y una operaci�n la cual ser� el �nico punto de acceso a dicha instancia.

__Consecuencias__

+ Se controla el acceso de la instancia pues la clase encapsula a la misma, teniendo control sobre esta.
+ Se da una mejora en las variables globales pues reduce el espacio de nombres de estas, pues solo existen instancias.
+ Da lugar al refinamiento de representaciones y operaciones pues es m�s flexible con estas.
+ El excesivo uso de este patr�n trae con sigo un anti patr�n conocido como singletonitis.