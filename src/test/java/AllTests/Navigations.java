package AllTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Navigations {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://omayo.blogspot.com/");
        
        
        
        @SuppressWarnings("unused")
		List<WebElement> links= driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
        
        int NoOflinks=links.size();
        
        String path = "(//div[@id='LinkList1']//a)";
        for (int i=1;i<=NoOflinks;i++)
        {
        	String elementPath=path+"["+i+"]";
        	driver.findElement(By.xpath(elementPath)).click();
        	driver.navigate().back();
        }

        
        driver.close();
    }
}