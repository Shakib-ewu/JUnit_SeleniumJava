package AllTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

@SuppressWarnings("unused")
public class keyboaedActions {

    public static void main(String[] args) {
    	ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ico-register']")));
        
        //swtching window command
        //driver.switchTo().newWindow(WindowType.WINDOW);

        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(button).keyUp(Keys.CONTROL).perform();

        // Optionally close the driver
        driver.quit();
    }
}
