package AllTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://www.google.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.name("q")).sendKeys("Messi");
        
        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@role,'listbox')]//li//div[@role='option']"));
        System.out.println(options.size());
        
        for(int i=0; i<options.size(); i++ )
        {
     	   System.out.println(options.get(i).getText());
     	   
     	   if(options.get(i).getText().equals("messi height")) 
     	   {
     		   options.get(i).click();
     		   break;
     	   }
        }
        driver.quit();
        
        }

}
