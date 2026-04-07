package selenium_demo.selenium_java_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class draganddropdemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		Actions act=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//p[@class='ui-widget-header']"));
		WebElement drag=driver.findElement(By.xpath("//p[normalize-space()='Drag to target']"));
		act.clickAndHold(drag).moveToElement(target).release().build().perform();//similar to Drag and Drop
	}

}
