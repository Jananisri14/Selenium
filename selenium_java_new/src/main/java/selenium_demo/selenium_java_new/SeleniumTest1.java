package selenium_demo.selenium_java_new;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumTest1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		//Question 1
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login2")));
		driver.findElement(By.id("login2")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys("vithyamurugesan");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    
	    WebElement welcome=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        String welcometext=welcome.getText();
        if(welcometext.equals("Welcome vithyamurugesan")) {
        	System.out.println("Login sucessfull");
        }
        else {
        	System.out.println("Login failed");
        }
        
		 
		
		//Question 2 
	      Actions action = new Actions(driver);
	      WebElement laptops = driver.findElement(By.xpath("//a[text()='Laptops']"));
	      action.moveToElement(laptops).click().perform();
	      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[@class='card-title']/a")));
	      List<WebElement> items = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
	      List<String> itemlist = new ArrayList<>();
	      for (WebElement lap : items) {
	          itemlist.add(lap.getText());
	      }
	      Collections.sort(itemlist);
	      Set<String> itemset = new LinkedHashSet<>(itemlist);
	      System.out.println("Sorted Laptop List:");
	      for(String name : itemset) {
	          System.out.println(name);
	      }
	 
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MacBook Pro")));
	      WebElement macbook = driver.findElement(By.linkText("MacBook Pro"));

	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollIntoView(true);", macbook);

	      String productTitle = macbook.getText();
	      System.out.println("Found Laptop: " + productTitle);

		
	   //Question 3
	   wait.until(ExpectedConditions.elementToBeClickable(By.linkText("MacBook Pro"))).click();
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']"))).click();
	   wait.until(ExpectedConditions.alertIsPresent());
	   driver.switchTo().alert().accept();
	   System.out.println("Alert handled successfully.");

	   driver.findElement(By.id("cartur")).click();

	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]")));
	   String cartProduct = driver.findElement(By.xpath("//td[2]")).getText();
	   String cartPrice = driver.findElement(By.xpath("//td[3]")).getText();

	   if(cartProduct.equals("MacBook Pro")) {
	       System.out.println("Product added to cart");
	       System.out.println("MacBook Pro added to cart.");
	       System.out.println("Product: " + cartProduct);
	       System.out.println("Price: " + cartPrice);
	   } else {
	       System.out.println("Product not added correctly");
	   }


	   // Question 4
	   driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
	   driver.findElement(By.id("name")).sendKeys("Vithya");
	   driver.findElement(By.id("country")).sendKeys("India");
	   driver.findElement(By.id("city")).sendKeys("Bangalore");
	   driver.findElement(By.id("card")).sendKeys("1234567890123456");
	   driver.findElement(By.id("month")).sendKeys("04");
	   driver.findElement(By.id("year")).sendKeys("2026");
	   driver.findElement(By.xpath("//button[text()='Purchase']")).click();
	   WebElement purchaseText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sweet-alert  showSweetAlert visible']/p")));
	   String purchase = purchaseText.getText();
	   if (purchase.contains("Id")) {
	       System.out.println("Order is placed successfully");
	       System.out.println(purchase); 
	   } else {
	       System.out.println("Order is Unsuccessful");
	   }
	   driver.quit();
	   
	   	
	}
}