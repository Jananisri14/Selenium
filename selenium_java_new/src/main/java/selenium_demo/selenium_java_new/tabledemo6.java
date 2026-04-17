package selenium_demo.selenium_java_new;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabledemo6 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("srisjanani24@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("janani@123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		List <WebElement> data=driver.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));//for retriving names
		String expectedname="Ajay";
		int count=data.size();
		System.out.println("Total count in the table:"+count);
		for(WebElement name:data) {
			System.out.println(name.getText());
		}
		int i=1;
		for(WebElement name:data) {
			if(name.getText().equals(expectedname)) {
				List<WebElement> actualdata=driver.findElements(By.xpath("//table[@id='myTable']/tr["+i+"]"));
				for(WebElement row:actualdata) {
					System.out.println(row.getText());
				}
			}
			i++;
		}
		
	}

}
