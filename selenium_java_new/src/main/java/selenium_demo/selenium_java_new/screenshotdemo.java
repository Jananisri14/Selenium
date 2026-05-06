package selenium_demo.selenium_java_new;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class screenshotdemo {

    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\janan\\\\OneDrive\\\\Desktop\\\\Screenshots\\\\demoblaze.png");
        FileHandler.copy(src, dest);
        WebElement element = driver.findElement(By.xpath("//a[@id='nava']//img"));
        File src2 = element.getScreenshotAs(OutputType.FILE);
        File dest2= new File("C:\\Users\\janan\\OneDrive\\Desktop\\Screenshots\\logo.png");
        FileHandler.copy(src2, dest2);
        driver.quit();
    }
}