# Adapter

El patr�n adapter se caracteriza por adaptar un objeto a otro de modo que a este se le a�adan con sigo nuevas funcionalidades de manera que, si una clase no es capaz de acceder a la interfaz otra, mediante una nueva interfaz sea posible acceder a la primera interfaz.

__�Cuando usarlo?__

+  Se desea que una clase llame un m�todo mediante una interfaz, pero se busca usar dicho m�todo desde una clase que no implementa aquella interfaz.
+ Busca restringir el conocimiento que pueda poseer el objeto a tratar objeto con respecto a las dem�s clases de objetos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://www.dofactory.com/images/diagrams/net/adapter.gif)<br>

__Participantes__ 

+ __Target:__ declara una interfaz la cual el cliente har� uso de esta.
+ __Client:__ realiza la creaci�n y conformaci�n de objetos.
+ __Adapter:__ adapta la interfaz usada por Adaptee a lo que ser� la interfaz Target.
+ __Adaptee:__ define la interfaz la cual nos permitir� implementar las nuevas funcionalidades a los objetos adaptados.

__Consecuencias__

+ Se rompe la dependencia entre el cliente y las clases adaptadas.
+ Permite que una �nica clase adaptadora sea capaz de adaptar un gran n�mero de clases adaptadas.

