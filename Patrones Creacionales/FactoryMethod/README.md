# Factory Method

El patrón en cuestión permite al desarrollador definir una interfaz de creación de determinado tipo de objetos de modo que las subclases pueden elegir la clase que van a instanciar, de esta forma se pospone la instanciación de dichos objetos.

__¿Cuando usarlo?__

+ Una clase no sea capaz de anticipar el objeto a crear y se desea que las subclases generen dichos objetos.
+ Cuando existen clases que asignan responsabilidades en una o varias subclases, haciendo posible la localización del conocimiento de la subclase delegada.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://www.dofactory.com/images/diagrams/net/factory.gif)<br>

__Participantes__

+ __Product:__ define una interfaz usada por todos aquellos objetos credos por el Factory Method.
+ __Creator:__ declara el conocido factory method, dicha clase retornara un objeto de tipo Product.
+ __ConcreteProduct:__ implementa aquellos métodos definidos por el Product.
+ __ConcreteCreator:__ por medio del polimorfismo ha de redefinir el factory method con el propósito de retornar una instancia del ConcreteProduct.

__Consecuencias__

+ Al hacer uso de este patrón se elimina la necesidad de introducir clases especificas en el código del creador, pues al manejar la interfaz product es posible añadir cualquier ConcretePoduct a petición del usuario.
+ La creación de objetos por medio del factory method ha de ser más flexible a comparación de crear los objetos uno por uno.
+ El uso de este patrón genera un consumo excesivo de recursos con respecto al aumento del número de productos.
