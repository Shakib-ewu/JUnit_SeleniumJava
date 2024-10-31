import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver executable
    	 WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/FileUpload.html");
        driver.manage().window().maximize();
        
        
        
        driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("C:\\Users\\sakib\\Selenium\\sakib.txt");
        Thread.sleep(1000);
        driver.quit();

    }
}
