package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

		public static void main(String[] args) throws InterruptedException {
			
			// Initialize ChromeDriver
			ChromeDriver driver= new ChromeDriver();
			
			// Launch the URL. 
			driver.get("https://finance.yahoo.com/");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// Add an implicit wait to ensure the webpage elements are fully loaded
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			// Click on “Crypto” tab
			Actions act = new Actions(driver);
			WebElement crypto = driver.findElement(By.xpath("//span[text()='More']"));
			act.moveToElement(crypto).perform();
			
			// Locate the cryptocurrency names in the table using specific row and column
			WebElement currency = driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']"));
			act.moveToElement(currency).click().perform();
			
			// Use loop to iterate the cryptocurrency names
			Thread.sleep(2000);
			List<WebElement> currencyName = driver.findElements(By.xpath("//td[@class='leftAlignHeader companyName yf-7uw1qi']//div"));
			List<String> CryptoNam = new ArrayList<String>();
			for(WebElement name:currencyName) {
				CryptoNam.add(name.getText());
			}
			System.out.println("Crypto Names: " + CryptoNam );
		}
	}
