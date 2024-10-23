package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LightBox {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	
	        driver.get("https://tutorialsninja.com/demo/");
	        driver.findElement(By.name("search")).sendKeys("HP");
	        driver.findElement(By.xpath("//span[@class='input-group-btn']/button")).click();
	        
	        driver.findElement(By.linkText("HP LP3065")).click();
	        driver.findElement(By.xpath("//img [@title='HP LP3065']")).click();
	        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();
	        driver.quit();
	        
	        
	        
	        
	        
	        
	}

}
