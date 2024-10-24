package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
        
        //driver.findElement(By.xpath("//span[text()='Customer Success Manager']")).click();
        
        List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
        
       System.out.println(options.size());
       
       for(int i=0; i<options.size(); i++ )
       {
    	   System.out.println(options.get(i).getText());
       }
       driver.close();
        
	}
	

}
