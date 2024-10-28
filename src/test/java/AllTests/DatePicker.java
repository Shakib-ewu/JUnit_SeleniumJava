package AllTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://jqueryui.com/datepicker/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(0);
        
        String year="2022";
        String date="22";
        String month="June";
        
        
        //date picker expected data
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        while(true) {
        	String monthpicker=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	String yearpicker=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	
        	if(monthpicker.equals(month) && yearpicker.equals(year)) {
        		break;
        	}
        	
        		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        	}
        
        List<WebElement> datepicker=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
        
        for(WebElement dt:datepicker) {
        	if(dt.getText().equals(date)) {
        		dt.click();
        		break;
        	}
        }
        
        driver.quit();
        	
        	
        }

	}


