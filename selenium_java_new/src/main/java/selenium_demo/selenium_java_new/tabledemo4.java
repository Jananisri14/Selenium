package selenium_demo.selenium_java_new;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabledemo4 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int row=rows.size();
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']//th"));
		int column=cols.size();
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=column;c++) {
				WebElement data;
				if(r==1) {
					data=driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//th["+c+"]"));
				}
				else {
					data=driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//td["+c+"]"));
				}
				System.out.println(data);
			}
		}
		

	}

}
