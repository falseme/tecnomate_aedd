
(nov 23)

# Ejercicio E - El Computador de la Diosa Pitón

_Tiempo límite: 1s_ | _Memoria límite: 256MB_

### Resumen porque el ejercicio tiene mucho texto que no sirve:
Un grupo de investigadores descubrieron unos jeroglíficos en forma de pirámide y Roberto cree que son registros de memorias de computadores primitivos. Roberto debe calcular la suma de los elementos que conforman la pirámide.

Si bien existen de distintas alturas todas se elaboran siguiente un mismo patrón.
```
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
```

Note que la columna central, de altura $m$, está compuesta de $m$ elementos de valor $1$. Mientras que las demás columnas constan de $m-1$ elementos de valor $2$, $m-2$ elementos de valor $3$ y así sucesivamente hasta llegar a los extremos con un solo elemento de valor $m$.

Roberto cree que la siguiente formula le será útil:
$$
1^2 + 2^2 + ... + k^2 = \frac{k(k+1)(2k+1)}{6}
$$

### Entrada:
Múltiples líneas. La primer línea con un entero $1 \leq n \leq 1000$, que representa la cantidad de casos de prueba. Cada paso consiste de un entero $1 \leq m \leq 10^6$, indicando la altura de la pirámide.

### Ejemplo 1:

__Entrada__
```
3
5
4
100
 
```
__Salida__
_Suma de los elementos por caso_
```
65
36
343300
```

## Result:

___Según columnas___

$$
1(m) + 2(m-1)2 + 3(m-2)2 + ... + m(1)2
$$

$$
2[2(m-1) + 3(m-2) + ... + m(1)] + m
$$

$$
\sum_{n=1}^{m}2n(m-(n-1))+m
$$

```
for (int i = 0; i < count; i++) {
	int m = sc.nextInt();
	int sum = 0;
	for (int n = 0; n < m; n++)
		sum += n * (m - n + 1) * 2;
	sum += m;
	System.out.println(sum);
}
```

```
javac E.java
java -Xms256m -Xmx256m E
```

```
3
5
4
100
 65
36
343300
Time (ms): 0.87
```
<br>

___Según filas___

$fila_1 = 1$

$fila_2 = 2 + 1 +2 = 2(2) + 1$

$fila_3 = 3 + 2 + 1 +2 + 3 = 2(3) + 2(2) + 1$

$$
fila_n = 2(n) + 2(n-1) + 2(n-2) +...+2(2) + 1
$$

$$
fila_n = (\sum_{i=1}^{n}2i) - 1
$$

$$
fila_n = 2(\sum_{i=1}^{n}i) - 1
$$

$$
fila_n = 2\frac{n(n+1)}{2} - 1 = n(n+1) - 1
$$

Total de la pirámide de altura $m$:

$$
total = \sum_{n=1}^{m}n(n+1)-1
$$

$$
total = \sum_{n=1}^{m}n^2 + n - 1
$$

$$
total = \sum_{n=1}^{m}n^2 + \sum_{n=1}^{m} n - \sum_{n=1}^{m}1
$$

$$
total = \frac{m(m+1)(2m+1)}{6} + \frac{m(m+1)}{2} - m
$$

```
for (int  i = 0; i < count; i++) {
	int  m = sc.nextInt();
	int  sum = m*(m + 1)*(2*m + 1)/6 + m*(m + 1)/2 - m;
	System.out.println(sum);
}
```
```
javac E.java
java -Xms256m -Xmx256m E
```
```
3
5
4
100
 65
36
343300
Time (ms): 0.5622
```

