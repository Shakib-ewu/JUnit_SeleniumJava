package AllTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://testautomationpractice.blogspot.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        //Getting all table row and column
     // Locate the table
       // WebElement bookTable = driver.findElement(By.xpath("//table[@name='BookTable']"));

        // Locate all rows in the table (including header if any)
      /*  List<WebElement> allRows = bookTable.findElements(By.tagName("tr"));

        // Loop through each row
        for (WebElement row : allRows) {
            // Locate all columns (cells) in the current row
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Loop through each cell and print the text
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t"); // Tab space for better readability
            }
            System.out.println(); // Newline after each row
        }*/
        
        
     // Locate the table
      /*  WebElement bookTable = driver.findElement(By.xpath("//table[@name='BookTable']"));

        // Locate all rows in the table (assuming the first row is the header)
        List<WebElement> allRows = bookTable.findElements(By.tagName("tr"));

        // Loop through each row starting from the second row (index 1) if the first row is a header
        for (int i = 1; i < allRows.size(); i++) {
            // Get all cells in the current row
            List<WebElement> columns = allRows.get(i).findElements(By.tagName("td"));
            
            // Check if the author's name is "Mukesh" (assuming Author is the second column)
            if (columns.get(1).getText().equalsIgnoreCase("Mukesh")) {
                // Print the book name (assuming Book Name is the first column)
                System.out.println("Book Name: " + columns.get(0).getText());
            }
        }*/
        
        
        
     // Find the total price of all the books
        
        int total = 0;

     // Find the number of rows in the table (excluding the header if there is one)
     List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

     // Loop through each row, starting from the second row if the first is a header
     for (int r = 2; r <= rows.size(); r++) {
         // Get the price from the fourth column
         String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
         
         // Parse price to an integer and add to total
         total += Integer.parseInt(price.replaceAll("[^0-9]", ""));
     }

     // Print the total
     System.out.println("Total Price of All Books: " + total);

     



        
        driver.quit();

        
		

}
}
