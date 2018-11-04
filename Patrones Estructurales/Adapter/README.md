# Adapter

El patrón adapter se caracteriza por adaptar un objeto a otro de modo que a este se le añadan con sigo nuevas funcionalidades de manera que, si una clase no es capaz de acceder a la interfaz otra, mediante una nueva interfaz sea posible acceder a la primera interfaz.

__¿Cuando usarlo?__

+  Se desea que una clase llame un método mediante una interfaz, pero se busca usar dicho método desde una clase que no implementa aquella interfaz.
+ Busca restringir el conocimiento que pueda poseer el objeto a tratar objeto con respecto a las demás clases de objetos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://www.dofactory.com/images/diagrams/net/adapter.gif)<br>

__Participantes__ 

+ __Target:__ declara una interfaz la cual el cliente hará uso de esta.
+ __Client:__ realiza la creación y conformación de objetos.
+ __Adapter:__ adapta la interfaz usada por Adaptee a lo que será la interfaz Target.
+ __Adaptee:__ define la interfaz la cual nos permitirá implementar las nuevas funcionalidades a los objetos adaptados.

__Consecuencias__

+ Se rompe la dependencia entre el cliente y las clases adaptadas.
+ Permite que una única clase adaptadora sea capaz de adaptar un gran número de clases adaptadas.

