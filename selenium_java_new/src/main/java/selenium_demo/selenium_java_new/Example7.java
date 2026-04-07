package selenium_demo.selenium_java_new;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Example7 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		//driver.findElement(By.id("timerButton")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#alert2")));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input#alert2")));
		driver.findElement(By.cssSelector("input#alert2")).click();
		
	

	}

}