import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAlgorithm {

    // Q1
    // Time complexity is O(n^2) | Space complexity is O(1)
    private static int[] hybridSort(int[] array) {
        // Your Answer
        int n = array.length;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }

    // Q2
    // Time ? | Space ?
    private static int[] organiserSort(int[] array, int[] order) {// Do not edit
        // Your Answer
        return array;
    }

    // Q3
    // Time ? | Space ?
    private static int[] modifiedCountingSort(int[] array) {// Do not edit
        // Your Answer
        return array;
    }

    // Q4
    // Time ? | Space ?
    private static int[] mountainSort(int[] array) {// Do not edit
        // Your Answer
        return array;
    }

    private static void swap(int[] array, int i, int j) {// Do not edit
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
        // You can edit here for your own testing
        int[] inputArray = { 9, 8, 7, 6 };

        // Applying Hybrid Sort
        hybridSort(inputArray);
    }

}