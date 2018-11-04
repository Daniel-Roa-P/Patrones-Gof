# Composite

Con este patr�n se nos da la posibilidad de construir algoritmos u objetos mucho m�s complejos a partir de otros m�s sencillos y con similitudes entre si al hacer uso de una estructura de �rbol junto a una composici�n recursiva. 

__�Cuando usarlo?__

+ Se desea representar una jerarqu�a de objetos como un parte todo o un �rbol.
+ El cliente no pueda distinguir la diferencia entre objetos sencillos y complejos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpX-Tq3I0gxCnBluXjjCXOL11SbNrxrmGW-4-Eon5OHfKhxb0ScQ)<br>

__Prticipantes__

+ __Component:__ implementa el comportamiento en com�n del cual poseer�n todas las clases de modo que se asegure una estructura recursiva.
+ __Leaf:__ representa a aquellas clases sencillas las cuales no extiende a otras clases.
+ __Composite:__ define el comportamiento de los hijos, almacena sus componentes y establece las diferentes operaciones e interacciones que poseer�n dichos hijos.
+ __Cliente:__ manipula a los objetos a crear atraves� del componente al decidir qu� tan complejo desea que se el objeto en cuesti�n.

__Consecuencias__

+ Define una jerarqu�a entre las clases al estilo de un �rbol.
+ Facilita la extensi�n de hijos.
+ Desarrolla un dise�o general y la interacci�n que realizan los clientes.
+ si la complejidad del programa aumenta se hace mucho mas dif�cil identificar las partes e interacciones que conforman al mismo gracias a la estructura jer�rquica extrema.
