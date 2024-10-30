package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragANDdrop {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        driver.manage().window().maximize();

        // Switch to iframe using CSS selector for compound classes
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));

        // Locate elements to drag and drop
        WebElement drag1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement dropArea = driver.findElement(By.id("trash"));  // Simplified locator by ID

        // Perform drag and drop
        Actions act = new Actions(driver);
        act.dragAndDrop(drag1, dropArea).perform();
        Thread.sleep(1000);

        driver.quit();
    }
}
