package AllTests;

import java.util.Arrays;

public class mergeTwoarray {
    public static void main(String[] args) {
        // Define two arrays to be merged
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Call the merge function
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create a new array with length equal to the sum of both arrays
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy elements from the first array
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);

        // Copy elements from the second array
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        return mergedArray;
    }
}



