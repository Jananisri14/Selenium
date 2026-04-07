package selenium_demo.selenium_java_new;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example12 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement iframeelement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeelement);
		String frame_1=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by Locator:"+frame_1);
		driver.switchTo().defaultContent();
		String mainPage=driver.findElement(By.xpath("//div[@id='frame1Wrapper']")).getText();
		System.out.println("Back to Main Page: "+mainPage);
		
		
		

	}

}
