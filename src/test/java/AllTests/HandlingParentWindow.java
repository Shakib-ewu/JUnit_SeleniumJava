package AllTests;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HandlingParentWindow {

    public static void main(String[] args) {
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        // Click to open the popup window
        driver.findElement(By.linkText("Open a popup window")).click();

        // Store the parent window handle
        String parentWindow = driver.getWindowHandle();

        // Get all window handles (parent and the new window)
        Set<String> allWindowHandles = driver.getWindowHandles();
        String secondWindowHandle = null;

        // Iterate through window handles to find the second window
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindow)) {
                secondWindowHandle = windowHandle;
                driver.switchTo().window(secondWindowHandle);
                System.out.println("Switched to second window: " + driver.getTitle());

                // Perform an action in the second window
                WebElement paragraphElement = driver.findElement(By.tagName("h3"));
                String paraText = paragraphElement.getText();
                System.out.println("Paragraph text in second window: " + paraText);

                // Keep the second window open, do not close it
            }
        }

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to parent window: " + driver.getTitle());

        // Perform an action in the parent window (e.g., clicking the Blogger link)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement bloggerLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Blogger")));
        bloggerLink.click();  // Perform the click action in the parent window

        // Now switch back to the second window for further actions if necessary
        driver.switchTo().window(secondWindowHandle);
        System.out.println("Back to second window: " + driver.getTitle());

        // Close both windows in the correct order
        driver.switchTo().window(secondWindowHandle).close();  // Close second window
        driver.switchTo().window(parentWindow).close();  // Close parent window

        // Quit the driver after both windows are closed
        driver.quit();
    }
}
