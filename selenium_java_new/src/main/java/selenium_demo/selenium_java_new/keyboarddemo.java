package selenium_demo.selenium_java_new;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class keyboarddemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions act=new Actions(driver);
		WebElement compendiumlink=driver.findElement(By.linkText("compendiumdev"));
		act.keyDown(Keys.CONTROL).moveToElement(compendiumlink).click().keyUp(Keys.CONTROL).build().perform();
		String parentwindow=driver.getWindowHandle();
		Set<String> windowhandles=driver.getWindowHandles();
		for(String handles:windowhandles) {
			driver.switchTo().window(handles);
		}
		Thread.sleep(3000);
		System.out.println("Child Window is "+windowhandles);
		driver.switchTo().window(parentwindow);
	}

}
