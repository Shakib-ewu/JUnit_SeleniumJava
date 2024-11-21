package AllTests;

public class FindDuplicate {
    public static void main(String[] args) {
        // Input array
        int[] array = {4, 5, 6, 4, 7, 8, 5, 9,5,5};

        System.out.println("Duplicate elements in the array:");
        // Loop through each element in the array
       /* for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Check if current element matches any subsequent element
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }*/
        
        int num = 5;
        int count=0;
        for (int i = 0; i < array.length; i++) {
        if(array[i]==num){
        count++;
        }
    }
        System.out.println(count);
    }}


/*
 int[] array = {4, 5, 6, 4, 7, 8, 5, 9};
 num=5;
 int count=0;
 for (int i = 0; i < array.length; i++) {
 if(array[i]==num){
 count++
 }
 

*/