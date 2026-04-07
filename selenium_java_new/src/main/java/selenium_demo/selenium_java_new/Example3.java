package selenium_demo.selenium_java_new;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(5000);//without thread it throws error -> unable to locate element
		driver.findElement(By.linkText("Facebook")).click();
		
		

	}

}
