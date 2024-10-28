package AllTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dummttickets {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://dummy-tickets.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.switchTo().frame("col-xl-5 col-lg-6 col-md-12");

        driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
       // Thread.sleep(1000);
        


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='source[]'])[4]")));
        inputField.sendKeys("Delhi");
        driver.findElement(By.xpath("//p[@class='heading']")).click();



        //driver.findElement(By.xpath("//input[@id='flight_oneway_btn']")).click();
        
        
        
        
	}

}
