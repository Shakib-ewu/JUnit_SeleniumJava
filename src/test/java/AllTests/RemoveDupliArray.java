package AllTests;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDupliArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Convert array to LinkedHashSet to remove duplicates and maintain order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert back to array
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();

        // Print the result
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}

