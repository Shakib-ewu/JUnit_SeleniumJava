package AllTests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		 Integer[] originalArray = {1, 2, 3, 4, 5};

	        List<Integer> list = Arrays.asList(originalArray);
	        Collections.reverse(list);

	        System.out.print("Reversed Array: ");
	        for (int num : list) {
	            System.out.print(num + " ");
	        }

	}

}
