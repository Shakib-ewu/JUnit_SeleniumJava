package AllTests;

public class largestOnArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {15, 42, 67, 89, 34, 99, 78};

        // Initialize the largest element with the first element of the array
        int largest = array[0];

        // Iterate through the array to find the largest element
        /*for (int i : array) {
            if (i > largest) {
                largest = i;
            }
        }*/
        
        for (int i=0;i<array.length; i++) {
        	if(array[i]>largest) {
        		largest=array[i];
        	}
        	
        }
        System.out.println("The largest element in the array is: " + largest);

        // Print the largest element
       // System.out.println("The largest element in the array is: " + largest);
    }
}


