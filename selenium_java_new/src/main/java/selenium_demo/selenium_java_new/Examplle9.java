package selenium_demo.selenium_java_new;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Examplle9 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))
        );
        username.sendKeys("2k22aids14@kiot.ac.in");
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("janani@123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String checking = driver.findElement(By.id("nameofuser")).getText();

        if (checking.contains("Welcome")) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login Failed");
        }
    }
}
