package selenium_demo.selenium_java_new;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		WebElement element=driver.findElement(By.cssSelector("input#username"));
		element.sendKeys("jananisathishkumar380@gmail.com");
		WebElement element2=driver.findElement(By.cssSelector("input#password"));
		element2.sendKeys("Janani@12");
		driver.findElement(By.cssSelector("button[class^=\"btn__primary--large from__button--floating\"]")).click();
		String currentUrl = driver.getCurrentUrl();
		 if (currentUrl.contains("feed")) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Failed");
	        }
		
		}

}
