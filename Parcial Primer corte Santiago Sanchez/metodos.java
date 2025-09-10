public class AlgoritmosOrdenamiento {

    // -------- Insertion Sort --------
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // -------- Selection Sort --------
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Buscar el menor en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el menor con la posición actual
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // -------- Bubble Sort --------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no hubo cambios, el arreglo ya está ordenado
            if (!swapped) break;
        }
    }

    // -------- Método para imprimir el arreglo --------
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // -------- Main --------
    public static void main(String[] args) {
        int[] arr1 = {12, 11, 13, 5, 6};
        int[] arr2 = {29, 10, 14, 37, 13};
        int[] arr3 = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Insertion Sort:");
        printArray(arr1);
        insertionSort(arr1);
        printArray(arr1);

        System.out.println("\nSelection Sort:");
        printArray(arr2);
        selectionSort(arr2);
        printArray(arr2);

        System.out.println("\nBubble Sort:");
        printArray(arr3);
        bubbleSort(arr3);
        printArray(arr3);
    }
}
