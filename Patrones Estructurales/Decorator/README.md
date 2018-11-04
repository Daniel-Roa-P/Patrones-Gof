# Decorator

El patr�n Decorador nos permite a�adir nuevas responsabilidades a un objeto concreto durante el tiempo de ejecuci�n de forma din�mica, por lo general es utilizado cuando se poseen objetos del mismo tipo, pero se desea agregar una nueva funcionalidad a uno de estos sin tener que alterar a los dem�s. 

__�Cuando usarlo?__

+ Se desea a�adir una funcionalidad a un objeto en espec�fico, pero haci�ndolo mediante herencia implicar�a que los dem�s objetos del mismo tipo tambi�n la poseer�an.
+ Se busca a�adir o remover responsabilidades a los objetos durante la ejecuci�n.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://danielggarcia.files.wordpress.com/2014/03/030914_2321_patronesest1.png?w=620)<br>

__Participantes__ 

+ __Component:__ interfaz desde la cual los objetos se le podr�n a�adir responsabilidades de forma dinamica.
+ __ConcreteComponent:__ clase en la cual se define el objeto desde el que se van a a�adir las responsabilidades.
+ __Decorator:__ posee una referencia del objeto Component  y define una nueva interfaz a partir del Component para ser extendida posteriormente.
+ __CocreteDecorator:__ adiciona las responsabilidades al component.

__Consecuencias__

+ Se evaden todas aquellas limitantes y restricciones que trae con sigo la herencia pues es posible a�adir nuevas responsabilidades sin la necesidad de crear una nueva clase que cumpla dicha funci�n.
+ Previene el hecho de que las superclases incluyan con sigo una gran cantidad de funcionalidades de modo que el c�digo sea mucho m�s legible.
+ Dado que los objetos del decorador son m�s flexibles que hacerlo por medio de la herencia tambi�n trae con sigo una mayor facilidad de que se obtengan errores, pues en varias ocasiones la combinaci�n de algunos objetos no puede ser compatible o invocar referencias c�clicas.
+ La depuraci�n puede verse ajetreada dada la creaci�n de muchos objetos peque�os que se encuentran encadenados.
+ Un componente y su decorador no son el mismo objeto de manera que se reduce el acoplamiento.
