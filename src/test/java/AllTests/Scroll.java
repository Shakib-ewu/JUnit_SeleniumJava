package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Scroll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rubinoshoes.com/");  // Replace with your actual URL
        driver.manage().window().maximize();

        try {
            // Find the element using a simplified XPath

        	//a[@class='flex justify-center text-center text-blue text-[19px] font-medium font-Mulish leading-7 mx-auto']
        	//div[@class='text-center text-black text-[30px] md:text-[30px] lg:text-[30px] xl:text-[30px] 2xl:text-[38px] font-black font-Mulish leading-10 pb-3 lg:pb-6 sm:pb-3 md:pb-3']
        	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
        		    By.xpath("//a[contains(@class, 'text-center')]")
        		));


            // Scroll to the element if found
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);
            
        } catch (Exception e) {
            System.out.println("Element not found or other error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
