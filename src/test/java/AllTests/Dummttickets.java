package AllTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dummttickets {

    public static void main(String[] args) {
    	ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Set implicit wait once

        try {
            driver.get("https://dummy-tickets.com/");

            // Click 'Both' option
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Both']"))).click();

            // Enter source location
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='source[]'])[4]")));
            inputField.sendKeys("Delhi");

            // Click heading to proceed
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='heading']"))).click();

            // Enter destination location
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='destination[]'])[4]"))).sendKeys("Dhaka");

            // Select specific airport option
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Zia International Airport Dhaka,']"))).click();

            // Enter city
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='city[]'])[2]"))).sendKeys("Dhaka");

            // Click on the city suggestion
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Dhaka']"))).click();

            // Select departure date
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@class,'departurefrom_1 ')][1])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='19']"))).click();

            // Select return date
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Check Out Date'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='30']"))).click();

            // Click to buy the ticket
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='both_oneway']//input[@value='Buy Dummy Ticket']"))).click();

        } catch (Exception e) {
            e.printStackTrace();  // Print the exception stack trace
        } finally {
            driver.quit();  // Ensure the driver is closed after execution
        }
    }
}
