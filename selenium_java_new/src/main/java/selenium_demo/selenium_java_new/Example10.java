package selenium_demo.selenium_java_new;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Example10 {
	public static void main(String []args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		//Count of window - 1
		Set<String> allwindowHandles=driver.getWindowHandles();
		System.out.println("Count of Window:"+allwindowHandles.size());
		//Open a child window
		driver.findElement(By.id("windowButton")).click();
		//Count of windows ,changed from 1 to 2
		Set<String> newallwindowHandles=driver.getWindowHandles();
		System.out.println("New Count of Window:"+newallwindowHandles.size());
		String ParentHandle=driver.getWindowHandle();
		Iterator<String> iterator=newallwindowHandles.iterator();
		String mainwindow=iterator.next();
		String childwindow=iterator.next();
		System.out.println("Parent Window: "+mainwindow);
		System.out.println("Child Window: "+childwindow);
		//Switch 
		driver.switchTo().window(childwindow);
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println("Child Title: "+text.getText());
		//close the child window
		driver.close();
		//Switch back to parent window
		driver.switchTo().window(ParentHandle);
		System.out.println("Parent Title: "+driver.getTitle());
		driver.quit();
		
		
		
		
		
		
	}

}
