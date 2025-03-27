import java.util.Arrays;

public class QuickSort {

    // Method to perform the QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot element such that elements smaller than the pivot are on the left
            // and elements greater than the pivot are on the right
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1);  // Sort the left part
            quickSort(arr, pivotIndex + 1, high); // Sort the right part
        }
    }

    // Partition method to find the correct position of the pivot
    public static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = arr[high];
        int i = (low - 1);  // Index of smaller element

        // Iterate through the array to rearrange elements around the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Main method to test the QuickSort
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
