package selenium_demo.selenium_java_new;
import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class WaitsTest{
				public static void main(String[] args) throws InterruptedException{
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://omayo.blogspot.com/");
					Wait<WebDriver> wait =
					        new FluentWait<>(driver)
					            .withTimeout(Duration.ofSeconds(30))
					            .pollingEvery(Duration.ofSeconds(1))
					            .ignoring(ElementNotInteractableException.class);

					WebElement facebookoption = wait.until(new Function<WebDriver, WebElement>(){
						public WebElement apply(WebDriver driver) {
							return driver.findElement(By.linkText("Facebook"));
						}
					});
					facebookoption.click();
				}
			}