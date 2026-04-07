package selenium_demo.selenium_java_new;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example11 {
    public static void main(String[] args)  {
    	ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);
        driver.findElement(By.xpath("//span[normalize-space()='Open']")).click();
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total Windows: " + allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Child Window URL: " + allWindows);
                System.out.println("Title: " + driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent: " + driver.getTitle());

        driver.quit();
    }
}
