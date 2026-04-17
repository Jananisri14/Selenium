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
public class Alertdemo3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement element=driver.findElement(By.xpath("//span[normalize-space()='Delete']"));
		element.click();
		WebElement text=driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']"));
		System.out.println(text.getText());
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

}
