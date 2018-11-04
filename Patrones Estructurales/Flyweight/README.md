# Flyweight

El patr�n de peso ligero tiene como prop�sito reducir la redundancia cuando se poseen objetos de forma repetitiva los cuales poseen el mismo tipo y desempe�an la misma funci�n, pero se diferencian seg�n sus atributos, de modo que se busca instanciar dicho objeto una �nica vez para m�s adelante diferenciar al reto y as� mejorar el rendimiento al no requerir demasiados recursos.

__�Cuando usarlo?__

+ En el momento en que el sistema posea una gran cantidad de objetos que desempe�an la misma funci�n y se desea eliminar dicha redundancia.
+ Cuando se desea gastar la menor cantidad de memoria posible.
+ Cuando el sistema no deba depender de la identidad de sus objetos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://lh6.googleusercontent.com/U8FtCPlWF05eCqgwYsQuO4IPhNEbo2eD7-VD-Zpd-FcR7A9xO_rDVOg08QWkdM2tiO4T1p2CaQeTJfmehzwPoKfTAvX4bga8klpg9P2LxRlGuwLQu10)<br>

__Participantes__

+ __Flyweight:__ declara una interfaz a trav�s de la cual los Flyweight pueden recibir y actuar sobre objetos no compartidos.
+ __ConcreteFlyweight:__ implementa la interfaz anterior donde se almacenaran los estados compartidos.
+ __UnsharedConcreteFlyweight:__ donde se le es asignados los atributos a los objetos repetitivos al hacer llamado del flyweight compartido.
+ __FlyweightFactory:__ es donde se crean los objetos Flyweight y garantiza que esto sean compartidos de una forma adecuada, pues si aqu� es donde se crean las instancias de los objetos si es necesario.
+ __Client:__ contiene aquellas referencias de los objetos en cuesti�n, y es donde se calculan y almacenan los estados que no son compartidos.

__Consecuencias__ 

+ Reduce el peso de los datos de modo que se gestiona de manera apropiada los recursos de la m�quina.
+ Toma un poco m�s de tiempo realizar una b�squeda de determinado objeto.
+ Se hace m�s compleja la codificaci�n de objetos en el c�digo por lo que es m�s propensa la aparici�n de errores.
