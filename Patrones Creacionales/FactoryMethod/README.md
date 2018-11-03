# Factory Method

El patr�n en cuesti�n permite al desarrollador definir una interfaz de creaci�n de determinado tipo de objetos de modo que las subclases pueden elegir la clase que van a instanciar, de esta forma se pospone la instanciaci�n de dichos objetos.

__�Cuando usarlo?__

+ Una clase no sea capaz de anticipar el objeto a crear y se desea que las subclases generen dichos objetos.
+ Cuando existen clases que asignan responsabilidades en una o varias subclases, haciendo posible la localizaci�n del conocimiento de la subclase delegada.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://www.dofactory.com/images/diagrams/net/factory.gif)<br>

__Participantes__

+ __Product:__ define una interfaz usada por todos aquellos objetos credos por el Factory Method.
+ __Creator:__ declara el conocido factory method, dicha clase retornara un objeto de tipo Product.
+ __ConcreteProduct:__ implementa aquellos m�todos definidos por el Product.
+ __ConcreteCreator:__ por medio del polimorfismo ha de redefinir el factory method con el prop�sito de retornar una instancia del ConcreteProduct.

__Consecuencias__

+ Al hacer uso de este patr�n se elimina la necesidad de introducir clases especificas en el c�digo del creador, pues al manejar la interfaz product es posible a�adir cualquier ConcretePoduct a petici�n del usuario.
+ La creaci�n de objetos por medio del factory method ha de ser m�s flexible a comparaci�n de crear los objetos uno por uno.
+ El uso de este patr�n genera un consumo excesivo de recursos con respecto al aumento del n�mero de productos.
