package selenium_demo.selenium_java_new;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItdemo {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pdf2doc.com/");
		WebElement file=driver.findElement(By.xpath("//span[normalize-space()='UPLOAD FILES']"));
		file.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("\"C:\\Users\\janan\\OneDrive\\Desktop\\Documents\\demo.exe\"");
		

	}

}
