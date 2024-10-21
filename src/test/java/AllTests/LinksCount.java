package AllTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

		
		
		public static void main(String[] args) {
	        // Initialize the ChromeDriver
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://demo.opencart.com/");
	        driver.manage().window().maximize();	
	        
	        //classname
	        @SuppressWarnings({ })
			List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
	        System.out.println("total header links:" +headerLinks.size());
	        
	        //tagName
	        List<WebElement> links=driver.findElements(By.tagName("a"));
	        System.out.println("total header links:" +links.size());

	      
	        

	        // Close the browser
	        driver.close();
	    }

	}