package selenium_demo.selenium_java_new;
import org.openqa.selenium.chrome.*;
public class Demo2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		String title=driver.getTitle();
		int len=title.length();
		System.out.println(title);
		System.out.println(len);
		String url=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
		int plen=pagesource.length();
		System.out.println(plen);
		driver.close();
	}

}
