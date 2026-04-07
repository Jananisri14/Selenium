package selenium_demo.selenium_java_new;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DemoActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsmenuelement=driver.findElement(By.id("blogsmenu"));
		Actions act=new Actions(driver);
		act.moveToElement(blogsmenuelement).perform();
		WebElement option2=driver.findElement(By.xpath("//span[normalize-space()='SeleniumByArun']"));
		act.moveToElement(option2).click().build().perform();
	}

}
