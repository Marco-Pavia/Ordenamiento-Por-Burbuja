// Main.java

public class Main {
    /**
     *
     * Clase principal que demuestra el fncionamiento del ordenamiento de Burbuja
     * Punto de entrada del programa
     */
    public static void main(String[] args) {
        // arreglo de prueba desordenado
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        // imprime arreglo original sin ordenamiento
        System.out.println("Arreglo original:");
        Burbuja.imprimirArreglo(arreglo);

        // ordena el arreglo en el mismo lugar de forma ascendente
        Burbuja.ordenar(arreglo);

        System.out.println("Arreglo ordenado:");
        Burbuja.imprimirArreglo(arreglo);
    }
}

