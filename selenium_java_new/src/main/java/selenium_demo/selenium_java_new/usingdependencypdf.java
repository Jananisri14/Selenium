package selenium_demo.selenium_java_new;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class usingdependencypdf {

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
		Thread.sleep(5000);
		File downloadedFile = new File(downloadFilepath + File.separator + "dummy.pdf");
		if (downloadedFile.exists()) {
			System.out.println("File downloaded successfully");
			} 
		else {

			System.out.println("File not downloaded");
			driver.quit();
			return;
		}

		PDDocument document = null;

		try {
			document = Loader.loadPDF(downloadedFile);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			String text = pdfStripper.getText(document);
			System.out.println("Text in PDF:");
			System.out.println(text);
			document.close();
			} catch (IOException e) {
				System.out.println("An error occurred while reading the PDF file");
				e.printStackTrace();
				}

		driver.quit();
	}
}