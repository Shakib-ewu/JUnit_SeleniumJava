package AllTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdowns {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();//select a portion of class name
        driver.findElement(By.xpath("//input[@value='Java']")).click();
        
        
        //capture all options
        
        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//label"));
        System.out.println("Number of options:"+options.size());
        for(WebElement option:options) {
       	 
       	 System.out.println(option.getText());
       	 
       	 
       	 //select ,ulti[le elements
       	 
       	 
        }
        for(WebElement option:options) {
        	String Option=option.getText();
        	if(Option.equals("Java") || Option.equals("Python") || Option.equals("MySQL") ) {
        		option.click();
        	}
        }
        

	}

}
