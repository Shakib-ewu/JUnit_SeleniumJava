package AllTests;

import java.util.Scanner;

public class VowelsConsosnents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase for case-insensitive comparison
        String lowerCaseInput = input.toLowerCase();

        // Loop through each character in the string
        for (char ch : lowerCaseInput.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if it's an alphabet
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Print results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
