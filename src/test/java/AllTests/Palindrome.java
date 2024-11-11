package AllTests;

public class Palindrome {

	public static class PalindromeChecker {

	    public static boolean isPalindrome(String str) {
	        // Convert the string to lowercase to make the check case-insensitive
	        str = str.toLowerCase();

	        // Initialize pointers to start from the beginning and end of the string
	        int left = 0;
	        int right = str.length() - 1;

	        // Check characters from both ends moving towards the center
	        while (left < right) {
	            // If characters at both pointers don't match, it's not a palindrome
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            // Move the pointers closer to the center
	            left++;
	            right--;
	        }
	        // If all characters match, it's a palindrome
	        return true;
	    }

	    public static void main(String[] args) {
	        String word = "Madam";
	        if (isPalindrome(word)) {
	            System.out.println(word + " is a palindrome.");
	        } else {
	            System.out.println(word + " is not a palindrome.");
	        }
	    }
	}


}
