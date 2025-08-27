package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Amazon_website_using_Actions_class {

	public static void main(String[] args) {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("https://www.amazon.in");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click the conitnue shopping button
		driver.findElement(By.className("a-button-text")).click();
		
		// Search for "oneplus 9 pro"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// Get the price of the first product
		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Price of product is :"+price.getText());
		
		// Print the number of customer ratings for the first displayed product
		WebElement ratings =  driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		System.out.println("Number of customer ratings are:"+ratings.getText());
		
		// Click the first text link of the first image;
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")).click();
		
		// Click the 'Add to Cart' button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		// Get the cart subtotal and verify if it is correct
		WebElement total = driver.findElement(By.xpath("//div[@id='sw-subtotal']"));
		System.out.print(total.getText());
		
	  // Close the browser
		driver.close();

	}

}
