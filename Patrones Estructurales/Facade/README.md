# Facade

En dicho patrón se busca simplificar el sistema al proveernos de una clase de alto nivel con la cual el cliente se comunicará únicamente con esta y partir de la cual podrá acceder a los demás subsistemas existentes en el programa.

__¿Cuando usarlo?__

+ Se desea proveer una interfaz más versátil referente a un subsistema de mayor complejidad.
+ Disminuir acoplamiento existente entre los subsistemas y el cliente al independizarlos.
+ Establece un modelo de capas entre los diversos subsistemas que conforman el programa. 

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Facade_UML_class_diagram.svg/1000px-Facade_UML_class_diagram.svg.png)<br>

__Participantes__

+ __Facade:__ aquella clase que realiza las peticiones a los distintos subsistemas conforman al programa-
+ __Subsistema:__ no posee conocimiento del facade y es donde se alberga toda la lógica del programa.

__Consecuencias__

+ Facilita el uso de los subsistemas para el cliente al ocultarle y ordenarle estos.
+ Reduce de forma considerable el acoplamiento entre cliete y subsistemas.
+ Facilita la división de capas en el programa.
