import java.util.Scanner;

public class HeapSort {
    public static void sort(int arr[]) {
        int n = arr.length;

        // Construir un heap (montículo) máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extraer elementos uno por uno del heap
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual al final del arreglo
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Llamar a heapify en el heap reducido
            heapify(arr, i, 0);
        }
    }

    // Función para convertir un subárbol en un heap
    private static void heapify(int arr[], int n, int i) {
        int largest = i; // Inicializar el más grande como la raíz
        int left = 2 * i + 1; // Índice del hijo izquierdo
        int right = 2 * i + 2; // Índice del hijo derecho

        // Si el hijo izquierdo es más grande que la raíz
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Si el hijo derecho es más grande que el más grande hasta ahora
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Si el más grande no es la raíz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente heapify el subárbol afectado
            heapify(arr, n, largest);
        }
    }

    // Función para imprimir un arreglo
    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Arreglo original:");
        printArray(arr);

        sort(arr);

        System.out.println("Arreglo ordenado:");
        printArray(arr);

        scanner.close();
    }
}
