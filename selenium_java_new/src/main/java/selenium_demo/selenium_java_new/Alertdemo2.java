package selenium_demo.selenium_java_new;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Alertdemo2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement element=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']//span[@class='ui-button-text ui-c'][normalize-space()='Show']"));
		element.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("OK");
		alert.accept();
		
		
		

	}

}
