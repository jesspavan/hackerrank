package estruturasDeDados.sortingAlgorithms;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int length = arr.length;

        // Build max heap
        for (int i = (length / 2) - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }

        // Extract elements from heap one by one
        for (int i = length - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }

    }

    public static void heapify(int[] arr, int length, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < length && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < length && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap the root and the largest element
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, length, largest);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
