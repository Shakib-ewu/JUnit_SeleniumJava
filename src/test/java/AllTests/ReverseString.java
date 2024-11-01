package AllTests;

public class ReverseString {

	public static void main(String[] args) {
		
	        String original = "Hello, World!";
	        String reversed = reverseString(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }

	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	    }
	}


