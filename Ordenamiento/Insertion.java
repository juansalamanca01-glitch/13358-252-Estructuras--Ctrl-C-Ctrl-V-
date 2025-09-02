public class Insertion {

    public static void insertionSort(int[] A) {
        int N = A.length;  // Corrección: A.length (no A, length con coma)
        int i = 1;

        while (i < N) {
            int currentElement = A[i];
            int j = i - 1;

            // Corrección: && en lugar de %%, y j >= 0 && A[j] > currentElement
            while (j >= 0 && A[j] > currentElement) {
                A[j + 1] = A[j];
                j = j - 1;
            }

            A[j + 1] = currentElement;  // Corrección: fuera del while interno
            i = i + 1;
        }
    }

    public static void main(String[] args) {  // Corrección: void faltante
        int[] array = {5, 1, 8, 9, 12, 3, 4};  // Corrección: punto y coma faltante

        insertionSort(array);  // Corrección: nombre del método
        System.out.println(java.util.Arrays.toString(array));  // Corrección: Arrays (no Arrys), y paquete completo
    }
}