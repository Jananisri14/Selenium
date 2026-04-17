package selenium_demo.selenium_java_new;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class selectclassdemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement UIautomation=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dropdown=new Select(UIautomation);
		List<WebElement> list1=dropdown.getOptions();
		System.out.println("The drop down options size:"+list1.size());
		System.out.println("The drop down options are: ");
		for(WebElement ls:list1) {
			System.out.println(ls.getText());
		}
		Boolean multiple=dropdown.isMultiple();
		System.out.println("The multiple options available: "+multiple);
		dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Puppeteer");
	}

}
