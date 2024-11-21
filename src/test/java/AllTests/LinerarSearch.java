package AllTests;

public class LinerarSearch {
    public static void main(String[] args) {
        int[] array = {10, 25, 30, 45, 50, 75, 90}; // Array to search
        int target = 45; // Target element to find

        // Perform linear search
        boolean found = false; // Flag to indicate if the target is found
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element is " + target + " found ");
                found = true;
                break; // Exit the loop once the target is found
            }
        }

        // If target is not found
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
