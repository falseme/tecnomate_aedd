
(nov 23)

# Ejercicio C - Contraseña Segura

_Tiempo límite: 1s_ | _Memoria límite: 256MB_

### Resumen (mucho texto en el pdf):
Una competición desea que cada participante tenga una contraseña para darse de alta del sistema.

Se ha establecido una contraseña `s` de tamaño `n` se considera segura cuando la totalidad de las condiciones siguientes sean satisfechas

- $5 \leq n \leq 32$
- $n$ debe ser un número impar
- El caracter central debe ser un número primo
- El primer caracter debe ser una letra minúscula
- El último caracter debe ser una letra mayúscula

### Entrada:
Múltiples líneas. La primer línea contiene un entero $1 \leq t \leq 100$, que representa la cantidad de casos de prueba. Cada caso contiene dos líneas. La primera con un entero $1 \leq n \leq 10^6$, siendo la longitud de la contraseña `s` y la segunda con la contraseña, compuesta con dígitos del 0 al 9 y letras mayúsculas y minúsculas del alfabeto inglés.

La suma del tamaño de todas las contraseña no supera $10^6$

### Ejemplo 1:

__Entrada__
```
3
11
sonMu1VagoS
7
xms7abC
14
demasiadoVagos
 
```
__Salida__
```
CONTRASENA NO SEGURA
CONTRASENA SEGURA
CONTRASENA NO SEGURA
```

### Result:

```
javac C.java
java -Xms256m -Xmx256m C
```

```
3
11
sonMu1VagoS
7
xms7abC
14
demasiadoVagos
 CONTRASENA NO SEGURA
CONTRASENA SEGURA
CONTRASENA NO SEGURA
Time (ms): 4.8479
```

