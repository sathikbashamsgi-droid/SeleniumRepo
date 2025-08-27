package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		         // Initialize ChromeDriver
				ChromeDriver driver = new ChromeDriver();
				
				// Load the URL
				driver.get("https://www.bigbasket.com/");
				
				// Maximize the browser window
				driver.manage().window().maximize();
				
				// Add an implicit wait to ensure the webpage elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Click on "Shop by Category"
				driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
				
				// Mouse over "Foodgrains, Oil & Masala"
				WebElement mouse = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
				Actions act = new Actions(driver);
				act.moveToElement(mouse).perform();
				
				// Mouse over "Rice & Rice Products"
				Thread.sleep(2000);
				WebElement RR = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
				act.moveToElement(RR).perform();
				
				
				// Click on "Boiled & Steam Rice"
				WebElement rice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
				act.moveToElement(rice).perform();
				driver.executeScript("arguments[0].click();",rice);
				
				// Filter the results by selecting the brand "bb Royal"
				WebElement bb=driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
				driver.executeScript("arguments[0].click();",bb);
				
				// Click on "Tamil Ponni Boiled Rice"
				WebElement ponni = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"));
				driver.executeScript("arguments[0].click();",ponni);
				
				// Select the 5 Kg bag
				Set<String> current = driver.getWindowHandles();
				List<String> window = new ArrayList<String>(current);
			    driver.switchTo().window(window.get(1));
				WebElement weight =driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]"));
				
				// Check and note the price of the rice
				WebElement price = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[4]"));
				System.out.println("Price of the rice bag is:"+price.getText());
				
				// Click "Add" to add the bag to your cart
				WebElement add = driver.findElement(By.xpath("//button[text()='Add to basket']"));
				driver.executeScript("arguments[0].click();",add);
				
				// Verify the success message that confirms the item was added to your cart
				WebElement message =driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']"));
				System.out.println(message.getText());
				
				// Close the current window
				driver.close();
				
				// Close the main window
				driver.switchTo().window(window.get(0));
				driver.close();
	}

}
