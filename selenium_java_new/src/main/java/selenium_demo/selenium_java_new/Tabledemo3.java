package selenium_demo.selenium_java_new;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Tabledemo3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println(rows.size());
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println(cols.size());
		

	}

}