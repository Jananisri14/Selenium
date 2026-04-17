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
public class withoutselectdemo {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
		searchbox.sendKeys("AWS");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		List<WebElement> options=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='j_idt87:auto-complete_hinput']/ul")));
		System.out.println(options.size());
		for(WebElement suggestions:options) {
			for(WebElement object:suggestions.findElements(By.xpath("//li[contains(text(),'AWS')]"))) {
				if(object.getText().equals("AWS")) {
					object.click();
				}
				
			}
		}
		
	}

}
