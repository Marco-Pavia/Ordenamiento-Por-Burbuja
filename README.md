# Ordenamiento por Burbuja (Bubble Sort) en Java

Implementación del algoritmo de **ordenamiento por Burbuja** con la optimización de **bandera de intercambio**, que detiene el proceso cuando una pasada completa no realiza ningún cambio:

- **Burbuja** (`Burbuja`): contiene el método `ordenar` y el método auxiliar `imprimirArreglo`.
- **Main** (`Main`): clase principal que define el arreglo de prueba, lo ordena y muestra el resultado en consola.

**Autor:** Marco Antonio Pavia Flores.
**Materia:** AED-1026 Estructura de Datos — Unidad 5
**Docente:** Víctor Hugo Vásquez Herrera
**Institución:** Instituto Tecnológico Superior de Xalapa

## Lenguaje de programación

**Java** (JDK 17 o superior recomendado).

## Estructura del proyecto

```
Ordenamiento-Por-Burbuja/
├── README.md
├── AlgoritmosOrdenamientoInterno.iml
└── src/
    ├── Burbuja.java
    └── Main.java
```

| Archivo | Descripción |
|---|---|
| `Burbuja.java` | Algoritmo de burbuja: `ordenar(int[] arr)` e `imprimirArreglo(int[] arr)`. |
| `Main.java` | Clase principal: define el arreglo `{6, 1, 5, 8, 3, 2, 7, 4}`, lo ordena e imprime antes y después. |

Los archivos fuente se encuentran en la carpeta `src/` (proyecto de IntelliJ IDEA `AlgoritmosOrdenamientoInterno`).

## Fundamento teórico

El algoritmo compara pares de elementos adyacentes y los intercambia si están en el orden incorrecto. En cada pasada, el mayor de los elementos restantes "burbujea" hasta su posición final. La línea clave es la comparación con intercambio:

```java
if (arr[j] > arr[j + 1]) { /* intercambiar arr[j] y arr[j + 1] */ }
```

| Aspecto | Valor |
|---|---|
| Mejor caso (arreglo ya ordenado, con bandera) | **O(n)** |
| Caso promedio | **O(n²)** |
| Peor caso (orden inverso) | **O(n²)** |
| Espacio adicional | **O(1)** (ordena *in situ*) |
| Estabilidad | Estable |

## Cómo clonar, compilar y ejecutar

### Desde la terminal

1. Clona el repositorio y entra a la carpeta:
   ```bash
   git clone https://github.com/Marco-Pavia/Ordenamiento-Por-Burbuja.git
   cd Ordenamiento-Por-Burbuja
   ```
2. Compila los archivos desde la carpeta raíz (la que contiene a `src/`):
   ```bash
   javac -encoding UTF-8 -d out src/*.java
   ```
3. Ejecuta la clase principal:
   ```bash
   java -cp out Main
   ```

### Desde IntelliJ IDEA

1. Abre la carpeta del proyecto con *File → Open*.
2. Verifica que `Burbuja.java` y `Main.java` estén dentro de la carpeta `src`.
3. Abre `Main.java` y presiona el botón verde ▶ junto al método `main`.

## Datos de prueba

```java
int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};
```

## Ejemplo de ejecución (`Main.java`)

```
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado:
[1, 2, 3, 4, 5, 6, 7, 8]
```
