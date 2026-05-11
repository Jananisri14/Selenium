package selenium_demo.selenium_java_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		WebElement choosefile = driver.findElement(By.id("uploadFile"));
		choosefile.sendKeys("C:\\Users\\janan\\Downloads\\Offer Letter.pdf");

	}

}
