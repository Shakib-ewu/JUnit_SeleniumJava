package AllTests;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        // Input array
        int a[]  = {15, 42, 67, 89, 34, 99, 78};

        // Sorting the array in ascending order
        Arrays.sort(a);

        // Printing the sorted array
        System.out.println("Sorted array:");
        /*for (int i : a) {
            System.out.print(i + " ");
        }*/
        System.out.println(Arrays.toString(a));
    }
}

