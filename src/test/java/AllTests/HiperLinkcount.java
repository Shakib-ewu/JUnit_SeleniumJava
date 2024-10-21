package AllTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiperLinkcount {
	
	public static void main(String[] args) {
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://rubinoshoes.com/");
        
        //classname
        @SuppressWarnings({ })
		List<WebElement> HyperLinks=driver.findElements(By.tagName("a"));
        
        for(WebElement e: HyperLinks) {
        	System.out.println(e.getAttribute("href"));
        }
        System.out.println("Total hyperlinks: " + HyperLinks.size());
        
      
        

        // Close the browser
        driver.close();
    }

}