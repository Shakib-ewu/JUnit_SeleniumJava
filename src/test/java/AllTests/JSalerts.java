package AllTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class JSalerts {

    public static void main(String[] args) {
        
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://the-internet.herokuapp.com/");
        
        // Navigate to the JavaScript Alerts page
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        
        // Click on the button to trigger JS Prompt
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert and interact with it
        Alert alert = driver.switchTo().alert();
        String textOnAlert = alert.getText();
        System.out.println(textOnAlert);
        
        // Send text to the prompt and accept the alert
        alert.sendKeys("Sakib");
        alert.accept();
        
        // Verify and print the result text after interacting with the prompt
        String resultText = driver.findElement(By.id("result")).getText();
        System.out.println(resultText);
        
        // Close the browser
        driver.quit();
    }
}
