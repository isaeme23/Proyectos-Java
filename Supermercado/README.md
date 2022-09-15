# Parcial CVDS 2022-2
## Integrantes
Santiago Ospina, Isabella Manrique
## Git
Este proyecto fue tomado del siguiente repositorio en [GitHub](https://github.com/jalex3421/Proyectos-Java/tree/master/Supermercado)
1. Realizamos el fork, que es una copia del repositorio en nuestro usuario 
y que no se encuentra en lazado al repositorio original, por lo que nos permitirá
realizar cambios.

![](fork.png)

## Indentificar de malas prácticas
### Principios SOLID
1. **Single Responsibility**

Primero, encontramos la clase 'Supermercado', la cual
es la clase principal en este proyecto. En esta clase,
se le deja la responsabilidad de no solo simular
lo que pasa en el supermercado, sino también de ejecutar
todo el proyecto.

Proponemos una solución de crear una clase 'Simulación' para que
esta se encargue únicamente de ejecutar la simulación y dejar
a la clase supermercado con la única responsabilidad de la creación
del objeto y métodos que sean necesarios para el objeto.

2. **Open Closed, Liskov e Interface Segregation**

Para esto tomaremos la clase reloj, que es instanciada en la clase supermercado.
Esta puese ser sustituida por una clase de tipo Reloj, ya que este en el futuro puede
cambiar o se puede necesitar un tipo diferente de reloj. Podemos crear una interfaz
llamada "Reloj" y agregar una clase "RelojComun" que implemente esta interfaz.
De la misma forma, ahora no tendriamos una instancia de clase sino una interfaz.
## Unit Test y malas prácticas
### Principio FIRST

A este proyecto se le realizaron pruebas, pero no se utilizó junit
para ellas, en vez de esto se realizó un main que ejecutara 3 posibles
pruebas por lo que no cumple con ningún aspecto del principio FIRST,
por lo que proponemos realizar las pruebas con junit teniendo en
cuenta las clases de equivalencia que se propondrán a continuación:

**Clases de equivalencia:**
* Cajas:
  * El mínimo número de cajas es 0.
  * El máximo número de cajas es de 10.
  * Se empieza la simulación con el número de cajas indicado por el usuario.
  

* Tiempo de llegada de carritos:
  * Debe ser mayor que 0
  * Se inicia con el valor dado por el usuario


* Productos:
  * Debe ser mayor que 0
  * Se inicia con el valor dado por el usuario

## Patrones de diseño