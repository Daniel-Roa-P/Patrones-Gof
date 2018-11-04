# Flyweight

El patrón de peso ligero tiene como propósito reducir la redundancia cuando se poseen objetos de forma repetitiva los cuales poseen el mismo tipo y desempeñan la misma función, pero se diferencian según sus atributos, de modo que se busca instanciar dicho objeto una única vez para más adelante diferenciar al reto y así mejorar el rendimiento al no requerir demasiados recursos.

__¿Cuando usarlo?__

+ En el momento en que el sistema posea una gran cantidad de objetos que desempeñan la misma función y se desea eliminar dicha redundancia.
+ Cuando se desea gastar la menor cantidad de memoria posible.
+ Cuando el sistema no deba depender de la identidad de sus objetos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://lh6.googleusercontent.com/U8FtCPlWF05eCqgwYsQuO4IPhNEbo2eD7-VD-Zpd-FcR7A9xO_rDVOg08QWkdM2tiO4T1p2CaQeTJfmehzwPoKfTAvX4bga8klpg9P2LxRlGuwLQu10)<br>

__Participantes__

+ __Flyweight:__ declara una interfaz a través de la cual los Flyweight pueden recibir y actuar sobre objetos no compartidos.
+ __ConcreteFlyweight:__ implementa la interfaz anterior donde se almacenaran los estados compartidos.
+ __UnsharedConcreteFlyweight:__ donde se le es asignados los atributos a los objetos repetitivos al hacer llamado del flyweight compartido.
+ __FlyweightFactory:__ es donde se crean los objetos Flyweight y garantiza que esto sean compartidos de una forma adecuada, pues si aquí es donde se crean las instancias de los objetos si es necesario.
+ __Client:__ contiene aquellas referencias de los objetos en cuestión, y es donde se calculan y almacenan los estados que no son compartidos.

__Consecuencias__ 

+ Reduce el peso de los datos de modo que se gestiona de manera apropiada los recursos de la máquina.
+ Toma un poco más de tiempo realizar una búsqueda de determinado objeto.
+ Se hace más compleja la codificación de objetos en el código por lo que es más propensa la aparición de errores.
