package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	//HTML Dropdown

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://omayo.blogspot.com/");
        
     WebElement dropdown=   driver.findElement(By.id("drop1"));
     
     Select select=new Select(dropdown);
     select.selectByVisibleText("doc 1");
     select.selectByValue("jkl");
     select.selectByIndex(2);

	}

}
