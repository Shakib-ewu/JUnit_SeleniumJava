package AllTests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Checkedexception {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            @SuppressWarnings("unused")
			FileReader reader = new FileReader(file);
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
