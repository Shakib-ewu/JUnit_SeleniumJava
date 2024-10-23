package AllTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	
	        driver.get("https://testautomationpractice.blogspot.com/");
	        
	        driver.findElement(By.id("alertBtn")).click();
	        Thread.sleep(3000);
	        
	        Alert alert=driver.switchTo().alert();
	        String textOnAlert= alert.getText();
	        System.out.println(textOnAlert);
	        alert.accept();
	        driver.quit();
	        

	}

}
