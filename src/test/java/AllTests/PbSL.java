package AllTests;

public class PbSL {

	public static void main(String[] args) {
		
		String text="This is java programm";
		String text1 = text.replaceAll("\\s+", "");
		System.out.println(text1);
		
		 // Reverse the string without spaces
        String reversedText = new StringBuilder(text1).reverse().toString();
        System.out.println("Reversed text: " + reversedText);
	}

}
