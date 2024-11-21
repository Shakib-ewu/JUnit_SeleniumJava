package AllTests;

public class MinnumberArray {
    public static void main(String[] args) {
       
        int a[]  = {10, 50, 30, 70, 20, 90};
        int min = a[0];

        for (int num : a) {
            if (num < min) {
                min = num; // Update max if a larger number is found
            }
        }

        // Print the largest number
        System.out.println("The largest number in the array is: " + min);
    }
}

