# Proxy

En el patrón proxy se crea una clase la cual actuara como intermediaria en lo referente al acceso de ciertos objetos de modo que se generan ciertas restricciones que controlaran el llamado de estas, esto se logra de forma indirecta por medio de un objeto de tipo proxy que actúa como un sustituto del original para que posteriormente si cumple las condiciones se pueda llamar a los métodos del objeto en cuestión. 

__¿Cuando usarlo?__

+ Se necesita referenciar un objeto de forma más flexible a comparación de lo que haría un puntero.
+ Cuando se desea controlar el acceso a un servidor de modo que este no se sature.
+ En momento en que cargar los elementos de un programa genere un gran consumo de recursos de modo que se separan sus funcionalidades y así algunas cargan más rápido que otras lo cual agiliza la ejecución de dicho software.
+ Se desea restringir el acceso de ciertos elementos del software a los usuarios. 

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://i.stack.imgur.com/Nwtdg.png)<br>

__Participantes__

+ __Subject:__ clase abstracta o interfaz la cual proporciona el acceso al objeto en cuestión extendiéndose en el objeto real y su proxy.
+ __Proxy:__ posee una referencia de un objeto real y controla la creación y acceso a este.
+ __RealSubject:__ donde se define el objeto real.
+ __Cliente:__ donde se genera la solicitud del objeto a través del Proxy el cual nos dará acceso al RealSubject.

__Consecuencias__

+ se optimiza la ejecución de un programa en un entorno virtual.
+ mantiene oculta la ubicación del objeto real en un entorno remoto.
+ hace posible agregar herramientas de mantenimiento en un programa a las cuales el desarrollador podrá entrar.
