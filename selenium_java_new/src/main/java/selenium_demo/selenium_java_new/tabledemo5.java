package selenium_demo.selenium_java_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabledemo5 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("srisjanani24@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("janani@123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		WebElement data=driver.findElement(By.xpath("//tr[2]"));
		System.out.println(data);

	}

}
