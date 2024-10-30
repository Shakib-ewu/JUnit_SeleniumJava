package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        

      
      //here is iframe so wee need to switch
        driver.switchTo().frame("iframeResult");
     
        WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        
        field1.clear();
        field1.sendKeys("Dell karnegi");
        Actions act=new Actions(driver);
        act.doubleClick(button).perform();
      
        String text=field2.getAttribute("value");
        System.out.println(text);
        
        if(text.equals("Dell karnegi")) {
        	System.out.println("Right");
        }
        else {
        	System.out.println("not correct");
        }


	}

}
