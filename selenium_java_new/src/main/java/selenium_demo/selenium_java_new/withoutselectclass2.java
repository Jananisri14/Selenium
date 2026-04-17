package selenium_demo.selenium_java_new;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class withoutselectclass2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement element=driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
		WebElement element2=driver.findElement(By.xpath("//li[normalize-space()='Appium']"));
		act.moveToElement(element2).click().perform();
		}
}
