# Burbuja

Programa de ejemplo en Java que ordena un arreglo de enteros mediante el
método de ordenamiento burbuja.

## Requisitos

- JDK de Java instalado.
- Git, si deseas clonar el repositorio.

Comprueba que Java y el compilador estén disponibles:

```bash
java -version
javac -version
```

## Clonar el proyecto

Desde una terminal, ejecuta el siguiente comando sustituyendo la URL por la
dirección real del repositorio:

```bash
git clone <URL_DEL_REPOSITORIO>
cd <CARPETA_DEL_REPOSITORIO>
```

Si descargaste este proyecto como archivo ZIP, descomprímelo y abre una
terminal en la carpeta `Burbuja 1`.

## Compilar

Desde la carpeta `Burbuja 1`, ejecuta:

```bash
javac -d out Burbuja.java Main.java
```

Esto compila las clases y coloca los archivos `.class` en la carpeta `out`,
respetando el paquete `Metodos_de_Ordenamiento`.

## Ejecutar

En la misma carpeta, ejecuta:

```bash
java -cp out Metodos_de_Ordenamiento.Main
```

La salida mostrará primero el arreglo original y después el arreglo ordenado.

## Modificar los datos

Para probar otros valores, edita el arreglo declarado en el método `main`
de `Main.java`, guarda los cambios y repite los pasos de compilación y ejecución.
