package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Auth {

    public static void main(String[] args) {
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();		

        // Add an explicit wait to wait for the Tablets link to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Wait for max 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tablets")));

        // Click on the Tablets link
        driver.findElement(By.linkText("Tablets")).click();

        // Close the browser
        driver.close();
    }
}