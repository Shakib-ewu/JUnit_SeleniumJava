package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();	
        
        driver.findElement(By.className("input_error")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        
        
        // Store the current window handle
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
        
        
        //ATC
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.name("checkout")).click();
        
        //checkout information
        driver.findElement(By.id("first-name")).sendKeys("Sakib");
        driver.findElement(By.id("last-name")).sendKeys("Hasan");
        driver.findElement(By.id("postal-code")).sendKeys("01105");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
        
      
        

        // Close the browser
        //driver.close();
        driver.quit();
    }

}