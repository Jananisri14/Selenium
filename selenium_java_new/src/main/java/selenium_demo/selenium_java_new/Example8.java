package selenium_demo.selenium_java_new;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Example8 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        WebElement revealBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("reveal"))
        );
        revealBtn.click();
        WebElement inputBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("revealed"))
        );
        inputBox.sendKeys("Add a Circle");
        String enteredText = inputBox.getAttribute("value");
        System.out.println("Entered Text: " + enteredText);

        driver.close();
    }
}