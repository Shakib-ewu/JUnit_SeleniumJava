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
        WebElement bookTable = driver.findElement(By.xpath("//table[@name='BookTable']"));

        // Locate all rows in the table (including header if any)
        List<WebElement> allRows = bookTable.findElements(By.tagName("tr"));

        // Loop through each row
        for (WebElement row : allRows) {
            // Locate all columns (cells) in the current row
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Loop through each cell and print the text
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t"); // Tab space for better readability
            }
            System.out.println(); // Newline after each row
        }
        
        driver.quit();

        
		

}
}
