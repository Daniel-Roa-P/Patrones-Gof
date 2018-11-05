# Proxy

En el patron proxy se crea una clase la cual actuara como intermediaria en lo referente al acceso de ciertos objetos de modo que se generan ciertas restricciones que controlaran el llamado de estas, esto se logra de forma indirecta por medio de un objeto de tipo proxy que actua como un sustituto del original para que posteriormente si cumple las condiciones se pueda llamar a los metodos del objeto en cuestion. 

__¿Cuando usarlo?__

+ Se necesita referenciar un objeto de porma mas flexible a comparacion de lo que haria un puntero.
+ Cuando se desea controlar el acceso a un servidor de modo que este no se sature.
+ En momento en que cargar los elementos de un programa genere un gran consumo de recursos de modo que se particionan sus funcionalidades y asi algunas cargan mas rapido que otraslo cual agilisa la ejecucion de dicho software.
+ Se desea restringir el acceso de ciertos elementos del sofware a los usuarios. 

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://i.stack.imgur.com/Nwtdg.png)<br>

__Participantes__

+ __Subject:__ clase abstracta o interfaz la cual proporcina el aceso al objeto en cuestion extendiendose en el objeto real y su proxy.
+ __Proxy:__ posee una referencia de un objeto real y controla la creacion y acceso a este.
+ __RealSubject:__ donde se define el objeto real.
+ __Cliente:__ donde se genera la solicitud del objeto atravez del Proxy el cual nos dara acceso al RealSubject.

__Consecuencias__

+ se optimiza la ejecucion de un programa en un entorno virtual.
+ matienene obulta la ubicacion del objeto real en un entorno remoto.
+ hace posible agregar herramientas de mantimiento en un programa a las cuales el desarrollador podra entrar.
