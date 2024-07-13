(nov 23)

# Ejercicio A - Amistad

_Tiempo límite: 1s_ | _Memoria límite: 256Mb_

### Resumen del ejercicio porque tiene mucho texto al pedo:
Bram hace una prueba llamada el círculo de la amistad porque está re al pedo y quiere perder amigos. Se pone un tronco por cada persona alrededor de la fogata formando un circulo y cada uno elige donde sentarse. Luego Bram, con los ojos vendados, dice el nombre de cada uno y ellos abandonan el círculo.

La prueba de la amistad es exitosa si las personas abandonan el círculo en orden, saliendo siempre el que está a la derecha del anterior.

El programa debe ser capaz de decirle a Bram si la prueba fue exitosa o no.

### Entrada:
Dos lineas. La primera con un entero dando la cantidad de personas en el circulo $1 \leq n \leq 10^5$ y la segunda con los enteros representando el orden en el que las personas salieron del circulo $1 \leq m_i \leq n$

### Ejemplo 1:

__Entrada__
```
10
7 8 9 10 1 2 3 4 5 6
 
```
__Salida__
```
SI
```
### Ejemplo 2:

__Entrada__
```
7
1 2 3 4 6 5 7
```
__Salida__
```
NO
```

### Result:

```
javac A.java
java -Xms256m -Xmx256m A
```

```
10
7 8 9 10 1 2 3 4 5 6
SI
Time (ms): 0.7347
```

