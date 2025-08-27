package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		  // Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("https://www.snapdeal.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Go to "Men's Fashion"
		WebElement fashion = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		
		// Go to "Sports Shoes"
		/* freeze the DOM
		 * console: setTimeout(function(){debugger}, 5000); */
		
		WebElement shoes =driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		act.moveToElement(shoes).perform();
		driver.executeScript("arguments[0].click();",shoes);
		
		// Get the count of sports shoes
		WebElement count = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println("Total count of sports shoes are:"+count.getText());
		
		// Click on "Training Shoes"
		WebElement Training = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		act.moveToElement(Training).perform();
		driver.executeScript("arguments[0].click();",Training);
		
		// Sort the products by "Low to High"
		 driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		 WebElement lowhigh = driver.findElement(By.xpath("(//li[@class='search-li'])[1]"));
		 driver.executeScript("arguments[0].click();",lowhigh);
		 
		// Check if the displayed items are sorted correctly
		 WebElement sort = driver.findElement(By.xpath("//div[@class='sort-drop clearfix']"));
		 System.out.println(sort.getText());
		 
			/*
			 * List<WebElement> display =
			 * driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
			 * List<WebElement> element = new ArrayList<WebElement>(); for (WebElement
			 * webElement : display) { String print = webElement.getText();
			 * System.out.println(print); }
			 */
		
		// Select any price range ex:(500-700)
		 WebElement display = driver.findElement(By.xpath("//div[@class='filter-inner']"));
		 System.out.println("price range between:"+display.getText());
		 WebElement filter = driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']"));
		 driver.executeScript("arguments[0].click();",filter);
			/*
			 * WebElement drag = driver.findElement(By.xpath("//a[@style='left: 100%;']"));
			 * WebElement drop =
			 * driver.findElement(By.xpath("//a[@style='left: 7.14286%;']"));
			 * act.dragAndDrop(drag, drop).perform(); WebElement go = driver.findElement(By.
			 * xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']"));
			 * driver.executeScript("arguments[0].click();",go);
			 */
		// Filter by any colour
		 WebElement colour = driver.findElement(By.xpath("//label[@for='Color_s-White & Blue']"));
		 //act.scrollToElement(colour).perform();
		 driver.executeScript("arguments[0].click();",colour);
		 
		// Verify all the applied filters
		 WebElement filter2 = driver.findElement(By.xpath("//div[@class='filters']"));
		 System.out.println("Applied filters = "+filter2.getText()+",");
		 
		// Mouse hover on the first resulting "Training Shoes"
		 Thread.sleep(2000);
		 WebElement image = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		 Actions pic = new Actions(driver);
		 pic.moveToElement(image).perform();
		 
		 
		// Go to "first Shoe"
			/* freeze the DOM
			 * console: setTimeout(function(){debugger}, 5000); */
		
		// Click the "Quick View" button
		 Thread.sleep(2000);
		  WebElement view =driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
		  driver.executeScript("arguments[0].click();",view);
		 
		// Print the cost and the discount percentage
		
		 WebElement cost =driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		 System.out.println("price of the product is: "+cost.getText()); 
		 WebElement discount=driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		 System.out.println("total discount is: "+discount.getText());
		
		// Close the main window
		   driver.quit();
	}

}
