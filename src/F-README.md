
(nov 23)

# Ejercicio F - Semejanza

_Tiempo límite: 1s_ | _Memoria límite: 256MB_

### Resumen:
Ezequiel a investigado diferentes algoritmos de comparación de imágenes. El que va a llevar se basa en contar la cantidad de columnas compuestas exclusivamente por ceros, luego de sustituir cada elemento por el resto del cociente entre dicho elemento y el valor mínimo de su fila.

Haga un programa que utilice este algoritmo sobre una imagen cuadrada.

### Entrada:
Múltiples líneas. La primera contiene un entero $1 \leq n \leq 1000$, el tamaño en pixeles de la imagen cuadrada. Luego $n$ líneas con $n$ enteros $1 \leq P_{ij} \leq 1000$, representando el valor del pixel en la posición $ij$.

### Ejemplo 1:

__Entrada__
```
4
2 7 6 256
27 3 9 11
5 10 5 125
16 15 4 5
 
```
__Salida__
_métrica de la imagen dada_
```
2
```

### Ejemplo 2:

__Entrada__
```
3
2 7 5
3 1 9
4 3 4
 
```
__Salida__
_métrica de la imagen dada_
```
0
```

## Result:

```
javac F.java
java -Xms256m -Xmx256m F
```
```
4
2 7 6 256
27 3 9 11
5 10 5 125
16 15 4 5
 2
Time (ms): 0.9868
```

