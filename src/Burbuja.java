// Burbuja.java


public class Burbuja {
    /**
     * Ordena un arreglo de enteros de forma ascendente mediante el metodo
     * e la burbuja. El arreglo recibido se modifica directamente
     */
    public static void ordenar(int[] arr) {
        int n = arr.length; // numero total de elementos
        boolean intercambiado;

        // ciclo interno que compara de manera interna con la parte no ordenada
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    intercambiado = true;
                }
            }
            // si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            // Agrega coma y espacio después de cada elemento excepto el ultimo
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
