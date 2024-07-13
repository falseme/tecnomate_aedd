
(nov 23)

# Ejercicio D - Dvd

_Tiempo límite: 1s_ | _Memoria límite: 256MB_

### Resumen:
Lucas está viendo un película en DVD. En un momento la quitó y quedó mirando el logo de DVD hasta que chocó la esquina superior izquierda.

Se preguntó cuando volvería a chocar otra esquina. Midió su pantalla y obtuvo `4` pulgadas de alto y `7` de ancho. También midió el logo. `2` pulgadas de alto y `3` de ancho. Además notó que el logo se desplazaba una pulgada vertical y horizontalmente cada segundo.

Lucas solicita un programa que le calcule cuanto tiempo debe esperar considerando la condición inicial del logo en la esquina superior izquierda, moviéndose hacia abajo a la derecha.

### Entrada:
Múltiples líneas. La primera con un entero $1 \leq t \leq 10^4$, que representa la cantidad de casos de prueba. Cada caso consiste en dos líneas. La primera con dos enteros $2 \leq N, M \leq 10^9$, el alto y el ancho de la pantalla en pulgadas. La segunda con otros dos enteros $1 \leq n < N$ y $1 \leq m < M$, el alto y ancho del logo de DVD en pulgadas.

### Ejemplo 1:

__Entrada__
```
2
4 7
2 3
6 13
2 4
 
```
__Salida__
_Los segundos que demora cada caso en tocar otra esquina._
```
4
36
```

## Result:

```
javac D.java
java -Xms256m -Xmx256m D
```

```
2
4 7
2 3
6 13
2 4
 4
36
Time (ms): 1.0149
```

