# Bridge

El patrón Bridge nos da la posibilidad de desacoplar nuestro código debido a que este despeja la dependencia existente entre las clases, de modo que se cumpla el principio Open/Closed de modo que se evita modificar el código al extender el mismo, esto se logra en el momento en que se desacopla la implementación de su correspondiente abstracción.

__¿Cuándo usarlo?__
+ Se desea separar una abstracción de su implementación con el propósito de darle más opciones de reusó al código.
+ Se busca evitar que el código sea recompilado.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://static.dzone.com/dz1/dz-files/bridge_pattern.PNG)<br>

__Participantes__
+ __Abstration:__ Define una interfaz abstracta y mantiene una referencia de la clase Implementor.
+ __RefinedAbstraction:__ Extiende la clase Abstraction para el posterior uso de sus métodos en el método main.
+ __Implementor:__ define una interfaz que sea utilizada por las clases concretas, la cual no necesariamente debe seguir la estructura de Abstraction, pues Implementor ha de poseer métodos mas simples.
+ __ConcreteImplementor:__ implementa los métodos de Implementor y concreta su comportamiento.

__Consecuencias__ 
+ Se desacopla la interfaz y su implementación de modo que se logra que nuestro código mantenga una alta cohesión y bajo acoplamiento.
+ Hace más sencilla la extensión de las clases.
+ Oculta los detalles de la implementación a los clientes pues no es necesario recompilar.
