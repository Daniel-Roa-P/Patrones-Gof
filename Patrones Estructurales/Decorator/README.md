# Decorator

El patrón Decorador nos permite añadir nuevas responsabilidades a un objeto concreto durante el tiempo de ejecución de forma dinámica, por lo general es utilizado cuando se poseen objetos del mismo tipo, pero se desea agregar una nueva funcionalidad a uno de estos sin tener que alterar a los demás. 

__¿Cuando usarlo?__

+ Se desea añadir una funcionalidad a un objeto en específico, pero haciéndolo mediante herencia implicaría que los demás objetos del mismo tipo también la poseerían.
+ Se busca añadir o remover responsabilidades a los objetos durante la ejecución.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://danielggarcia.files.wordpress.com/2014/03/030914_2321_patronesest1.png?w=620)<br>

__Participantes__ 

+ __Component:__ interfaz desde la cual los objetos se le podrán añadir responsabilidades de forma dinamica.
+ __ConcreteComponent:__ clase en la cual se define el objeto desde el que se van a añadir las responsabilidades.
+ __Decorator:__ posee una referencia del objeto Component  y define una nueva interfaz a partir del Component para ser extendida posteriormente.
+ __CocreteDecorator:__ adiciona las responsabilidades al component.

__Consecuencias__

+ Se evaden todas aquellas limitantes y restricciones que trae con sigo la herencia pues es posible añadir nuevas responsabilidades sin la necesidad de crear una nueva clase que cumpla dicha función.
+ Previene el hecho de que las superclases incluyan con sigo una gran cantidad de funcionalidades de modo que el código sea mucho más legible.
+ Dado que los objetos del decorador son más flexibles que hacerlo por medio de la herencia también trae con sigo una mayor facilidad de que se obtengan errores, pues en varias ocasiones la combinación de algunos objetos no puede ser compatible o invocar referencias cíclicas.
+ La depuración puede verse ajetreada dada la creación de muchos objetos pequeños que se encuentran encadenados.
+ Un componente y su decorador no son el mismo objeto de manera que se reduce el acoplamiento.
