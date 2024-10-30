package AllTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement option=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        
        Actions act= new Actions(driver);
        //right click method
        act.contextClick(option).perform();
        
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        
        driver.quit();
        
        
        
        
	}

}
