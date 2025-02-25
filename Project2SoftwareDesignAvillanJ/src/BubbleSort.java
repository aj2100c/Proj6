/** Jaimeson Avillan
 * A class that demonstrates the implementation of the Bubble Sort algorithm.
 */
public class BubbleSort {

    /**
     * Sorts an array of integers in ascending order using the Bubble Sort algorithm.
     *
     * @param arr The array of integers to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Traverse through all elements of the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Prints the elements of the array.
     *
     * @param arr The array of integers to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Main method to test the Bubble Sort algorithm.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Example array to be sorted
        int[] myArray = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};

        System.out.println("Original array:");
        printArray(myArray);

        // Sort the array
        bubbleSort(myArray);

        System.out.println("Sorted array:");
        printArray(myArray);
    }
}
