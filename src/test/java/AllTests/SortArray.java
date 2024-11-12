package AllTests;


	import java.util.Arrays;

	public class SortArray {
	    public static void main(String[] args) {
	        int[] numbers = {5, 3, 8, 4, 2, 7, 1};

	        // Sorting the array in ascending order
	        Arrays.sort(numbers);

	        // Displaying the sorted array
	        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

	        // If you need to sort in descending order
	        Integer[] numbersDesc = {5, 3, 8, 4, 2, 7, 1}; // Use Integer instead of int for descending sort
	        Arrays.sort(numbersDesc, (a, b) -> b - a);

	        System.out.println("Sorted array in descending order: " + Arrays.toString(numbersDesc));
	    }
	}


