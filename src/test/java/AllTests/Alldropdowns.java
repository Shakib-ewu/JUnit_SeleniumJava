package AllTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alldropdowns {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://omayo.blogspot.com/");
        
     WebElement dropdownelement=   driver.findElement(By.id("drop1"));
     Select dropdown=new Select(dropdownelement);
     
     List<WebElement> allOptions=dropdown.getOptions();
     
     for(WebElement option:allOptions) {
    	 
    	 System.out.println(option.getText());
     }
     
     driver.quit();
     
     
     
	}

}
