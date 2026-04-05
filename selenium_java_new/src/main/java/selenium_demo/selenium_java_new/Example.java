package selenium_demo.selenium_java_new;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        WebElement password = driver.findElement(By.id("TextPassword"));
        WebElement email_above = driver.findElement(
            with(By.tagName("input")).above(password)
        );

        email_above.sendKeys("testuser@gmail.com");
        WebElement email_below = driver.findElement(
            with(By.tagName("input"))
            .below(driver.findElement(By.xpath("//td[text()='Email']")))
        );
        email_below.sendKeys("belowuser@gmail.com");
        driver.close();
    }
}