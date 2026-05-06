package selenium_demo.selenium_java_new;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    WebElement usernametext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Username']")));
		WebElement username=driver.findElement(RelativeLocator.with(By.tagName("input")).below(usernametext));
		username.sendKeys("Admin");
		WebElement passwordtext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		WebElement password=driver.findElement(RelativeLocator.with(By.tagName("input")).below(passwordtext));
		password.sendKeys("admin123");

	}

}
