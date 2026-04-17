package selenium_demo.selenium_java_new;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSdemo1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByName('name')[0].value='Janani'");
		jse.executeScript("document.getElementsByName('name')[1].value='Sri S'");
		jse.executeScript("document.getElementsByTagName('input')[2].value='srisjanani24@gmail.com'");
		jse.executeScript("document.getElementsByTagName('input')[3].value='123456'");
		jse.executeScript("document.getElementsByTagName('input')[4].value='123456'");
		jse.executeScript("document.getElementsByClassName('btn')[0].click()");
		String url=(String) jse.executeScript("return document.URL");
		if(url.equals("https://www.hyrtutorials.com/p/add-padding-to-containers.html?name=Janani&name=Sri+S")) {
			System.out.println("Registered Successfully");
		}
		else {
			System.out.println("Registeration Failed");
		}
		
		

	}

}
