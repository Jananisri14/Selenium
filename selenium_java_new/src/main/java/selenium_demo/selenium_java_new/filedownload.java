package selenium_demo.selenium_java_new;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class filedownload {

	public static void main(String[] args) throws InterruptedException {

		String downloadFilepath = System.getProperty("user.dir")+ File.separator + "downloads";

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-extensions");

		Map<String, Object> prefs = new HashMap<>();

		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", downloadFilepath);
		prefs.put("download.prompt_for_download", false);

		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/upload-download");
		WebElement downloadLink =driver.findElement(By.id("downloadButton"));
		downloadLink.click();
		
		File downloadedFile = new File(downloadFilepath + File.separator + "sampleFile.jpeg");
		if (downloadedFile.exists()) {
			System.out.println("File downloaded successfully");
			}
		else {

			System.out.println("File not downloaded");

		}

		driver.quit();
	}
}