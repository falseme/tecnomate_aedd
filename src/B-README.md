
(nov 23)

# Ejercicio B - Bug en la Matrix

_Tiempo límite: 1s_ | _Memoria límite: 256MB_

### Resumen:
Julián inventó un artefacto llamado SIMP. Son unas gafas que permiten ver el código genotípico subyacente de las personas. Resulta que cuando una persona estaba enferma el código tenía un patrón irregular, se encontraba lleno de bugs.

El código genotípico está determinado por la matriz $n \times m$, compuesta por letras mayúsculas y minúsculas del alfabeto inglés. El nivel de enfermedad se mide de acuerdo a la cantidad de veces que aparece la palabra bug de forma horizontal o vertical, sin diferenciar entre mayúsculas y minúsculas.

### Entrada:
Una línea con las filas y columnas de la matriz $1 \leq n, m \leq 10^3$ y luego `n` líneas con `m` caracteres del alfabeto inglés.

### Ejemplo 1:

__Entrada__
```
4 5
bgbzb
oujau
gbgsg
cvbbd
 
```
__Salida__
```
2
```
### Ejemplo 2:

__Entrada__
```
4 3
bug
ugb
gbu
bug
```
__Salida__
```
4
```

### Result:

```
javac B.java
java -Xms256m -Xmx256m B
```

```
4 5
bgbzb
oujau
gbgsg
cvbbd
 
ENFERMEDAD: 2
Time (ms): 9.8174
```

