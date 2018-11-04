# Composite

Con este patrón se nos da la posibilidad de construir algoritmos u objetos mucho más complejos a partir de otros más sencillos y con similitudes entre si al hacer uso de una estructura de árbol junto a una composición recursiva. 

__¿Cuando usarlo?__

+ Se desea representar una jerarquía de objetos como un parte todo o un árbol.
+ El cliente no pueda distinguir la diferencia entre objetos sencillos y complejos.

DIAGRAMA DE CLASES:

![No ha sido encontrado el diagrama](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpX-Tq3I0gxCnBluXjjCXOL11SbNrxrmGW-4-Eon5OHfKhxb0ScQ)<br>

__Prticipantes__

+ __Component:__ implementa el comportamiento en común del cual poseerán todas las clases de modo que se asegure una estructura recursiva.
+ __Leaf:__ representa a aquellas clases sencillas las cuales no extiende a otras clases.
+ __Composite:__ define el comportamiento de los hijos, almacena sus componentes y establece las diferentes operaciones e interacciones que poseerán dichos hijos.
+ __Cliente:__ manipula a los objetos a crear atravesó del componente al decidir qué tan complejo desea que se el objeto en cuestión.

__Consecuencias__

+ Define una jerarquía entre las clases al estilo de un árbol.
+ Facilita la extensión de hijos.
+ Desarrolla un diseño general y la interacción que realizan los clientes.
+ si la complejidad del programa aumenta se hace mucho mas difícil identificar las partes e interacciones que conforman al mismo gracias a la estructura jerárquica extrema.
